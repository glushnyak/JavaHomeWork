package com.pb.glushnyak.hw8;

public class WrongPasswordException extends Exception {

    public WrongPasswordException() {
    }

    public WrongPasswordException(String uuu) {
        super(uuu);
    }
}
