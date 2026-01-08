package com.problemsloving;

public class divisior {

	public static void main(String[] args) {
		int n=12;
		int div=1;
		while(div<=n/2) {
			if(n%div==0) {
				System.out.println(div+ " ");
			}
			div++;
		}

	}

}