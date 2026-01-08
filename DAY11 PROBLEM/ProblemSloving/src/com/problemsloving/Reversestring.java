package com.problemsloving;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int rev=0;
		while(num>0) {
			int digits=num%10;
			rev=rev*10+digits;
			num=num/10;
		}
		System.out.println(rev);

	}

}
