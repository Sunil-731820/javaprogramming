package com.java.exception1;

public class Email {
	public void show(String email) throws EmailException {
		if (email.length()<8 && email.length()>16) {
			throw new EmailException("InvalidUserException ...");
		}
		else if(email.length()==1) {
		System.out.println("@ parts code is not done by me ");	
		}
		else {
			System.out.println("email is valid ");
		}
	}
	public static void main(String[] args) {
		String email = "l.com";
		Email obj = new Email();
		try {
			obj.show(email);
		}catch(EmailException e ) {
			e.printStackTrace();
		}
	}

}
