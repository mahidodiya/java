public class logical
{
public static void main(String args[])
{
int a,b,c;
 a=20;
 b=10;
 c=25;
 if (!(a>b || a>c)){
  System.out.println("a is greter!!..");
  }
 
 else if(!(b>a && b>c)){
  System.out.println("b is greter!!..");
  }

 else{
  System.out.println("c is greter!!..");
  }
  
}
}