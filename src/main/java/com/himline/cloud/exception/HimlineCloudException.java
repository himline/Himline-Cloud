package com.himline.cloud.exception;

public class HimlineCloudException extends Exception {
	
	public HimlineCloudException(String message) {
        super(message);
    }

    public HimlineCloudException(String message, Throwable throwable) {
        super(message, throwable);
    }
}

