/* Student Name: Samarth Mathur
* Student ID: 	000-700-958
* NetID: smathur3
* Description: We are writing a program that asks for a username and password while ensuring the input for each value is correct 
*/

import java.util.Scanner;

class Conditions {
   public static void main(String[] args) {
      
      // declaring variables and initiate scanner to prompt user for the username

      String user, pass;
      Scanner s = new Scanner(System.in);
      System.out.print("Enter username: ");
      user = s.next(); 
     
     // using if statments and ! operator to determine whether correct user/pass are being inputted 
     
     if ( !user.equals("orange") ) {
         System.out.println( "Unknown user, '" + user + "'."); 
         s.close();
         return; 
      }
      System.out.print("Enter password: ");
      pass = s.next();
      s.close();
     if (!pass.equals("white")) {
        System.out.println("Incorrect password.");
        return;
     }

    
    // executed if both user and pass are correct
     else {
        System.out.println("Welcome!");
     }
      
   }
}
