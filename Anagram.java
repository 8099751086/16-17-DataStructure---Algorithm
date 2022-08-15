package com.datastructureandalgo;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
	static String st1, st2;

	public static void main(String[] args) {

		Scanner my_scanner = new Scanner(System.in);

		System.out.print("Enter the first string : ");
		st1 = my_scanner.nextLine();
		System.out.print("Enter the second string : ");
		st2 = my_scanner.nextLine();
		st1 = st1.toLowerCase();
		st2 = st2.toLowerCase();
		if (st1.length() == st2.length()) {
			char[] array1 = st1.toCharArray();
			char[] array2 = st2.toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			boolean my_result = Arrays.equals(array1, array2);
			if (my_result) {
				System.out.println("The strings " + st1 + " and " + st2 + " are anagram.");
			}
		} else {
			System.out.println("The strings " + st1 + " and " + st2 + " are not anagram.");
		}
	}
}
