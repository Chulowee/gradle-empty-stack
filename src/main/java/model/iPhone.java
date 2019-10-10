package model;

public class iPhone extends Mobile {
    private int limit = 10;
    @Override
    public String call(String message){
        if (message.length() >limit){
            return "<iPhone> Message cannot be sent";
        }
        return "<iPhone>Message : "+ message;
    }

}
