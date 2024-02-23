# from SivitasAkademik import SivitasAkademik
from shirt import shirt

shrt = []

shrt1 = shirt()
shrt1.setidProduct("123123123")	
shrt1.setnama("zahra")
shrt1.setsize('L')
shrt1.setgender("P")
shrt1.setsleeve("abcd")
shrt1.setbrand("UNIQL")
shrt1.setcolor("white")
shrt1.setmaterial("silk")
shrt1.setharga("10000000")
shrt.append(shrt1);

shrt2 = shirt()
shrt2.setidProduct("432123")
shrt2.setnama("Jara")
shrt2.setsize('L')
shrt2.setgender("P")
shrt2.setbrand("Stradivarius")
shrt2.setcolor("black")
shrt2.setmaterial("cutton")
shrt2.setharga("2000000")
shrt.append(shrt2)

shrt3 = shirt()
shrt3.setidProduct("5465132")
shrt3.setnama("Azzahra")
shrt3.setsize('S')
shrt3.setgender("P")
shrt3.setbrand("HNM")
shrt3.setcolor("black")
shrt3.setmaterial("wool")
shrt3.setharga("2452000")
shrt.append(shrt3)

for i in range(len(shrt)):
    
    print("====== shirt " + str(i+1) + " ======")
    print("ID               : " + shrt[i].getidProduct())
    print("Nama             : " + shrt[i].getnama())
    print("Ukuran           : " + shrt[i].getsize())
    print("Gender           : " + shrt[i].getgender())
    print("Sleeve           : " + shrt[i].getsleeve())
    print("Brand            : " + shrt[i].getbrand())
    print("Warna            : " + shrt[i].getcolor())
    print("Material         : " + shrt[i].getmaterial())
    print("Harga            : " + shrt[i].getharga())

    print()