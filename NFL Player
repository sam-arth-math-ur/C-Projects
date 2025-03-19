#include <iostream>
#include <algorithm>
#include <iomanip>
using namespace std;

void calcPasserRating(){
	double a,b,c,d,passerRating;
	double att, cmp, yds, td, intc;
	string firstname, lastname;
	
	
	cout << "What is the player's first and last  name? ";
	cin >> firstname >> lastname;
	cout  << "Please enter passing attempts, completions, passing yards, ";
	cout << "touchdown passes, and intercpetions: :";
	cin >> att >> cmp >> yds >> td >> intc;

	// caluclate a, b, c, d
	 a = ((cmp/att) - 0.3) * 5;
	 a = min(2.375, a);
	 a = max(0.0,a);
	 
	 b = max(0.0, min(2.375, ((yds/att) - 3) * .25));

	 c = max(0.0, (td/att) * 20);
	 c = min(2.375,c);
	 c = max(0.0,c);

	 d	= 2.375 - (intc/att) * 25;
	 d = min(2.375, d);
	 d = max(0.0,d);

	 passerRating = (a + b + c + d) / 6 * 100;
	 cout << firstname << " " << lastname << "'s Passer Rating is " << passerRating << endl;
	 



}
   
int main(){
	 
	
	cout << fixed << setprecision(1);
	calcPasserRating();
	calcPasserRating();
	 
}
