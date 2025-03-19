/* Student Name: Samarth Mathur
* Student ID: 	000-700-958
* NetID: smathur3
* Program Name: forLoops
* Description: We ask the user values and then use them to calculate the sum or product of said values
*/

import java.util.Scanner;
class forloops {
   public static void main(String[] args) {
      String input;
      int n;
      double sum = 0.0;
      double product = 1.0;
      Scanner s = new Scanner(System.in);

     // We wrote a while statment to begin to state that as long as it's true the program will run
      while(true) {

             
      // We ask user for input: sum, product, quit, or state to retry
      System.out.print("Sum or product (type 'quit' to quit): ");
      input = s.next();
      if (input.equals("quit")) {
         break;
      }
      else if (!input.equals("sum") && !input.equals("product")) {
         System.out.println("Invalid operation, try again.");
         continue;
      }
      System.out.print("How many values? ");
      n = s.nextInt();
      if (input.equals("sum")) {
    
    //This for loop takes the input values from user and finds the sum rounded to 3 decimal digits
            for (int i = 0; i < n; i++){ 
                
                System.out.print("Enter value #" + i + ": ");
                double value = s.nextDouble();
                sum += value; 
                
            }

            System.out.printf("Sum = %.3f\n" , sum);
        
         
      }
      else {

    // This for loop takes the input values from user and finds the product rounded to 3 decimal digits
       for (int i = 0; i < n; i++){ 
            
            System.out.print("Enter value #" + i + ": ");
            double value = s.nextDouble();
            product *= value; 
            
        }

        System.out.printf("Sum = %.3f\n" , product);

      }
   }
      s.close();
   }
}
