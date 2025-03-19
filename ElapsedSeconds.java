/* Program Name: ElapsedSeconds 
 * Student Name: Samarth Mathur
 * Student ID: 	000-700-958
 * NetID: smathur3
 * Description: We are writing a program that asks our user a elapsed time in seconds. We need to have the output give us elapsed time in hours, minutes, and seconds.
*/
import java.util.Scanner;
class ElapsedSeconds {
   public static void main(String[] args) {
      int dataInSeconds, hours, minutes, seconds;

      Scanner s = new Scanner(System.in);

      // Prompt for the elapsed time in seconds to be used later to convert
      System.out.print("Enter the elapsed time in seconds: ");
      /* TODO: Use the Scanner to store the data entry in dataInSeconds */
      dataInSeconds = s.nextInt();
      s.close();

      // Calculate elapsed time in hours, minutes, and seconds
      hours =  dataInSeconds / 3600; /* TODO: Calculate. Must use mod and/or integer division only. */
      minutes = (dataInSeconds / 60) % 60; /* TODO: Calculate. Must use mod and/or integer division only. */
      seconds = dataInSeconds % 60;/* TODO: Calculate. Must use mod and/or integer division only.*/

      /* TODO: Output the data as "___ seconds is ___ hours, ___ minutes, ___ seconds."
         Use System.out.format OR System.out.println. See example for output.
      */

      System.out.format("%s seconds is %s hours, %s minutes, %s seconds.\n", dataInSeconds, hours, minutes, seconds);
     
    }
}