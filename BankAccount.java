package modle;

public class BankAccount {

	private double balance;
   
	public BankAccount(double balance) {
		
		this.balance = balance;// balance should be initial equal to zero
	}
	
	// get balance
	
	public double getBalance() {
		
		return balance;
	}
	
	// Deposit
	public double depositBalance(double ammount) {
		if(ammount <=0) {
			throw new IllegalArgumentException("Deposit amount must be positive");
		}else {
			
			return balance=balance+ammount;
		}
		
	}
	
	// withdrawal
	
	public double withdrawalAmmount(double ammount) {
		
	   if(ammount > balance) {
		   throw new IllegalArgumentException("Insuficcient Funds");
	   }else if(ammount <= 0) {
		   throw new IllegalArgumentException("Insuficcient Funds");
	   }else {
		   // perform withdrawal
		   
		   return balance -=ammount;
	   }
	}
	
}
