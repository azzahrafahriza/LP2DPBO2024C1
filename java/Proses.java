import java.util.ArrayList;
import java.util.Scanner;

public class Proses {
    //method untuk menambah data ke dalam list
    public void tambah(ArrayList<Shirt> list, String idProduct, String name, String size, String brand, String color,
            String sleeve_type, String gender, String material, String price) {
        //mengset data
        Shirt Shirt = new Shirt();
        Shirt.setIdProduct(idProduct);
        Shirt.setName(name);
        Shirt.setsize(size);
        Shirt.setBrand(brand);
        Shirt.setcolor(color);
        Shirt.setsleeve_type(sleeve_type);
        Shirt.setgender(gender);
        Shirt.setmaterial(material);
        Shirt.setPrice(price);
        //add object ke dalam list
        list.add(Shirt);
    }

    //method untuk menampilkan data di dalam list menggunakan for loop
    public void tampil(ArrayList<Shirt> list) {
        
        int i = 0;
		if(list.size() == 0){
			System.out.println("Data tidak ada");
		}else{
			int maxid = 9, maxnama = 4, maxsize =4, maxgender = 6, maxsleeve =11, maxbrand= 5, maxcolor = 5, maxmaterial=8, maxprice =5;
			for( i=0;i<list.size();i++){
				if(list.get(i).getIdProduct().length()>maxid){
					maxid = list.get(i).getIdProduct().length();
				}
				if(list.get(i).getName().length()>maxnama){
					maxnama = list.get(i).getName().length();
				}
				if(list.get(i).getsize().length()>maxsize){
					maxsize = list.get(i).getsize().length();
				}
				if(list.get(i).getgender().length()>maxgender){
					maxgender = list.get(i).getgender().length();
				}
				if(list.get(i).getsleeve_type().length()>maxsleeve){
					maxsleeve = list.get(i).getsleeve_type().length();
				}
				if(list.get(i).getBrand().length()>maxbrand){
					maxbrand = list.get(i).getBrand().length();
				}
				if(list.get(i).getcolor().length()>maxcolor){
					maxcolor = list.get(i).getcolor().length();
				}
				if(list.get(i).getmaterial().length()>maxmaterial){
					maxmaterial = list.get(i).getmaterial().length();
				}
				if(list.get(i).getPrice().length()>maxprice){
					maxprice = list.get(i).getPrice().length();
				}
			}

			for(int j=0;j<( maxid + maxnama + maxsize +maxgender + maxsleeve + maxbrand+ maxcolor + maxmaterial+maxprice +28);j++)System.out.print("-");
			System.out.println();

			System.out.print("| idProduct");
			for(int j=9;j<maxid;j++)System.out.print(" ");
			System.out.print(" | Nama");
			for(int j=4;j<maxnama;j++)System.out.print(" ");
			System.out.print(" | Size");
			for(int j=4;j<maxsize;j++)System.out.print(" ");
			System.out.print(" | Gender");
			for(int j=6;j<maxgender;j++)System.out.print(" ");
			System.out.print(" | TypeSleeve");
			for(int j=10;j<maxsleeve;j++)System.out.print(" ");
			System.out.print(" | Brand");
			for(int j=5;j<maxbrand;j++)System.out.print(" ");
			System.out.print(" | Color");
			for(int j=5;j<maxcolor;j++)System.out.print(" ");
			System.out.print(" | Materia;");
			for(int j=8;j<maxmaterial;j++)System.out.print(" ");
			System.out.print(" | price");
			for(int j=5;j<maxprice;j++)System.out.print(" ");
			System.out.println(" |");
			for(int j=0;j<( maxid + maxnama + maxsize +maxgender + maxsleeve + maxbrand+ maxcolor + maxmaterial+maxprice +28);j++)System.out.print("-");
			System.out.println();
			

			for( i=0;i<list.size();i++){
                System.out.print("| "+list.get(i).getIdProduct());
				for(int j=list.get(i).getIdProduct().length();j<maxid;j++)System.out.print(" ");
				System.out.print(" | "+list.get(i).getName());
				for(int j=list.get(i).getName().length();j<maxnama;j++)System.out.print(" ");
				System.out.print(" | "+list.get(i).getsize());
				for(int j=list.get(i).getsize().length();j<maxsize;j++)System.out.print(" ");
				System.out.print(" | "+list.get(i).getgender());
				for(int j=list.get(i).getgender().length();j<maxgender;j++)System.out.print(" ");
				System.out.print(" | "+list.get(i).getsleeve_type());
				for(int j=list.get(i).getsleeve_type().length();j<maxsleeve;j++)System.out.print(" ");
				System.out.print(" | "+list.get(i).getBrand());
				for(int j=list.get(i).getBrand().length();j<maxbrand;j++)System.out.print(" ");
				System.out.print(" | "+list.get(i).getcolor());
				for(int j=list.get(i).getcolor().length();j<maxcolor;j++)System.out.print(" ");
				System.out.print(" | "+list.get(i).getmaterial());
				for(int j=list.get(i).getmaterial().length();j<maxmaterial;j++)System.out.print(" ");
				System.out.print(" | "+list.get(i).getPrice());
				for(int j=list.get(i).getPrice().length();j<maxprice;j++)System.out.print(" ");
				System.out.println(" |");
				// System.out.println();
				for(int j=0;j<( maxid + maxnama + maxsize +maxgender + maxsleeve + maxbrand+ maxcolor + maxmaterial+maxprice +28);j++)System.out.print("-");
			System.out.println();
			}
		}
	}
}