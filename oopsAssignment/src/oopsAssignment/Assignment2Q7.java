package oopsAssignment;

import java.util.Scanner;

abstract class desertItem{
	abstract public int getCost();
	abstract public int addCandy();
	abstract public int addCookie();
	abstract public int addIce();
	
}

public class Assignment2Q7 extends desertItem{
	public int getCost() {
		return 0;
	}
	
	public int addCandy() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the how much candy do you want to add");
		int candy=sc.nextInt();
		System.out.println("Candy add " + candy);
		return 0;
	}
	
	public int addCookie() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the how much cookie do you want to add");
		int cookie=sc.nextInt();
		System.out.println("Cookie add " + cookie);
		return 0;
	}
	
	public int addIce() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the how much Ice do you want to add");
		int ice=sc.nextInt();
		System.out.println("ice add " + ice);
		return 0;
	}
	
	public static void main(String [] args) {
		Assignment2Q7 A1=new Assignment2Q7();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your role customer or owner");
		String s = sc.nextLine();
		System.out.println("Select 1 for seller and Select 2 for Buyer");
		int num=sc.nextInt();
		
		
		if(num==1) {
			A1.addCandy();
			A1.addCookie();
			A1.addIce();
		}
		else if (num==2) {
			System.out.println("Enter how much item you want to purchase");
			int n=sc.nextInt();
			System.out.println("Enter how much candy buy ");
			int candy = sc.nextInt();
			System.out.println("Enter how much cookie buy ");
			int cookie = sc.nextInt();
			System.out.println("Enter how much ice buy ");
			int ice = sc.nextInt();
			int a1=10;
			int a2=20;
			int a3=30;
			System.out.println("The cost of 1 candy : " + a1);

			System.out.println("The cost of 1 cookie : "+a2);
			
			System.out.println("The cost of 1 ice : "+a3);
			
			int s1= 60 * (a1*candy);   // 1 dollar = 60 Rupees
			int s2= 70 * (a2*cookie);  // 1 euro = 70 Rupees
			int s3= a3*ice;
			int total = s1+s2+s3;
			
			System.out.println("Total cost = " + total);
		
		}
	}

}
