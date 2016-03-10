package base;
import java.io.*;

public class InsufficientFundsException extends Exception {
	private double money;
	public InsufficientFundsException(double money){
		this.money = money;
		System.out.print("Insufficient Funds");	
	}
	public double getMoney(){
		return money;
	}

}
