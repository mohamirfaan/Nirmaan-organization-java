package day9;

import java.util.Scanner;

public class UI {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	Calculator calci=new Calculator();
	System.out.println("enter the first number :");
	int firstnum=sc.nextInt();
	System.out.println("enter the second number :");
	int secondnum=sc.nextInt();
	System.out.println("addition : " + calci.add(firstnum, secondnum));
	System.out.println("subtract : " + calci.sub(firstnum, secondnum));
	System.out.println("multiply : " + calci.multiply(firstnum, secondnum));
	System.out.println("divide : " + calci.divide(firstnum, secondnum));
	System.out.println("modulus : " + calci.modulus(firstnum, secondnum));

}
}
