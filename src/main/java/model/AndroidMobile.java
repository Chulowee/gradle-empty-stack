package model;

public class AndroidMobile extends Mobile {
    @Override
    public String call(String message){
        return "<Andriod>Message : "+ message;
    }
}
