public class Shirt extends Clothing{
    private String idProduct;
    private String name;
    private String brand;
    private String price;

    public Shirt(){
        this.idProduct = "";
        this.name = "";
        this.brand = "";
        this.price = "";
    }

    public void setIdProduct(String idProduct){
        this.idProduct = idProduct;
    }
    public String getIdProduct() {
        return this.idProduct;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand() {
        return this.brand;
    }

    public void setPrice(String price){
        this.price = price;
    }
    public String getPrice() {
        return this.price;
    }

}
