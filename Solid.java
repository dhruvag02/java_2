import java.util.*;
public abstract class Solid {
    Scanner sc;
	int h;
	int r;
	public Solid() {
		 sc=new Scanner(System.in);
		System.out.println("Enter radius");
		r=sc.nextInt();
		System.out.println("Enter height");
		h=sc.nextInt();
	}
abstract void area();
abstract void vol();
}

 class Cyl extends Solid{
	public Cyl()
	{
		super();
		}
	double area;
	double vol;
	void area()
	{
		 area=((2*3.14*r*h)+(3.14*r*r));
		System.out.println("Area of cylinder="+area);
	}
	void vol()
	{
		vol=2*3.14*r*h;
		System.out.println("Volume of cylinder="+vol);
	}
}
class Cone extends Solid{
	public Cone()
	{
		super();
	}
	void area()
	{
		double area=3.14*r*(r+h+r*r);
		System.out.println("Area of cone="+area);
	}
	void vol() {
		double vol=1/3*3.14*r*r*h;
		System.out.println("Volume of cone="+vol);
		
	}
}
class Shape{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Solid ref;
		System.out.println("Enter choice");
		System.out.println("1.Cylinder"+"  "+"2.Cone");
		int ch=sc.nextInt();
		if(ch==1)
		{
			ref=new Cyl();
		}
		else
		{
			ref=new Cone();
		}
			ref.area();
			ref.vol();
		}
	}
