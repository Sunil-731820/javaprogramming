package com.java.exception1;

public class Voting {
	public void show(int age ) throws VotingException {
		if (age<18) {
			throw new VotingException("you are not eligible for the vote");
		}else {
			System.out.println("You are eligible for the voting purpose ...");
		}
	}
	public static void main(String[] args) {
		int age ;
		age = 117;
		Voting obj = new Voting();
		try {
			obj.show(age);
		}catch(VotingException e){
//			e.printStackTrace();
			System.out.println(e);
		}
	}

}
