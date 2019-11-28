package Savings;
import java.util.*;
import DataBank.*;
import java.util.*;
public class SaveAcc extends Accounts{
Scanner sc=new Scanner(System.in);
double rate;
int time;
double cal_amt;
public SaveAcc(){
super();
rate=6.75;
}
public void withdraw(){
System.out.println("Enter amount to be wthdrawn");
cal_amt=sc.nextDouble();
bal=bal-cal_amt;
System.out.println("Balance="+bal);
cal_amount();
}
public void deposit(){
System.out.println("Enter amount to be deposited");
cal_amt=sc.nextDouble();
bal=bal+cal_amt;
System.out.println("Balance="+bal);
cal_amount();
}
public void cal_amount(){
System.out.println("Enter time");
time=sc.nextInt();
bal=(bal*Math.pow((1+0.0675),time));
display();
}
public void display(){
System.out.println("Account number:"+accno);
System.out.println("Name:"+name+" and Address="+addr);
System.out.println("Rate of interest:"+rate);
System.out.println("Balance="+bal);
}
}