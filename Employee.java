import java.util.*;
public abstract class Employee {
	Scanner sc=new Scanner(System.in);
	int no;
	String name;
	public Employee() {
		no=0;
		name="Invalid";
	}	
}
class Regular extends Employee{
	double pay;
	void getdata() {
		System.out.println("Enter Serial no of employee");
		no=sc.nextInt();
		System.out.println("Enter Name of employee");
		name=sc.next();
		System.out.println("Enter regular pay of employee");
		pay=sc.nextDouble();
	}
}
class Over extends Regular{
	double over_pay;
	double tot_pay;
	void getdata() {
		super.getdata();
		System.out.println("Enter the Over time pay of employee");
		over_pay=sc.nextDouble();
		}
	void cal() {
		tot_pay=over_pay+pay;
		
		}
	void print() {
		if(over_pay>pay) {	
		System.out.println("****Detaile of Employee of earning more in overtime****");
		System.out.println();
		System.out.println("Serial no="+no+",Name="+name+"and total pay="+tot_pay);
		System.out.println("Regular pay="+pay+"and Overtime pay="+over_pay);
		System.out.println("Difference between pays are:"+(over_pay-pay));
		System.out.println();
		}
		else{
			System.out.println();
			System.out.print("No"+no+"\t");
			System.out.println("Empoyee do not earn much");
		}		
	}
}
class Work{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Over o[];
		int n;
		int i;
		System.out.println("Enter number of Employees");
		n=sc.nextInt();
		o=new Over[n];
		for(i=0;i<n;i++) {
			o[i]=new Over();
			System.out.println("Enter Details of Employee"+(i+1));
			o[i].getdata();
			o[i].cal();
		}
		for(i=0;i<n;i++) {
			o[i].print();
		}
	}
}