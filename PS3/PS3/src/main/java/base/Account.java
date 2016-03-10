package base;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	Account(){
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	public double withdraw(double withdraw) throws InsufficientFundsException {
		if (withdraw <= getBalance()) {
			setBalance(balance - withdraw);
			return getBalance();
		}
		else {
			double money = withdraw - getBalance();
			throw new InsufficientFundsException(money);
			
		}

		
	}
	public double deposit(double deposit){
		setBalance(balance + deposit);
		return getBalance();
	}

}
