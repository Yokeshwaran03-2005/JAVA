package com.problemsloving;

import java.util.Scanner;

public class Codingoncodechef {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine();
		
		String[] words=sentence.split(" ");
		for(String word : words) {
			System.out.println(word + "-" +word.length());
		}
		System.out.println(sentence + "-" +sentence.length());
		sc.close();
		

	}

}
