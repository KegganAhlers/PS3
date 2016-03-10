package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Account_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}
	@Test
	public void testAccount() {
		Account instance = new Account(1122, 20000.0);
		instance.setAnnualInterestRate(4.5);
		instance.deposit(3000.0);
		System.out.println("The balance is:" + instance.getBalance());
		System.out.println("The monthly interest is:" + instance.getMonthlyInterestRate());
		System.out.println("Creation Date:" + instance.getDateCreated());
		
	}
	public void testAccount2() throws InsufficientFundsException {
		Account instance2 = new Account(1122, 20000.0);
		instance2.setAnnualInterestRate(4.5);
		instance2.withdraw(2500.0);
		System.out.println("The balance is:" + instance2.getBalance());
		System.out.println("The monthly interest is:" + instance2.getMonthlyInterestRate());
		System.out.println("Creation Date:" + instance2.getDateCreated());
	}
	public void testAccount3() throws InsufficientFundsException {
		Account instance3 = new Account(1122, 20000.0);
		instance3.setAnnualInterestRate(4.5);
		instance3.withdraw(25000.0);
		System.out.println("The balance is:" + instance3.getBalance());
		System.out.println("The monthly interest is:" + instance3.getMonthlyInterestRate());
		System.out.println("Creation Date:" + instance3.getDateCreated());
	}

}
