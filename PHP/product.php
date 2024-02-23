<?php

// Definisi kelas Product
class product
{
	// Properti privat untuk idProduct, nama, brand, dan harga
	private $idProduct;
	private $nama;
	private $brand;
    private $harga;
	
	// Konstruktor kelas Product
	public function __construct(){
		// Menginisialisasi properti dengan nilai default
		$this->idProduct = "-";
		$this->nama = "-";
		$this->brand = "-";
        $this->harga = "-";
	}
	
	// Metode untuk mengatur nilai idProduct
	public function setidProduct($idProduct){
		$this->idProduct = $idProduct;
	}
	
	// Metode untuk mendapatkan nilai idProduct
	public function getidProduct(){
		return $this->idProduct;
	}
	
	// Metode untuk mengatur nilai nama
	public function setnama($nama){
		$this->nama = $nama;
	}
	
	// Metode untuk mendapatkan nilai nama
	public function getnama(){
		return $this->nama;
	}
	
	// Metode untuk mengatur nilai brand
	public function setbrand($brand){
		$this->brand = $brand;
	}
	
	// Metode untuk mendapatkan nilai brand
	public function getbrand(){
		return $this->brand;
	}
	
	// Metode untuk mengatur nilai harga
    public function setharga($harga){
		$this->harga = $harga;
	}
	
	// Metode untuk mendapatkan nilai harga
	public function getharga(){
		return $this->harga;
	}
}

?>
