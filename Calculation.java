package com.java.exception1;

public class Calculation {
	public void show(int a , int b) throws NegativeException, NumberZeroException {
		if (a<0 || b<0) {
			throw new NegativeException("Negative number is not allowed ");
		}
		if (a==0 || b==0) {
			throw new NumberZeroException("Number Zero is not allowed ...");
		}
		else {
			int c = a+b;
			System.out.println("the sum of the two number is " + c);
		}
	}
	public static void main(String[] args) {
		int a ,b;
		a = 01 ;
		b = 01;
		Calculation obj = new Calculation();
		try {
			obj.show(a, b);
		}catch(NegativeException| NumberZeroException e) {
			e.printStackTrace();
//			System.out.println(e);
		}
		
	}

}
