package com.traveler.util.exception;

/**
 * Created by yuzhou.xu on 7/19/17.
 */
public class TravelerException extends RuntimeException {

    public TravelerException(String message) {
        this(message, null);
    }

    public TravelerException(String message, Throwable e) {
        super(message, e);
    }
}
