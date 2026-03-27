package com.api.clubhairproapi.Exceptions;

public class EmailError extends RuntimeException {
    public EmailError(String message) {
        super(message);
    }
}
