import java.util.*;
class Ascend implements Runnable{
int l1[];
int n1,i,j,temp;
Thread t;
String tname;
Ascend(int l[],int n,String name){
	l1=l;
	n1=n;
	t=new Thread(this,name);
	System.out.println("current Thread:" +t);
	t.start();
}
public void run() {
	synchronized(l1)
	{
	for(i=0;i<n1;i++) {
		for(j=i+1;j<n1;j++) {
			if(l1[i]>l1[j]) {
				temp=l1[i];
				l1[i]=l1[j];
				l1[j]=temp;
			}
		}
	}
	try {
		for(i=0;i<n1;i++) {
	System.out.println(l1[i]);
	Thread.sleep(1000);
		}
}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
}

class Descend implements Runnable{
int l2[];
int n2,i,j,temp;
Thread t;
Descend(int l[],int n,String name){
	l2=l;
	n2=n;
	t=new Thread(this,name);
	System.out.println("current Thread:" +t);
	t.start();
}
public void run() {
	synchronized(l2) {
	for(i=0;i<n2;i++) {
		for(j=i+1;j<n2;j++) {
			if(l2[i]<l2[j]) {
				temp=l2[i];
				l2[i]=l2[j];
				l2[j]=temp;
			}
		}
	}
	try {
		for(i=0;i<n2;i++) {
	System.out.println(l2[i]);
	Thread.sleep(1000);
		}
}
	catch(Exception e) {
		System.out.println(e);
	}
}
}}
class Sort{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter number elements in list");
		n=sc.nextInt();
		int l[]=new int[n];
		System.out.println("Enter elements in list");
		for(int i=0;i<n;i++)
		{
			l[i]=sc.nextInt();
		}
		
	Ascend a=new Ascend(l,n,"Ascending order");
		Descend d=new Descend(l,n,"Descending order");
		try {
			a.t.join();
			d.t.join();
			}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Exiting from main()");
	}
}