package com.java.exception1;

public class VotingException extends Exception {
	VotingException(){
		
	}
	VotingException(String error){
		super(error);
	}

}
