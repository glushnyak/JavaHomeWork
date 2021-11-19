package com.pb.glushnyak.hw8;

public class WrongLoginException extends Exception{

    public WrongLoginException() {
    }

    public WrongLoginException(String uuu) {
        super(uuu);
    }
}
