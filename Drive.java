import java.util.*;
interface SafeDrive{
int safe_speed=80;
void vehicle_speed(int s);
}
class Drive implements SafeDrive{
int sp;
public void vehicle_speed(int s){
sp=s;
if(sp>safe_speed)
System.out.println("Drive Slow");
else
System.out.println("Safe driving");
}
}
class Speed{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int s,j=1;
Drive d=new Drive();
while(j!=0){
System.out.println("Enter driving speed");
s=sc.nextInt();
d.vehicle_speed(s);
System.out.println("Enter other than '0' to cintinue");
j=sc.nextInt();
}
}
}
