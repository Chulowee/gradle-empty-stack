package model;

public class AndroidMobile extends Mobile {
    private int limit = 6;
    @Override
    public String call(String message){
        if (message.length()>=limit){
            return "<Andriod>Message cannot be sent";
        }
        return "<Andriod>Message : "+ message;
    }


}
