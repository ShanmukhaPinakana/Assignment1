package com.assignment;

import java.util.Scanner;

public class BooleanToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the boolean value");
		boolean bln = sc.nextBoolean();
		String str = String.valueOf(bln);
		System.out.println(str);

	}

}
