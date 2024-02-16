public class Product {
    private String color;
    private String sleeve_type;

    public Product(){
        this.color = "";
        this.sleeve_type = "";
    }

    public void setcolor(String color){
        this.color = color;
    }
    public String getcolor() {
        return this.color;
    }

    public void setsleeve_type(String sleeve_type){
        this.sleeve_type = sleeve_type;
    }
    public String getsleeve_type() {
        return this.sleeve_type;
    }

}