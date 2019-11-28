package DataBank;
import java.util.*;
abstract public class Accounts{
Scanner sc=new Scanner(System.in);
public double bal;
public String accno,name,addr;
public Accounts(){
System.out.println("Enter Account_number");
accno=sc.next();
System.out.println("Enter name and Address");
name=sc.next();
addr=sc.next();
System.out.println("Enter your balance");
bal=sc.nextDouble();
}
abstract public void withdraw();
abstract public void deposit();
public void display(){
System.out.println("Bal="+bal);
}
}