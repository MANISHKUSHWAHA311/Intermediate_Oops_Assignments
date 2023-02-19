package oopsAssignment;

import java.util.ArrayList;


 class CurrentAccount extends Assignment2Q3{
	 int totalDeposits = 10000;
	 int creditLimit = 2000;
	 @Override
	 public int getCash() {
		 return totalDeposits;
	 }
 }
 
 class SavingAccount extends Assignment2Q3{
	 int totalDeposits=10000;
	 int fixedDepositAmount=5000;
	 
	  @Override
	 public int getCash() {
		 return totalDeposits+fixedDepositAmount;
	 }
 }
 
	 public class Assignment2Q3 {
		 int accountCash=0;
		 public int totalCashInBank(ArrayList<Integer> cash) {
			 int totalCashInBank=0;
			 for(int tCash:cash) {
				 totalCashInBank+=tCash;
			 }
			 return totalCashInBank;
		 }
		 
		 public int getCash() {
			 return accountCash;
		 }
	 
		 
	 public static void main(String [] args) {
		 ArrayList <Integer> totalCashList = new ArrayList<Integer> ();
		 Assignment2Q3 b=new Assignment2Q3();
		 
		 Assignment2Q3 bank = new SavingAccount();
		 b.accountCash=bank.getCash();
		 
		 totalCashList.add(b.getCash());
		 
		 Assignment2Q3 bank1=new CurrentAccount();
		 b.accountCash=bank1.getCash();
		 totalCashList.add(b.getCash());
		 
		 System.out.println("TotalCashInBank " + b.totalCashInBank(totalCashList));
		 
	 }
 }
