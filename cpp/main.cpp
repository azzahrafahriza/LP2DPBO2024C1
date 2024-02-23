#include <bits/stdc++.h>
#include "proses.cpp" // Including the implementation file directly is not recommended. Consider separating declaration and implementation.

using namespace std;

int main(){
	// Vector to store shirt objects
	vector<shirt> listshirt;
	
	// Creating and initializing shirt objects
	shirt shrt1;
	shrt1.setidProduct("123123"); // Setting attributes for the first shirt
	shrt1.setnama("Zahra");
	shrt1.setsize("S");
	shrt1.setgender("P");
	shrt1.setcolor("abcd");
	shrt1.setmaterial("UNIQL");
	shrt1.setsleeve("silk");
	shrt1.setprice("1000000");
	listshirt.push_back(shrt1); // Adding the first shirt to the vector

	shirt shrt2;
	shrt2.setidProduct("432123"); // Setting attributes for the second shirt
	shrt2.setnama("jara");
	shrt2.setsize("M");
	shrt2.setgender("P");
	shrt2.setcolor("white");
	shrt2.setmaterial("cutton");
	shrt2.setsleeve("apaya");
	shrt2.setprice("200000");
	listshirt.push_back(shrt2); // Adding the second shirt to the vector

	// Displaying information of each shirt
	for(int i=0; i<listshirt.size(); i++){
		cout << "====== shirt " << i+1 << " ======" << endl;
		cout << "id Product       : " << listshirt.at(i).getidProduct() << endl;
		cout << "nama             : " << listshirt.at(i).getnama() << endl;
		cout << "size             : " << listshirt.at(i).getsize() << endl;
		cout << "gender           : " << listshirt.at(i).getgender() << endl;
		cout << "color            : " << listshirt.at(i).getcolor() << endl;
		cout << "material         : " << listshirt.at(i).getmaterial() << endl;
		cout << "sleeve           : " << listshirt.at(i).getsleeve() << endl;
		cout << "harga            : " << listshirt.at(i).getprice() << endl;
		cout << endl << endl;
	}
	
	return 0;
}
