#include <iostream>
#include <fstream>

using namespace std;

int main(){

	string firstName, lastName, teamName, playerPosition;
	int age, gamesPlayed, atBat, runs, hits, twoBase, threeBase, homeRun, runsBattedIn, stolenBase, caughtSteal, walkBB, strikeOut, SH, sacriiceSF, HBP;
	double AVG, OBP, SLG, OPS;
	
	ifstream fin;
	string fileName = "mlb-player-stats-Batters.txt";

	fin.open(fileName);
	
	if(!fin.is_open()) {
		cerr << "Could not open the file for reading input." << endl;
		return 1;
	}

	string line;
	getline(fin, line);
	cout << "My line was " << endl;
	cout << line << endl;

	
	fin >> firstName >> lastName >> teamName >> playerPosition >> age;
	fin >> gamesPlayed >> atBat >> runs >> hits >> twoBase >> threeBase >> homeRun >> runsBattedIN >> stolenBase >> caughtSteal >> walkBB >> strikeOut >> SH >> sacrificeSF >> HBP;
	fin >> AVG >> OBP >> SLG >> OPS;


	cout << "last stat was ops: " << ops << endl;






}

