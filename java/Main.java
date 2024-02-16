import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Proses pro = new Proses();// inisialisasi object proses
        ArrayList<Shirt> list = new ArrayList<>();// membuat list untuk tampungan
        Scanner sc = new Scanner(System.in);// untun input
        String idProduct, name, brand, size, gender, color, material, sleeve_type, price;// variabel tampungan input
        //meminta masukkan kepada user
        System.out.print("idProduct   :");
        idProduct = sc.next();
        System.out.print("name        :");
        name = sc.next();
        System.out.print("size        :");
        size = sc.next();
        System.out.print("brand       :");
        brand = sc.next();
        System.out.print("color       :");
        color = sc.next();
        System.out.print("sleeve_type :");
        sleeve_type = sc.next();
        System.out.print("gender      :");
        gender = sc.next();
        System.out.print("material    :");
        material = sc.next();
        System.out.print("price       :");
        price = sc.next();

        // memanggil method tambah untuk menambahkan data ke list
        pro.tambah(list, "1111111", "t-shirt", "L", "Zara", "black", "cap", "L", "Satin", "150025");
        pro.tambah(list, "2222222", "Sweater", "S", "HNM", "white", "bel", "L", "katun", "200000");
        pro.tambah(list, "3333333", "Jacket", "XL", "Uniqlo", "Pink", "poet", "L", "rajut", "520000");
        pro.tambah(list, "4444444", "shirt", "L", "Zara", "black", "puffed", "P", "Satin", "150025");
        pro.tambah(list, "5555555", "Sweater", "S", "HNM", "white", "cape", "L", "katun", "200000");
        pro.tambah(list, "6666666", "Jacket", "XL", "Uniqlo", "Pink", "cowl", "L", "rajut", "520000");
        pro.tambah( list,  idProduct,  name,  size,  brand,  color, sleeve_type,  gender,  material, price);
        // method untuk menampilkan
        pro.tampil(list);
    }

}