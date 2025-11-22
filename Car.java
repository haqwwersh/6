public class Car{
    private int id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private float cost;
    private String reg;

    public Car(int id, String brand, String model, int year, String color, float cost, String reg){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.cost = cost;
        this.reg = reg;
    }
    public int getId() { return id; };
    public void setId(int id) {this.id = id; };

    public String getBrand() { return brand; };
    public void setBrand(String brand) {this.brand = brand; };

    public String getModel() { return model; };
    public void setModel(String model) {this.model = model; };

    public int getYear() { return year; };
    public void setYear(int year) {this.year = year; };

    public String getColor() { return color; };
    public void setColor(String color) {this.color = color; };

    public float getCost() { return cost; };
    public void setCost(float cost) {this.cost = cost; };

    public String getReg() { return reg; };
    public void setReg(String reg) {this.reg = reg; };
}