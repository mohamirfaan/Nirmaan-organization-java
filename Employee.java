package day8;

public class Employee {
String  NAME;
int EMPID;
double SALARY;
long CONTACTNO;

public static void main(String []args) 
{
	Employee emp1= new Employee();
	Employee emp2= new Employee();
	Employee emp3= new Employee();
	Employee emp4= new Employee();
	Employee emp5= new Employee();
	
	emp1.NAME= "IRFAAN";
	emp1.EMPID= 1;
	emp1.SALARY= 20000;
	emp1.CONTACTNO= 8754514861l;
	
	emp2.NAME= "ASHIEK";
	emp2.EMPID= 2;
	emp2.SALARY= 25000;
	emp2.CONTACTNO= 9962903062l;
	
	
	emp3.NAME= "FARDEEN";
	emp3.EMPID= 3;
	emp3.SALARY= 10000;
	emp3.CONTACTNO= 8678687587l;
	
	
	emp4.NAME= "sukir";
	emp4.EMPID= 4;
	emp4.SALARY= 18000;
	emp4.CONTACTNO= 8876755657l;
	

	emp5.NAME= "sukir";
	emp5.EMPID= 5;
	emp5.SALARY= 22000;
	emp5.CONTACTNO= 9878766765l;
	
	System.out.println("Employee NAME :"+ emp1.NAME);
	System.out.println("Employee EMPID :"+ emp1.EMPID);
	System.out.println("Employee SALARY :"+emp1.SALARY);
	System.out.println("Employee CONTACTNO :"+emp1.CONTACTNO);
	
	
	
	
	
}



}
