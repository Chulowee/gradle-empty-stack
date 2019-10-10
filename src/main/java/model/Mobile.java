package model;

public abstract class Mobile {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String brand;

    public String call(String message) {
        return "Message : "+ message;
    }

    public String info(){
        return "name: "+ getName() + ", color: "+getColor()+", brand: "+getBrand();
    }
}
