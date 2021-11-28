# VisualCryptography
Visual Cryptography System for Cryptography Project

# Question
Write a program which provide secure login to the users based on visual cryptography concept. 
This is a concept of image secret sharing. A client image is divided into two shares and storing 
these shares, one in server side and one in client side, and finally merging these 2 shares and 
getting the decrypted image and then the user can login. You may opt any algorithm you 
learned in cryptography class to implement this concept.

# Solution
We implement XOR operation from the cryptography class to encrypt the user’s secret image 
with their key. If user’s matric number and password matches the system, they can proceed to 
enter the secret key and upload the secret image. User’s secret image is encrypted before 
sending it to the server. Then, login is successful after the image is decrypted by server.
