import java.util.Scanner;
public class odev
{
public static void main(String args[])
{
Scanner num=new Scanner(System.in);
 System.out.print("Enter Number:");
int name=num.nextInt();
for(int i=1; i<=name; i++){

if(name%i==0){
 System.out.println("number is prime..!!");
}
else{
 System.out.println("number is non-prime..!!");
 }
}
}
}