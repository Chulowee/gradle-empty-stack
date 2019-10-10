package model;

public class iPhone extends Mobile {
    @Override
    public String call(String message){
        return "<iPhone>Message : "+ message;
    }
}
