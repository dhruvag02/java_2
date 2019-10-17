import java.util.*;
public abstract class Series {
	Scanner sc=new Scanner(System.in);
		int n;
		int a;
		double sum=0;
	public void getdata() {
		System.out.println("Enter number of terms");
		n=sc.nextInt();
		System.out.println("Enter the first term");
		a=sc.nextInt();
	}
	abstract protected void getvalues();
	abstract protected void getterms();
	abstract protected void print();
	abstract void getsum();
}
class AP extends Series{
	int d;
	int ap[];
	int i;
	protected void getvalues() {
		super.getdata();
		System.out.println("Eter the common difference");
		d=sc.nextInt();		
	}
	protected void getterms() {
	ap=new int[n];
	for(i=0;i<n;i++) {
		ap[i]=a+(i)*d;
	}
	}
	protected void print() {
		System.out.println("AP of n terms is printed");
		for(i=0;i<n;i++) {
			System.out.println(ap[i] );
		}
		System.out.println("SUM="+sum);
	}
	void getsum() {
		for(i=0;i<n;i++) {
			sum=sum+ap[i];
		}
		print();
	}
}
class GP extends Series{
	int r;
	double gp[];
	int i;
	protected void getvalues() {
		super.getdata();
		System.out.println("Enter the common ratio");
		r=sc.nextInt();
	}
	protected void getterms() {
		gp=new double[n];
		for(i=0;i<n;i++) {
			gp[i]=a*(Math.pow(r,i));
		}
	}
	protected void print() {
		System.out.println("GP of n terms is printed");
		for(i=0;i<n;i++) {
			System.out.println(gp[i]);
		}
		System.out.println("SUM="+sum);
	}
	void getsum() {
		for(i=0;i<n;i++) {
			sum=sum+gp[i];
		}
		print();
	}
}
class Sequence{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Series s[];
		int ch,j=1,num,i;
		System.out.println("Enter number");
		num=sc.nextInt();
		while(j!=0) {
			System.out.println("Enter choice");
			System.out.println("1.AP\t2.GP");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				s=new AP[num];
				for(i=0;i<num;i++) {
					s[i]=new AP();
					s[i].getvalues();
					s[i].getterms();
					s[i].getsum();
				}
				break;
			case 2:
				s=new GP[num];
				for(i=0;i<num;i++) {
					s[i]=new GP();
					s[i].getvalues();
					s[i].getterms();
					s[i].getsum();
				}
				break;
			}
			System.out.println("Enter other then '0' to continue");
			j=sc.nextInt();
		}
		}
	}

