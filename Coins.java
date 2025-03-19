/* Program Name: Coin Change
 * Student Name: Samarth Mathur
 * Student ID: 	000-700-958
 * NetID: smathur3
 * Description: We are writing a program that asks our user for an amount of money in cents between 0-99 and to calculate the correct change
 */
import java.util.Scanner;
class Coins {
   public static void main(String[] args) {
     final int totalCoins, qValue, dValue, nValue, pValue;

      Scanner s = new Scanner(System.in);

      // Prompt for the amount of change to then be used for converting and sorting into respective coin amounts
      System.out.print("Enter the amount of change (0-99): ");
      totalCoins = s.nextInt();
      s.close();

      // Calculate quarters, dimes, nickels, and pennies
      qValue =  totalCoins / 25; /* TODO: Calculate. Must use mod and/or integer division only. */
      dValue = (totalCoins % 25) / 10; /* TODO: Calculate. Must use mod and/or integer division only. */
      nValue = totalCoins % 25 % 10 / 5;/* TODO: Calculate. Must use mod and/or integer division only.*/
      pValue = totalCoins % 25 % 10 % 5;
      

      System.out.format("Number of quarters: %d\nNumber of dimes %d\nNumber of nickels: %d\nNumber of pennies: %d\n", qValue, dValue, nValue, pValue);
     
    }
}