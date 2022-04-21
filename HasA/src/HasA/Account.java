package HasA;

public class Account {
	String accountNum;

	public Account(String accountNum) {
		this.accountNum = accountNum;
	}

	@Override
	public String toString() {
		return "Account [accountNum=" + accountNum + "]";
	}
	
}
