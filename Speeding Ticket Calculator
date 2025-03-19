/* Program Name: Speeding Ticket Calculator
 * Program Description: We are to write and develop a speeding ticket fee calculator. We are to ask the user for a ticket file which is produced by a central police database which will then output a file.
 */


#include <fstream>
#include <iomanip>
#include <iostream>
#include <string>

using namespace std;


const string THREE_LETTER_MONTHS[] = {
	"Jan", "Feb", "Mar", "Apr", "May", "Jun",
	"Jul", "Aug", "Sep", "Oct", "Nov", "Dec",
};

// intitalize multiplier variables
const double INTERSTATE_MULTIPLIER = 5.2243 /* TODO */;
const double HIGHWAY_MULTIPLIER = 9.4312 /* TODO */;
const double RESIDENTIAL_MULTIPLIER = 17.2537 /* TODO */;
const double DEFAULT_MULTIPLIER = 12.916 /* TODO */;

int serializeDate(const int year, const int month, const int day) {
	int newYear = year;
		if (newYear < 100) {
		  newYear += 2000;
		}
	int serialDate = (newYear * 10000) + (month * 100) + day;



	return serialDate;
}

int main() {
	
	// intitialize all string, int, double, char variables used

	string input_filepath, output_filepath, citation_num;
	int startMonth, startDay, startYear;
	int endMonth, endDay, endYear;
	int currentMonth, currentDay, currentYear;
	int serializeStartDate, serializeEndDate, serializeCurrentDate;
	int  month, day, year, clockedSpeed, speedLimit;
	double fineAmount;
	char typeRoad;




	cout << "Enter a ticket file: ";
	cin >> input_filepath; 

	// opens file and error checks to see if the input file opened
	ifstream fin(input_filepath);

	if(!fin.is_open()) {
		cerr << "Unable to open " << input_filepath << "."  << endl;
		return 1;
	}



	cout << "Enter a report file: ";
	cin >> output_filepath;
	
	// error checks to see if the output file can be opened
	ofstream fout(output_filepath);

	if(!fout.is_open()) {
		cerr <<  "Unable to open " << output_filepath << "."  << endl;
		return 1;
	}

	// serializes start and end dates
	cout <<  "Enter report start date (mm dd yyyy): ";
	cin >> startMonth >> startDay >> startYear;

	cout << "Enter report end date   (mm dd yyyy): ";
	cin >> endMonth >> endDay >> endYear;

	serializeStartDate = serializeDate(startYear, startMonth, startDay);
	serializeEndDate = serializeDate(endYear, endMonth, endDay);
	
	// loop to run through provided data in input file
	while(fin >> citation_num >> month >> day >> year >> clockedSpeed >> speedLimit >> typeRoad) {
		
		// determines fee multiplier accoridng to the appropriate road type
		switch (typeRoad) {
			case 'i': 
			case 'I':
				fineAmount = (clockedSpeed - speedLimit) * INTERSTATE_MULTIPLIER;
				break;
			case 'r':
			case 'R':
				fineAmount = (clockedSpeed - speedLimit) * RESIDENTIAL_MULTIPLIER;
				break;
			case 'h':
			case 'H':
				fineAmount = (clockedSpeed - speedLimit) * HIGHWAY_MULTIPLIER;
				break;
			default:
				fineAmount = (clockedSpeed - speedLimit) * DEFAULT_MULTIPLIER;
				break;
		}

		
		// prints and formats output file
		serializeCurrentDate = serializeDate(year, month, day);
	
		// helps with making the year into the 21st century if it is a two digit number
		if (year < 100){
			year += 2000;
		}
		
		// if fee is negative, initalizes it to 0
		if (fineAmount < 0) {
			fineAmount = 0;
		}

		// keeps currentDate serialization between start and end dates
		if (serializeStartDate <= serializeCurrentDate && serializeCurrentDate <= serializeEndDate) {
			
		// prints and formats output file
		fout << setfill('0') << setw(2) << day <<  "-" << setw(2) << THREE_LETTER_MONTHS[month - 1] << "-" << year << setfill(' ') <<  " " << left << setw(10) << citation_num << " $" << fixed << setprecision(2) << right << setw(9) << fineAmount << endl; 
		}
	}
	
	fin.close();
	fout.close();

	return 0;
}
