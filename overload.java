class demo
{
void display()
{
System.out.println("multiplication:"+ (x*y));
}

void mul(int x,float y)
{
System.out.println("muliplocation:"+ (x*y));
}

void mul(int x,int y,int z)
{
System.out.println("multiplication:"+ (x*y*z));
}
}
public class overload
{
public static void main(String args[])
{
demo obj= new demo();
obj.mul(10,10); 
obj.mul(20,20.0f);
obj.mul(10,20,50);
}
}
