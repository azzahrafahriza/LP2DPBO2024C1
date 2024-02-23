# Import kelas product dari modul product
from product import product

# Definisi kelas Clothing yang merupakan turunan dari kelas Product
class clothing(product):
    # Konstruktor kelas Clothing dengan nilai default untuk size, material, dan gender
    def __init__(self, size="-", material="-", gender='-'):
        # Inisialisasi properti dengan nilai default atau nilai yang diberikan
        self.__size = size
        self.__material = material
        self.__gender = gender
    
    # Metode untuk mengatur nilai material
    def setmaterial(self, material):
        self.__material = material

    # Metode untuk mendapatkan nilai material
    def getmaterial(self):
        return self.__material

    # Metode untuk mengatur nilai size
    def setsize(self, size):
        self.__size = size

    # Metode untuk mendapatkan nilai size
    def getsize(self):
        return self.__size
	
    # Metode untuk mengatur nilai gender
    def setgender(self, gender):
        self.__gender = gender
	
    # Metode untuk mendapatkan nilai gender
    def getgender(self):
        return self.__gender
