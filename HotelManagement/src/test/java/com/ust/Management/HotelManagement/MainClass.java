package com.ust.Management.HotelManagement;

import java.util.Scanner;

public class MainClass {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		HotelTest ht = new HotelTest();

		int k = 0;
		do {
			System.out.println("1:Menu Card");
			System.out.println("2:Order Food");
			System.out.println("3:Edit Food");
			System.out.println("4:Bill");
			System.out.println("Choose the list");
			int i = Integer.parseInt(sc.nextLine());

			switch (i) {
			case 1:
				ht.showAll();
				break;
			case 2:
				ht.toOrder();
				break;
			case 3: {

				System.out.println("Add Food");
				System.out.println("update Food");
				System.out.println("Remove Food");
				System.out.println("Choose the opreattions");
				int j = Integer.parseInt(sc.nextLine());

				switch (j) {
				case 1:
					ht.addFood();
					break;
				case 2:
					ht.updateFood();
					break;
				case 3:
					ht.deleteFood();
					break;

				}
				break;
			}
			case 4:
				ht.totalBill();
				break;
			}
			System.out.println("do you want to continue:(0/1)");
			k = Integer.parseInt(sc.nextLine());
		} while (k == 1);
	}

}
