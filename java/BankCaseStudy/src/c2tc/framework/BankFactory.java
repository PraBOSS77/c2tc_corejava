package c2tc.framework;

public interface BankFactory {
	public SavingAcc getNewSavingAccount(int acno, String acnm, float acbal);
	public CurrentAcc getNewCurrentAccount(int acno, String acnm, float acbal);

}
