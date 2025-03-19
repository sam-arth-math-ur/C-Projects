/* Program Name: Penname
 * Program Description: We are creating a program that allows an author to create a penname. We ask the user for a name, age, street number, street name, type and city they were born in.
 */


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
