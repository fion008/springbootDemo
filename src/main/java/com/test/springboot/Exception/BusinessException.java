package com.test.springboot.Exception;


public class BusinessException extends RuntimeException {
    private int code;
    private String message;

    public BusinessException(int code, String message1) {
        super();
        this.code = code;
        this.message = message1;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
