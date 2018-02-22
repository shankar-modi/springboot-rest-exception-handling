package com.sk.learn.exceptionhandling.springexceptionhandling.exceptionhandler;

import org.springframework.http.HttpStatus;

/**
 * @author shankarmodi
 * 22/02/18
 */
public class UserNotFoundException extends RuntimeException{

    private String msg;
    private HttpStatus httpStatus;

    public UserNotFoundException(String msg) {
        super(msg);
        this.msg = msg;
    }


    public UserNotFoundException(Throwable cause, String msg) {
        super(msg, cause);
        this.msg = msg;
    }


}
