package com.decagon.Week8.excetptions;

public class NotFoundException extends RuntimeException {

    private  String message;

    public NotFoundException(){
        super("Not found");
        this.message="Not found";
    };
    public NotFoundException(String msg){
        super(msg);
        this.message=msg;
    }

}

