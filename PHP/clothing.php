<?php

class clothing extends product
{
	private $color;
	private $sleeve;
	
	public function __construct(){
		$this->color = "-";
		$this->sleeve = "-";
	}
	public function setcolor($color){
		$this->color = $color;
	}
	public function getcolor(){
		return $this->color;
	}
	public function setsleeve($sleeve){
		$this->sleeve = $sleeve;
	}
	public function getsleeve(){
		return $this->sleeve;
	}
}
?>