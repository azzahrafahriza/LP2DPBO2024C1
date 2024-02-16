public class Clothing extends Product{
    private String size;
    private String material;
    private String gender;

    public Clothing(){
        this.size = "";
        this.material = "";
        this.gender = "";
    }

    public void setsize(String size){
        this.size = size;
    }
    public String getsize() {
        return this.size;
    }

    public void setmaterial(String material){
        this.material = material;
    }
    public String getmaterial() {
        return this.material;
    }

    public void setgender(String gender){
        this.gender = gender;
    }
    public String getgender() {
        return this.gender;
    }
}
