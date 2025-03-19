/* Program Name: Penname
 * Student Name: Samarth Mathur
 * Net ID: smathur3
 * Student ID: STUDENT ID HERE (000-700-958)
 * Program Description: We are creating a program that allows an author to create a penname. We ask the user for a name, age, street number, street name, type and city they were born in.
 *w` Sources: Cite any instructors, students, or external resources you used here.
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
//  - gradescript command: python3.11 scripts/test.py penname.cpp

#include <iostream>
#include <string>

using namespace std;

int main() {
    // create variables for information we are prompting for
	
	string firstName, middleName, streetName, streetType, cOB;
	int age, streetNumber;

	// ask user for data based upon variables created
	
	cout << "Enter your first and middle names: ";
	cin >> firstName >> middleName;

	cout << "Enter your age: ";
	cin >> age;

	cout << "Enter your street number, name, and type: ";
	cin >> streetNumber >> streetName >> streetType;

	cout << "Enter your city of birth: ";
	cin >> cOB;
	cout << endl;
	
	// Modify data with calculations for user age and street number

	int newAge = (streetNumber % age) * 3;
	int newStreetNumber = (age * 425) / streetNumber;

	// print out new valuables for variables
	
	cout << "Your penname name is " << cOB << " " <<  streetName << "." << endl;
	cout << "You will write as a " << newAge << " year old." << endl;
	cout << "Your address is " << newStreetNumber << " " <<  middleName << " " << streetType << "."  << endl; 
    return 0;
}
