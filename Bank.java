import java.util.*;
public class Bank {
Scanner sc=new Scanner(System.in);
String acno,name;
double bal;
Bank(){
	System.out.println("Enter ACCNO");
	acno=sc.next();
	System.out.println("Enter Name and balence");
	name=sc.next();
	bal=sc.nextDouble();
	try {
		check_bal(bal);
	}
	catch(BalException e) {
		System.out.println(e);
		System.exit(0);
	}
	print(bal);
}
void dep() {
	double dep;
	System.out.println("Enter amount to be deposited");
	dep=sc.nextDouble();
	bal=bal+dep;
	try {
		check_bal(bal);
	}
	catch(BalException e) {
		System.out.println(e);
		System.exit(0);
	}
	print(bal);
}
void withdraw() {
	double draw;
	System.out.println("Enter amount to be withdrawn");
	draw=sc.nextDouble();
	bal=bal-draw;
	try {
		check_bal(bal);
	}
	catch(BalException e) {
		System.out.println(e);
		System.exit(0);
	}
	print(bal);
}
void check_bal(double bal) throws BalException{
	if(bal<2000)
		throw new BalException("Balance lss than 2000");
}
void print(double bal) {
	System.out.println("Balance="+bal);
}
}

class BalException extends Exception{
	String d;
	BalException(String s){
		d=s;
	}
	public String toString() {
		return d;
	}
}
class Account{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank();
		int ch,j=1;
		while(j!=0) {
		System.out.println("Enter choice");
		System.out.println("1.Deposit\t2.Withdraw");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		b.dep();
		break;
		case 2:
		b.withdraw();
		break;
		default:
		System.out.println("Invalid");
		System.exit(0);
		break;
		}
		System.out.println("Enter other than '0' to continue");
		j=sc.nextInt();
		}
	}
}