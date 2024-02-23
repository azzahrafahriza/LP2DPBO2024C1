# LP2DPBO2024C1
## Janji 
Saya Azzahra Fahriza Fitriani NIM 2102296 mengerjakan Latihan 2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Deskripsi tugas 
Buatlah program berbasis OOP menggunakan bahasa pemrograman C++, Java, Python, dan PHP yang mengimplementasikan konsep Multi-level Inheritance pada kelas - kelas tersebut:

Product: idProduct, name, brand, price
Clothing: size, material, gender
Shirt: color, sleeve_type

## Desain Program 
Desain Program dibagi menjadi 4 class yaitu product, clothing, shirt, dan proses. shirt merupakan chiild dari clothing dan clothing adalah child dari product. Alasan dari design tersebut adalah karena shirt adalah bagian dari clothing dan clothing adalah bagian dari product. Ketiga class tersebut bisa saling berhubungan inheritance karena tiap class merupakan objek yang sama yaitu product, memiliki atribut yang sama, dan ada atribut tambahan untuk setiap childnya.

### Desain algoritma menggunakan UML 
![image](https://github.com/azzahrafahriza/LP2DPBO2024C1/assets/101120742/c27a41d9-cc7a-4607-8ad2-1f9ae61386ad)

### Product
Terdapat 4 atribut pada kelas shrt dan juga method Setter dan Getter untuk tiap atribut

idProduct (string)
- Nama (string)
- Brand (string)
- Price (string)


### clothing(child dari class product)
Terdapat 3 atribut pada kelas Process dan juga method setter dan getter untuk tiap atribut

- size (string)
- material (string)
- gender (string)


### shirt (child dari class clothing)
Terdapat 2 atribut pada kelas Process dan juga method setter dan getter untuk tiap atribut

- color (string)
- sleeve type (string)

### Proses
Terdapat 2 Method pada kelas proses

Tambah -> Untuk menambahkan data ke dalam list
Tampil -> Untuk menampilkan data yang ada di dalam list
