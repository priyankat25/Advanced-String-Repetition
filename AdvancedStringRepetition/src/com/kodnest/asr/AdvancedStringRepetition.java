package com.kodnest.asr;

import java.util.Scanner;

public class AdvancedStringRepetition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
	    int num = sc.nextInt();
	    String speChar = sc.next(); 
		String strRepetition = findStringRepetition(s, num, speChar);
		System.out.println("Repeated string: " + strRepetition);
	}

	public static String findStringRepetition(String s, int num, String speChar) {
		String str = "";
		for(int i=0; i<(num*2); i++) {
			if(i%2 == 0) {
				str = str + s;
			}
			else if((i%2 != 0) && (i != (num*2)-1)) {
				str = str + speChar;
			}
		}
		return str;
	}
}