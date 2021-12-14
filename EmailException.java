package com.java.exception1;

public class EmailException extends Exception {
	EmailException(){
		
	}
	EmailException(String error){
		super(error);
	}

}
