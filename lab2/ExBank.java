import java.util.Scanner;

public class Ex3_2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String name, number;
		double balance;
		int choice;
		BankAccount acc1 = 

		switch (choice)
		{
			case 1:

		}
	}
	public class BankAccount
	{
		private String name;
		private String number;
		private double balance;

		// setters
		public void setName(String name)
		{
			this.name = name;
		}
		public void setNumber(String number)
		{
			this.number = number;
		}
		public void setBalance(String balance)
		{
			this.balance = balance;
		}

		// getters
		public String getName()
		{
			return (name);
		}
		public String getBalance()
		{
			return (balance);
		}
		public double getBalance()
		{
			return (balance);
		}

		public BankAccount(String name, String number, double balance)
		{
			setName(name);
			setNumber(number);
			setBalance(balance);
		}

		public void deposit(double amount)
		{
			if (amount < 0)
			{
				System.out.println("Error: Can't deposit a negative value");
				return
			}
			setBalance(getBalance() + amount);
		}

		public void withdraw(double amount)
		{
			if (amount > this.balance)
			{
				System.out.println("Error: Can't withdraw more than current balance");
				System.out.printf("Current Balance: %.2f", getBalance());
				return
			}
			setBalance(getBalance() - amount);
		}
	}
}
