public class variable
{
int x=10;//instance
static int y=10;//static

void fun(){
int p=10;
System.out.println(x+" "+y+" "+p);
++x; y++; ++p;
}

public static void main(String args[])
{
int z=30;//local

variable var=new variable();

System.out.println("Local variable:"+z);
System.out.println("Static variable:"+ (variable.y));
System.out.println("Instance variable:"+ (var.x));

var.fun();
var.fun();
var.fun();

}
}



