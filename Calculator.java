package day8;

public class Calculator {
int firstnumber;
int secondnumber;

void add() {
System.out.println("Add : "+(firstnumber+secondnumber));
}
void sub() {
System.out.println("sub : "+(firstnumber-secondnumber));
}
void multiple() {
System.out.println("multiple : "+(firstnumber*secondnumber));
}
void divide() {
System.out.println("divide : "+(firstnumber/secondnumber));
}
void modul() {
System.out.println("modul: "+(firstnumber%secondnumber));
}
public static void main(String[] args) {
	Calculator cal1= new Calculator();
	cal1.firstnumber=10;
	cal1.secondnumber=20;
	cal1.add();
	cal1.sub();
	cal1.multiple();
	cal1.divide();
	cal1.modul();
	
}





}
