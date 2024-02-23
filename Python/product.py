class product:
    def __init__(self, idProduct="-", brand="-", nama='-', harga='-',):
        # Constructor method to initialize idProduct, brand, nama, and harga attributes
        self.__idProduct = idProduct
        self.__brand = brand
        self.__nama = nama
        self.__harga = harga
    
    def setbrand(self, brand):
        # Method to set the brand attribute
        self.__brand = brand

    def getbrand(self):
        # Method to get the value of the brand attribute
        return self.__brand

    def setidProduct(self, idProduct):
        # Method to set the idProduct attribute
        self.__idProduct = idProduct

    def getidProduct(self):
        # Method to get the value of the idProduct attribute
        return self.__idProduct
	
    def setnama(self, nama):
        # Method to set the nama attribute
        self.__nama = nama
	
    def getnama(self):
        # Method to get the value of the nama attribute
        return self.__nama
    
    def setharga(self, harga):
        # Method to set the harga attribute
        self.__harga = harga
	
    def getharga(self):
        # Method to get the value of the harga attribute
        return self.__harga
