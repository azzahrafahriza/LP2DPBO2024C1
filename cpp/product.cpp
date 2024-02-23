// import library
#include <iostream>
#include <string>
#include <list>
#include <vector>
#include <bits/stdc++.h>

// standard namespace
using namespace std;

// class product
class product{
private:
    string idProduct, nama, brand, price;

public:
    // constructor
    product()
    {
        this->idProduct = "-";
        this->brand = "-";
        this->nama = "-";
        this->price = "-";
    }
    // setter dan getter
    string getnama(){
        return this->nama;
    }
    string getidProduct(){
        return this->idProduct;
    }
    string getbrand(){
        return this->brand;
    }
    string getprice(){
        return this->price;
    }

    void setnama(string nama){
        this->nama = nama;
    }
    void setidProduct(string idProduct){
        this->idProduct = idProduct;
    }
    void setbrand(string brand){
        this->brand = brand;
    }
    void setprice(string price){
        this->price = price;
    }
    // destructor
    ~product(){
    }
};


// class clothing sebagai child dari product
class clothing : public product{

private:
    string size, material, gender;

public:
    // constructor
    clothing()
    {
        this->material = "-";
        this->size = "-";
        this->gender = "-";
    }
    // setter dan getter
    void setsize(string size){
        this->size = size;
    }
    void setmaterial(string material){
        this->material = material;
    }
    void setgender(string gender){
        this->gender = gender;
    }
    string getsize(){
        return this->size;
    }
    string getmaterial(){
        return this->material;
    }
    string getgender(){
        return this->gender;
    }
    // destructor
    ~clothing(){
    }
};

// class shirt sebagai child dari clothing
class shirt : public clothing
{
private:
    string color, sleeve;

public:
    // constructor
    shirt()
    {
        this->color = "-";
        this->sleeve = "-";
    }

    // setter dan getter
    void setcolor(string color)
    {
        this->color = color;
    }
    void setsleeve(string sleeve)
    {
        this->sleeve = sleeve;
    }
    
    string getcolor()
    {
        return this->color;
    }
    string getsleeve()
    {
        return this->sleeve;
    }
    // destructor
    ~shirt(){
    }
};