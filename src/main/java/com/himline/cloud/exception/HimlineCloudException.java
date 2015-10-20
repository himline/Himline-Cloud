package com.himline.cloud.exception;

public class HimlineCloudException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 780311630004345064L;

	public HimlineCloudException(String message) {
        super(message);
    }

    public HimlineCloudException(String message, Throwable throwable) {
        super(message, throwable);
    }
}

