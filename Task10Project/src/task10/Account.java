package task10;

public class Account {

private int balance;
	
	public Account() {
		
		
	}
	
	public Account(int balance) {
		this.balance = balance;
	}
public int withdrawmoney(int withdrawmoney) {
	return balance= balance-withdrawmoney;
}
public int depositbalance(int depositbalance) {
	return balance= balance+depositbalance;
}	

public static void main(String[] args) {
		Account ac= new Account(1000);
		System.out.println(ac.withdrawmoney(500));
		System.out.println(ac.depositbalance(1200));
}
}