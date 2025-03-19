import java.util.Scanner;
class AdvancedCalc {
   public static void main(String[] args) {
      
   // declaring variables and initiate scanner to prompt user for values

      int left, right, result;
      String opt;
      
      Scanner s = new Scanner(System.in);

      System.out.print("Enter <left> <op> <right>: ");
      left = s.nextInt();
      opt = s.next();
      right = s.nextInt();
      
      s.close();

      //declaring cases for each operator and creating esulting print systems

      switch(opt) {

         case "+": 
            result = left + right;
            System.out.println(left +  " + " + right + " = " + result);
            break;
         case "-":
            result = left - right;
            System.out.println(left +  " - " + right + " = " + result);
            break;
         case "*":
            result = left * right;
             System.out.println(left +  " * " + right + " = " + result);
            break;
         case "/":
            result = left / right;
            System.out.println(left +  " / " + right + " = " + result);
            break;
         case "%":
            result = left % right;
            System.out.println(left +  " % " + right + " = " + result);
            break;
         case "^":
            result = (int) Math.pow(left, right);
            System.out.println(left +  " ^ " + right + " = " + result);
            break;
         
         //incase there is an invalid operator inputed, there's a corresponding print statment recieved to user
        
         default:
            System.out.println("Invalid operator!");
            break;


      }

   }
}