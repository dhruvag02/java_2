import java.util.*;
public abstract class Student1 {
	String usn,name,no;
	public Student1() {
		usn="Invalid";
		name="Invalid";
		no="Invalid";
	}
}
class Marks extends Student1{
	Scanner sc=new Scanner(System.in);
	int i;
	int sub;
	int ciem[];
	int seem[];
	int cred[];
	int total[];
	void getdata() {
		System.out.println("Enter USN and NAME of Student");
		usn=sc.next();
		name=sc.next();
		System.out.println("Enter Phone No of student");
		no=sc.next();
		System.out.println("Enter number of subjects");
		sub=sc.nextInt();
		ciem=new int[sub];
		seem=new int[sub];
		cred=new int[sub];
		total=new int[sub];
		System.out.println("Enter Marks");
		for(i=0;i<sub;i++) {
			System.out.println("Enter marks in sub:"+(i+1));
			System.out.println("For CIE");
			ciem[i]=sc.nextInt();
			System.out.println("For SEE (OUT OF 50)");
			seem[i]=sc.nextInt();
			System.out.println("Enter credits in sub:"+(i+1));
			cred[i]=sc.nextInt();
			total[i]=ciem[i]+seem[i];
		}
	}
}
class Res extends Marks{
	char grade;
	int sum=0;
	int to_points=0;
	double sgpa=0;
	int i;
	int points=0;
	void cal() {
		super.getdata();
		for(i=0;i<sub;i++) {
		if(total[i]>=90&&total[i]<=100) {
			grade='S';
			points=10;
		}
		else if(total[i]>=75&&total[i]<90) {
			grade='A';
			points=9;
		}
		else if(total[i]>=60&&total[i]<75) {
			grade='B';
			points=8;
		}
		else if(total[i]>=45&&total[i]<60) {
			grade='C';
			points=7;
		}
		else if(total[i]>=35&&total[i]<45) {
			grade='D';
			points=6;
		}
		else if(total[i]>=30&&total[i]<35) {
			grade='E';
			points=5;
		}
		else {
			grade='F';
			points=0;
		}
		sum=sum+(cred[i]*points);
		}
		for(i=0;i<sub;i++) {
			to_points=to_points+cred[i];
		}
		sgpa=sum/to_points;
	}
	void print() {
		for(i=0;i<sub;i++) {
			System.out.print("Grade in sub:"+(i+1));
			System.out.println(grade);
			}
		System.out.println("SGPA o student is:"+sgpa);
	}
}
class Stud1{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n;
		int i;
		Res r[];
		System.out.println("Enter number of student");
		n=sc.nextInt();
		r=new Res[n];
		for(i=0;i<n;i++) {
			r[i]=new Res();
			System.out.println("Eter Details of student:"+(i+1));
			r[i].cal();
			r[i].print();
		}
	}
}