package ShopVendor;

import java.util.Scanner;

public class VendorCustomer {

	public static void main(String[] args) {
		int total_amount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many items you want to purchase ");
		int no_of_items=sc.nextInt();
		if(no_of_items<=0) {
			System.out.print("Purchase atleast 1 or more item to proceed ");
			no_of_items=sc.nextInt();
		}
		int[] arr = new int[no_of_items];
		String[] sarr = new String[no_of_items];
		for (int i = 0; i < no_of_items; i++) {
			System.out.print("Enter item name ");
			sarr[i] = sc.next();
			System.out.print("Enter item price ");
			int j = sc.nextInt();
			if (j > 0) {
				arr[i] = j;
			} else {
				System.out.print("Item price cannot be 0, Enter more than 0 ");
				arr[i] = sc.nextInt();
			}
			total_amount = total_amount + arr[i];
		}
		
		System.out.print("Total amount for " + arr.length + " items are " + total_amount +"\n");
		
		System.out.print("Amount given to the Vendor ");
		int cus_amount = sc.nextInt();
		
		if (cus_amount < total_amount) {  
			System.out.print("You need to give " + (total_amount - cus_amount) + " more for the items purchased");
			cus_amount += sc.nextInt();
		} 
		
		int change = cus_amount - total_amount;
		System.out.println("Change rendered to the customer is " + change);
		int num_of_notes = 0;
		num_of_notes = changeToBeGiven(change, num_of_notes);   //calling the method which calculates the number of coins
		System.out.println("minimum number of coins - " + num_of_notes);
		
	}

	public static int changeToBeGiven(int change, int num_of_notes) {
		while (change > 0) {
			if (change >= 5000) {
				num_of_notes += change / 5000;   //this division operator is used to store how many number for the same coins  
				System.out.println(change / 5000 + " * " + 5000 + " = " + ((change / 5000) * 5000));
				change = change % 5000;  //the remainder is used to calculate how many more coins we need for the remaining amount
			} else if (change >= 1000) {
				num_of_notes += change / 1000;
				System.out.println(change / 1000 + " * " + 1000 + " = " + ((change / 1000) * 1000));
				change = change % 1000;
			} else if (change >= 500) {
				num_of_notes += change / 500;
				System.out.println(change / 500 + " * " + 500 + " = " + ((change / 500) * 500));
				change = change % 500;
			} else if (change >= 200) {
				num_of_notes += change / 200;
				System.out.println(change / 200 + " * " + 200 + " = " + ((change / 200) * 200));
				change = change % 200;
			} else if (change >= 100) {
				num_of_notes += change / 100;
				System.out.println(change / 100 + " * " + 100 + " = " + ((change / 100) * 100));
				change = change % 100;
			} else if (change >= 50) {
				num_of_notes += change / 50;
				System.out.println(change / 50 + " * " + 50 + " = " + ((change / 50) * 50));
				change = change % 50;
			} else if (change >= 20) {
				num_of_notes += change / 20;
				System.out.println(change / 20 + " * " + 20 + " = " + ((change / 20) * 20));
				change = change % 20;
			} else if (change >= 10) {
				num_of_notes += change / 10;
				System.out.println(change / 10 + " * " + 10 + " = " + ((change / 10) * 10));
				change = change % 10;
			} else if (change >= 5) {
				num_of_notes += change / 5;
				System.out.println(change / 5 + " * " + 5 + " = " + ((change / 5) * 5));
				change = change % 5;
			} else if (change >= 2) {
				num_of_notes += change / 2;
				System.out.println(change / 2 + " * " + 2 + " = " + ((change / 2) * 2));
				change = change % 2;
			} else {
				num_of_notes += change / 1;
				System.out.println(change / 1 + " * " + 1 + " = " + ((change / 1) * 1));
				change = change % 1;
			}
		}
		return num_of_notes;
	}
}
