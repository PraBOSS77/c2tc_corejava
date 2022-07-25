package c2tc.application;

import c2tc.framework.BankFactory;
import c2tc.framework.CurrentAcc;
import c2tc.framework.SavingAcc;

public class MMBankFactory implements BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(int acno, String acnm, float acbal) {
		SavingAcc sa=new SavingAcc(acno, acnm, acbal);
		return sa;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int acno, String acnm, float acbal) {
		CurrentAcc ca =new CurrentAcc(acno, acnm, acbal);
		return ca;
	}

}
