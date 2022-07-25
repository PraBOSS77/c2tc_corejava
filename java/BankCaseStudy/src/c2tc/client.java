package c2tc;

import java.util.*;
import c2tc.application.MMBankFactory;
import c2tc.application.MMCurrentAcc;
import c2tc.application.MMSavingAcc;
import c2tc.framework.BankFactory;
import c2tc.framework.CurrentAcc;
import c2tc.framework.SavingAcc;

public class client {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Kindly enter your account number");
		int acno=sc.nextInt();
		System.out.println("Kindly enter your full name");
		sc.next();
		String acnm=sc.nextLine();
		System.out.println("kindly confirm yoour balance");
		float acbal=sc.nextFloat();
		System.out.println("kindly sselect your account type");
		System.out.println("Press 1 for Saving Account and 2 for Current Account");
		int c=sc.nextInt();
		BankFactory bf=new MMBankFactory();
		switch (c) {
		case 1: 
			SavingAcc sa= new MMSavingAcc(acno,acnm,acbal);
			sa.withdraw(0);
			break;
		case 2: 
			CurrentAcc ca=new MMCurrentAcc(acno,acnm,acbal);
			ca.withdraw(0);
			break;
		default:
			System.out.println("kindly choose from 1 or 2");
		}
		
	}

}
