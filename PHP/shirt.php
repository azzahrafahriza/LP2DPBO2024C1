<?php

// Definisi kelas Shirt yang merupakan turunan dari Clothing
class shirt extends clothing
{
	// Properti privat untuk size, material, dan gender
	private $size;
	private $material;
	private $gender;
	
	// Konstruktor kelas Shirt
	public function __construct(){
		// Menginisialisasi properti dengan nilai default
		$this->size = "-";
		$this->material = "-";
		$this->gender = "-";
	}
	
	// Metode untuk mengatur nilai size
	public function setsize($size){
		$this->size = $size;
	}
	
	// Metode untuk mendapatkan nilai size
	public function getsize(){
		return $this->size;
	}
	
	// Metode untuk mengatur nilai material
	public function setmaterial($material){
		$this->material = $material;
	}
	
	// Metode untuk mendapatkan nilai material
	public function getmaterial(){
		return $this->material;
	}
	
	// Metode untuk mengatur nilai gender
	public function setgender($gender){
		$this->gender = $gender;
	}
	
	// Metode untuk mendapatkan nilai gender
	public function getgender(){
		return $this->gender;
	}

}
?>
