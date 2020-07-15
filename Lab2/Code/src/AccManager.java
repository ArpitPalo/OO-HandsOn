public class AccManager {
	public void fillAccountData(Account a1) {
	
	//Complete the statements
		String accNumber,name;
		double balance;
		System.out.println("Enter Details");
		
		System.out.print("Enter Account number:");
		accNumber = Console.readLine();
		
		System.out.print("Enter Name :");
		name = Console.readLine();
		
		System.out.print("Enter Balance : ");
		balance = Console.readDouble();
		
		a1.setAccNo(accNumber);
		a1.setName(name);
		a1.setBalance(balance);
		

	}
	public void displayAccountData(Account a1) {
		System.out.println("AccNo : " + a1.getAccNo());
		System.out.println("Name : " + a1.getName());
		System.out.println("Balance : " + a1.getBalance());
	}
}
