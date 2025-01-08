package day12;

class bank{
	private String name;
	private double balance;
	
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
}
public class MainClass {
	public static void main(String[] args) {
		bank b1= new bank();
		b1.setName("irfaan");
		System.out.println("Employee name : "+(b1.getName()));
		
		b1.setBalance(500000);
		System.out.println("Employee Balance : "+(b1.getBalance()));
		
		bank b2=new bank();
		b2.setName("ashiek");
		System.out.println("Employee name : "+(b2.getName()));
		
		b2.setBalance(200000);
		System.out.println("Employee Balance : "+b2.getBalance());
	}

}
