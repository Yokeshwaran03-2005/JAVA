package com.problemsloving;

public class commondivisorofgivennumber {
	public static void main(String[] args) {
		int a=12;
		int b=18;
		int min;
		if(a<b) {
			min=a;
		}else {
			min=b;
		}

		for (int i = 1; i <= min/2; i++) {
		    if (a % i == 0 && b % i == 0) {
		        System.out.println(i);
	}

}
}
}