/* Program Name: Take Home Pay Calculator
 * Student Name: Samarth Mathur
 * Net ID: smathur3
 * Student ID: STUDENT ID HERE (000-700-958)
 * Program Description: Create a program that allows the user to enter in an annual job salary and then output infomration about taxes, post-tax salary, and your monthly take home pay.
 * Sources: Student - Dhruv Patel, Ryan (TA) 
 *	 - -Cite any instructors, students, or external resources you used here.
 *   - Do not directly copy code from any source:
 *     other students, Stack Overflow, ChatGPT, etc.
 *   - Do not include code in your solution you do not understand or cannot
 *     explain.
 *   - We check plagiarism for similarities and irregularities.
 */

//! Remember: your comments
//! Remember: your formatting and indentation
//  - auto-format in vim with gg=G in normal mode, in vscode with alt+shift+f
//! Remember: check your solution with the gradescripts
//  - gradescript command: python3.11 scripts/test.py tax.cpp

#include <iomanip> 
#include <iostream>

using namespace std;


// declaring global constant variables as doubles for brackets and rates
const double MINIMUM_WAGE = 15080;
const double BRACKET2 = 11600;
const double BRACKET3 = 47150;
const double BRACKET4 = 100525;
const double BRACKET5 = 191950;
const double BRACKET6 = 243725;
const double BRACKET7 = 609350;

const double RATE1 = 0.10;
const double RATE2 = 0.12;
const double RATE3 = 0.22;
const double RATE4 = 0.24;
const double RATE5 = 0.32;
const double RATE6 = 0.35;
const double RATE7 = 0.37;

//prompt user for a salary dollar amount

int main() {
    double salary;
    cout << "Enter a salary: $";
    cin >> salary;
	double yearlySalary = salary;

    // Handles error if user inputs amount lower than minimum wage
   
	if (salary < MINIMUM_WAGE) {
        cerr << "This is less than minimum wage for a yearly salary." << endl;
        return 1; // exit with an error, non-zero exit code means error
    }

    //  Calculating income tax from the given salary

	double incomeTax = 0;

	if (yearlySalary > BRACKET7) {
		incomeTax += ((yearlySalary - BRACKET7) * RATE7);
		yearlySalary = BRACKET7;
	}

	if (yearlySalary > BRACKET6) {
		incomeTax += ((yearlySalary - BRACKET6) * RATE6);
		yearlySalary = BRACKET6;
	}
	
	if (yearlySalary > BRACKET5) {
		incomeTax += ((yearlySalary - BRACKET5) * RATE5);
		yearlySalary = BRACKET5;
	}
	
	if (yearlySalary > BRACKET4) {
		incomeTax += ((yearlySalary - BRACKET4) * RATE4);
		yearlySalary = BRACKET4;

	}

	
	if (yearlySalary > BRACKET3) {
		incomeTax += ((yearlySalary - BRACKET3) * RATE3);
		yearlySalary = BRACKET3;

	}
	
	if (yearlySalary >  BRACKET2) {
		incomeTax += ((yearlySalary - BRACKET2) * RATE2);	
		yearlySalary = BRACKET2;
	}
	
	

	incomeTax += (BRACKET2 * RATE1);
	
	
	// calculate social security and medicare tax
	
	double socialSecurityTax = salary * .062;
	double medicareTax = salary * .0145;

	// calculate take home and monthly take home salary

	double takeHomeSalary = salary - (incomeTax + socialSecurityTax + medicareTax); 
	double monthlyTakeHomePay = takeHomeSalary / 12;

	// prints out 1 line of 35 dashes
	
	for (int i = 0; i < 35; i++) {
		cout << "-";
		
	}
	
	cout << endl;
  
	// set rounding to two decimals places for variables
	
    cout << fixed << setprecision(2);

    // Prints out computed data for each type of tax with corrected formatting
	
    cout << left << setw(25) << "Yearly Salary: ";
    cout << right << "$" <<  setw(9) << salary << endl;
   
	cout << left << setw(25) << "Social Security Tax: ";
    cout << right << "$" <<  setw(9) << socialSecurityTax << endl;
	
	cout << left << setw(25) << "Medicare Tax: ";
    cout << right << "$" <<  setw(9) <<  medicareTax << endl;
	
	cout << left << setw(25) << "Income Tax: ";
	cout << right << "$" <<  setw(9) << incomeTax << endl;
	
	for (int i = 0; i < 35; i++) {
		cout << "-";
		
	}

	cout << endl;

	// prints total computed take home and monthly take home salaries with correct formatting

	cout << left << setw(25) << "Take Home Salary: ";
	cout << right << "$" <<  setw(9) << takeHomeSalary << endl;
	
	cout << left << setw(25) << "Monthly Take Home Pay: ";
	cout << right << "$" <<  setw(9) << monthlyTakeHomePay << endl;

	return 0;
}

