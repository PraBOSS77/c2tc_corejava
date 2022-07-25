package c2tc.application;

import c2tc.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float wAmount) {
		System.out.println("You have withdrawn "+wAmount);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [CreditLimit()=" + creditLimit + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() +"]";
	}

}
