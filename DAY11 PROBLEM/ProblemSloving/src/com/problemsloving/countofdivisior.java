package com.problemsloving;

public class countofdivisior {
	public static void main(String[] args) {
		int n=7;
		int div=1;
		int count=0;
		while(div<=n) {
			if(n%div==0) {
				count++;
			}
			div++;
		}
		System.out.println(count);
		
	}

}
