package com.api.clubhairproapi.Exceptions;

public class CpfError extends RuntimeException{
    public CpfError(String error){
        super(error);
    }
}
