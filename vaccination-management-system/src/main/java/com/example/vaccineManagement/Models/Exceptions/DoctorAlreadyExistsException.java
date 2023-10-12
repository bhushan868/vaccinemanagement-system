package com.example.vaccineManagement.Models.Exceptions;

public class DoctorAlreadyExistsException extends Exception{

    public DoctorAlreadyExistsException(String message){
        super(message);
    }

}
