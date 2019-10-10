package model;

public class iPhone extends Mobile {
    private int limit = 6;
    @Override
    public String call(String message){
        if (message.length() >12){
            return "<iPhone> Message cannot be sent";
        }
        return "<iPhone>Message : "+ message;
    }

}
