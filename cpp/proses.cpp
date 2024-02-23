#include<string>
#include <iostream>
#include <vector>
#include "product.cpp"
using namespace std;

class proses
{
    private:
		vector<shirt> shrt;
    public:
        // construcotr
        proses(){
        }
        // method untuk menambah data
       void tambah(list<shirt> *llist, string idProduct, string nama, string size, string gender, string color, string material, string price){
            shirt mhs;
            mhs.setidProduct(idProduct);
            mhs.setnama(nama);
            mhs.setsize(size);
            mhs.setgender(gender);
            mhs.setcolor(color);
            mhs.setmaterial(material);
            mhs.setprice(price);
            (*llist).push_back(mhs);
        }
        // method untuk menampilkan data
        void tampil(list<shirt> llist)
        {
            int i = 1;
            for (list<shirt>::iterator it = llist.begin(); it != llist.end(); it++)
            {
                cout << "=================================";
                cout << "\nData ke " << (i);
                cout << "\nID          : " + it->getidProduct();
                cout << "\nNama        : " + it->getnama();
                cout << "\nSize        : " + it->getsize();
                cout << "\nGender      : " + it->getgender();
                cout << "\nColor       : " + it->getcolor();
                cout << "\nMaterial    : " + it->getmaterial();
                cout << "\nPrice       : " + it->getprice();
                i++;
            }
        }
            
        /// destructor
        ~proses()
        {
        }
    };