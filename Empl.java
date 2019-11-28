package Emp;
import java.util.*;
import DataBank.*;
import Savings.*;
class Empl{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int ch,j=1;
Accounts c=new SaveAcc();
while(j!=0)
{
System.out.println("Enter choice");
System.out.println("1.Deposit\t2.Withdraw");
ch=sc.nextInt();
switch(ch)
{
case 1:
c.deposit();
break;
case 2:
c.withdraw();
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


