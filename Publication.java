import java.util.*;
public abstract class Publication {
	String title;
	double price;
	Scanner sc=new Scanner(System.in);
	protected abstract void getdata();
	protected abstract void putdata();
	protected abstract void print();
}
class Book extends Publication{
	Scanner sc=new Scanner(System.in);
	int num_pages;
	protected void getdata() {
		System.out.println("Enter the title");
		title=sc.next();
		System.out.println("Enter the price");
		price=sc.nextDouble();
		System.out.println("Enter number of pages in the book");
		num_pages=sc.nextInt();
	}
	protected void putdata()
	{
		System.out.println("Title="+title+",Price="+price+"and Number of pages="+num_pages);
	}
	protected void print(){
		if(num_pages>500){
			System.out.println("Details of book having pages more than 500 are displayed");
			System.out.println("*****************");
			putdata();
			System.out.println("******************");
		}
	}
}
class Tape extends Publication{
	Scanner sc=new Scanner(System.in);
	double play_time;
	protected void getdata() {
		System.out.println("Enter the title");
		title=sc.next();
		System.out.println("Enter the price");
		price=sc.nextDouble();
		System.out.println("Enter Play time of tape");
		play_time=sc.nextDouble();
	}
	protected void putdata() {
		System.out.println("Title="+title+",Price="+price+"and Play time="+play_time);
	}
	protected void print(){
		}
}
class Collect{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int ch,j=1;
	Publication p[];
while(j!=0)
{
	System.out.println("Enter choice");
	System.out.println("1.Details of book\t2.Details of tape");
	ch=sc.nextInt();
	if(ch==1)
	{
	System.out.println("Enter number of books");
	int m=sc.nextInt();
	p=new Book[m];
	for(int i=0;i<m;i++) {
		p[i]=new Book();
	}
	for(int i=0;i<m;i++) {
		System.out.println("Enter details of book"+(i+1));
		p[i].getdata();
	}
	for(int i=0;i<m;i++) {
		p[i].putdata();
	}
	for(int i=0;i<m;i++){
	p[i].print();
	}
	}
	else if(ch==2) {
		System.out.println("Enter number of tapes");
		int n=sc.nextInt();
		p=new Tape[n];
		for(int i=0;i<n;i++) {
			p[i]=new Tape();
		}
		for(int i=0;i<n;i++) {
			System.out.println("Enter details of tape"+(i+1));
			p[i].getdata();
		}
	for(int i=0;i<n;i++) {
		p[i].putdata();
	}
	}
System.out.println("Enter other than '0' to continue");
j=sc.nextInt();
}
	}
}

