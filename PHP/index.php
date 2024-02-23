<?php
// Mengimpor kelas yang diperlukan
require('product.php');
require('clothing.php');
require('shirt.php');

// Membuat array kosong untuk menyimpan objek shirt
$listshrt = array();

// Membuat objek shirt pertama
$shrt1 = new shirt();
$shrt1->setidProduct("2103303");					//menambahkan data shirt pertama
$shrt1->setnama("jara");
$shrt1->setbrand("lacoste");
$shrt1->setsize("S");
$shrt1->setgender("P");
$shrt1->setcolor("black");
$shrt1->setmaterial("cutton");
$shrt1->setsleeve("abcd");
$shrt1->setharga("1000000");
$listshrt[]=$shrt1; // Menambahkan objek shirt pertama ke dalam array

// Membuat objek shirt kedua
$shrt2 = new shirt();
$shrt2->setidProduct("432123");					//menambahkan data shirt kedua
$shrt2->setnama("Zara");
$shrt2->setbrand("zara");
$shrt2->setsize("M");
$shrt2->setgender("P");
$shrt2->setcolor("White");
$shrt2->setmaterial("silk");
$shrt2->setsleeve("efgh");
$shrt2->setharga("20000");
$listshrt[] = $shrt2; // Menambahkan objek shirt kedua ke dalam array

// Menampilkan data dalam bentuk tabel
echo "<table border = '1'>";
echo "<tr>";
echo "<td> idProduct </td>";
echo "<td> Nama </td>";
echo "<td> Brand </td>";
echo "<td> Size </td>";
echo "<td> Gender </td>";
echo "<td> Warna </td>";
echo "<td> Material </td>";
echo "<td> Jenis Sleeve </td>";
echo "<td> Harga </td>";
echo "</tr>";

// Melakukan iterasi melalui array untuk menampilkan data setiap objek shirt
foreach ($listshrt as $shirt) {
	echo "<tr>";
	echo "<td>" .  $shirt->getidProduct() . "</td>";
	echo "<td>" .  $shirt->getnama() . "</td>";
	echo "<td>" .  $shirt->getbrand() . "</td>";
	echo "<td>" .  $shirt->getsize() . "</td>";
	echo "<td>" .  $shirt->getgender() . "</td>";
	echo "<td>" .  $shirt->getcolor() . "</td>";
	echo "<td>" .  $shirt->getmaterial() . "</td>";
	echo "<td>" .  $shirt->getsleeve() . "</td>";
    echo "<td>" .  $shirt->getharga() . "</td>";
    
	echo "</tr>";
}
echo "</table>";

?>
