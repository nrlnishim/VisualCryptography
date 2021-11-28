//Group Tartpher (MSC 2)

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner; 

public class VisualCryptography {

    public static void operate(int key)
    {

        JFileChooser fileChooser=new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file=fileChooser.getSelectedFile();
        //file FileInputStream
        try
        {
            //Selecting an image for encryption or decryption operation
            FileInputStream fis=new FileInputStream(file);

            //Convert image into byte array by creating an array with the same size as image size (byte)
            byte []data=new byte[fis.available()];

            //Read the array
            fis.read(data);
            int i=0;

            //Perform XOR operation between key and each value of byte array. With that, every value of image will change.
            //The bigger the file size, the longer it takes to encrypt image
            for(byte b:data)
            {
                System.out.println(b);
                data[i]=(byte)(b^key);
                i++;
            }

            //Opening a file for writing purpose
            FileOutputStream fos=new FileOutputStream(file);
            
            //Writing new byte array value to image to encrypt it. 
            fos.write(data);

            //Closing file
            fos.close();
            fis.close();
            JOptionPane.showMessageDialog(null, "Done encrypt/decrypt.");

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Matric Number: "); 
        int matricnum = sc.nextInt();

        Scanner sc2 = new Scanner(System.in); 
        System.out.print("Enter Password: "); 
        int password2 = sc2.nextInt();

        if (matricnum == 1180457 && password2 == 1234) //User 1
        {
        System.out.println("Login to your account by entering your SECRET KEY and upload SECRET IMAGE.");
        JFrame f=new JFrame();
        f.setTitle("Image Secret Sharing");
        f.setSize(400,400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font=new Font("Roboto",Font.BOLD,25);

        JButton button=new JButton();
        button.setText("Open Secret Image");
        button.setFont(font);

        //Text field to add key for encrypt and decrypt the image
        JTextField textField=new JTextField(10);
        textField.setFont(font);
        
        button.addActionListener(e->{
            System.out.println("Button clicked");
            String text=textField.getText();
            int temp=Integer.parseInt(text);
            operate(temp);
        });

        f.setLayout(new FlowLayout());

        f.add(button);
        f.add(textField);
        f.setVisible(true);
        }

        else if (matricnum == 1180472 && password2 == 5678) //User 2
        {
        System.out.println("Login to your account by entering your SECRET KEY and upload SECRET IMAGE.");
        JFrame f=new JFrame();
        f.setTitle("Image Secret Sharing");
        f.setSize(400,400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font=new Font("Roboto",Font.BOLD,25);

        JButton button=new JButton();
        button.setText("Open Secret Image");
        button.setFont(font);

        //Text field to add key for encrypt and decrypt the image
        JTextField textField=new JTextField(10);
        textField.setFont(font);
        
        button.addActionListener(e->{
            System.out.println("Button clicked");
            String text=textField.getText();
            int temp=Integer.parseInt(text);
            operate(temp);
        });

        f.setLayout(new FlowLayout());

        f.add(button);
        f.add(textField);
        f.setVisible(true);
        }
        else
        {
            System.out.println("Wrong matric number/password! Login attempt unsuccessful.");
        }
    }
}