/* Program Name: Welcome 
 * Student Name: Samarth Mathur
 * Student ID: 	000-700-958
 * NetID: smathur3
 * Description: We are writing a program that asks the user for their first and last name. Then, take the first and last name and print a greeting.
*/
import java.util.Scanner;
class Welcome {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        Scanner s = new Scanner(System.in);
        System.out.print("What is your first name? ");
        firstName = s.next();
        System.out.print("What is your last name? ");   
        // TODO: Prompt the user for their last name as shown in the example
        lastName = s.next();
        System.out.println("Hi " + firstName + "!" + " I hope the " + lastName + " family is well!");
        // TODO: Print the output as shown in the example, substituing the given names
        s.close();
        
    }
}