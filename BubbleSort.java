package com.datastructureandalgo;

import java.util.Scanner;

public class BubbleSort {
	int a[] = new int[5];

	void getdata() {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {

			System.out.println("Enter the numbers: ");
			a[i] = sc.nextInt();

		}
	}

	void putData() {
		int i;
		for (i = 0; i < 5; i++)
			System.out.println(a[i]);
	}

	void sort() {

		int i, j, t;

		for (i = 0; i < 5; i++)
			for (j = 0; j < 4 - i; j++) {
				if (a[j] > a[j + 1]) {
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
	}

	public static void main(String ars[]) {

		BubbleSort bs = new BubbleSort();
		bs.getdata();
		System.out.println("Unsorted Array : ");
		bs.putData();
		bs.sort();
		System.out.println("Sorted Array : ");
		bs.putData();

	}
}
