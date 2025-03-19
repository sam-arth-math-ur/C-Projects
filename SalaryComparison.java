/* Program Name: SalaryComparison 
 * Student Name: Samarth Mathur
 * Student ID: 	000-700-958
 * NetID: smathur3
 * Description: We are writing a program that takes two jobs salaries (prior to tax) and compares their monthly take home pay and budgets for needs/wants/savings
*/


import java.util.Scanner;

class SalaryComparison {
    public static void main(String[] args) {
        
        int salaryInput1, salaryInput2;
        
        Scanner s = new Scanner(System.in);
        /* Prompting the user for a value for both salaries */
        System.out.print("Enter the salary for the first job (no commas): $");
        
        salaryInput1 = s.nextInt();
        System.out.print("Enter the salary for the second job (no commas): $");
        
        salaryInput2 = s.nextInt();
        s.close();

        /* Initialzing methods with int values from salaryInput and then calculateTHP based on those salaries  */
       
       Budget job1 = new Budget(salaryInput1);
       Budget job2 = new Budget(salaryInput2);
       job1.calculateTHP();
       job2.calculateTHP();


        /* Calculates Monthly Take Home Salary and the budget based on job 1 */
      
        double needs, wants, savings;
        needs = job1.calculateBudgetCategory(50);
        wants = job1.calculateBudgetCategory(30);
        savings = job1.calculateBudgetCategory(20);
        System.out.format("Monthly Take Home Salary for Job 1: $%.2f\n", job1.getMonthlyTakeHomePay());
        System.out.format("By the 50/30/20 Budget, spend up to $%.2f on needs (Food, shelter, etc)\n", needs);
        System.out.format("                        spend up to $%.2f on wants (Hobbies, travel, etc)\n", wants);
        System.out.format("                        and up to   $%.2f on savings (retirement, emergency fund)\n", savings);

        /* Calculates Monthly Take Home Salary and the budget based on job 2 */
        
        needs = job2.calculateBudgetCategory(50);
        wants = job2.calculateBudgetCategory(30);
        savings = job2.calculateBudgetCategory(20);
        System.out.format("Monthly Take Home Salary for Job 2: $%.2f\n", job2.getMonthlyTakeHomePay());
        System.out.format("By the 50/30/20 Budget, spend up to $%.2f on needs (Food, shelter, etc)\n", needs);
        System.out.format("                        spend up to $%.2f on wants (Hobbies, travel, etc)\n", wants);
        System.out.format("                        and up to   $%.2f on savings (retirement, emergency fund)\n", savings);
    }
}