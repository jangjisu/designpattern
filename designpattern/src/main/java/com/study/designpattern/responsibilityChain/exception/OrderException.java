package com.study.designpattern.responsibilityChain.exception;

public class OrderException extends RuntimeException{
    public OrderException(String message) {
        super(message);
    }
}
