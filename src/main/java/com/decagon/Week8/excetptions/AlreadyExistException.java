package com.decagon.Week8.excetptions;

public class AlreadyExistException extends RuntimeException {

    private  String message;

    public AlreadyExistException(){
        super("Already exist");
        this.message="Already exist";
    };
    public AlreadyExistException(String msg){
        super(msg);
        this.message=msg;
    }

}

