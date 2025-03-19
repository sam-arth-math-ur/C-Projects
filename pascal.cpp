#include <iostream>
#include <vector>
using namespace std;

//typedef
typedef int Elmo;
typedef double Bob;
// typedef vector of integers called iVec
typedef vector <int> iVec;

int main() {
	
	// pascals triangle is a 2D vector
	//vector < vector < int > > pascal;
	vector < iVec > pascal;

	int num_rows;

	//Elmo number = 3;
	//BOb number2 = 3.6;

	cout << "Number of rows: ";
	cin >> num_rows; 

	// create the correct number of rows
	pascal.resize(num_rows);
	// all the rwos are empty
	
	// loop through all rows of pascal
	// we have "num_rows" number of rows
	for (int i = 0; i < pascal.size(); i++) {
			//we are in a row
			for(int j=0; j <i+1; j++) {
				// create a cell and  add it to the row
				
				// if (easy cell) {push back 1's} 
				// else { (hard cell) pushback something else}

				//easy cells
				// j == 0 is poor form( fails code review)

				if	( 0==j || j == i) {
					pascal.at(i).push_back(1);
				}
				else {
					//harder cell
					int left_cell = pascal.at(i-1).at(j-1);
					int right_cell = pascal.at(i-1).at(j);
					// add the shum left + right
					pascal.at(i).push_back(left_cell + right_cell);
				} // end of else

		} // end of creating cells loop(j)

	} // end of rows loop (i)

	//print
	// double for loop
	
	for ( int i =0; i < pascal.size(); i++) {
		//in a row
		for (int j=0; j < pascal.at(i).size(); j++){
			// at a cell
			cout << pascal.at(i).at(j) << " ";
		}

		cout << endl;
	}
	return 0;

}


