package model;

public class Person{
    private Mobile phone;

    private String name;

    public void setPhone(Mobile phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String makeCall(){
        return phone.call(name + " called");
    }

}
