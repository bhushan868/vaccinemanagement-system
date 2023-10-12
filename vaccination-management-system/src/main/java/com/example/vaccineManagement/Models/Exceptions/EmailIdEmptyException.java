package com.example.vaccineManagement.Models.Exceptions;

public class EmailIdEmptyException extends Exception{

    //Constructor
    public EmailIdEmptyException(String message){
        super(message);
    }
}
