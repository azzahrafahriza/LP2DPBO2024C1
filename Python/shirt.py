from clothing import clothing

class shirt(clothing):
    def __init__(self, color="-", sleeve="-"):
        # Constructor method to initialize color and sleeve attributes
        self.__color = color
        self.__sleeve = sleeve
    
    def setsleeve(self, sleeve):
        # Method to set the sleeve attribute
        self.__sleeve = sleeve

    def getsleeve(self):
        # Method to get the value of the sleeve attribute
        return self.__sleeve

    def setcolor(self, color):
        # Method to set the color attribute
        self.__color = color

    def getcolor(self):
        # Method to get the value of the color attribute
        return self.__color
