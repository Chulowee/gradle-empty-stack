package model;

public class iPhoneRobot {
    private iPhone phone;

    public void setiPhone(iPhone phone) {
        this.phone = phone;
    }

    public String makeCall(){
        return phone.call("Robot call");
    }
}
