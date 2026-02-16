import java.util.Scanner;
class student
{
Scanner s=new Scanner(System.in);
 
void dis(){
String nm=s.nextString();{
System.out.println("Enter name:");
}

int rno=s.nextInt();{
System.out.println("Enter rollno:");
}
}
}

class mark extends student
{
Scanner o=new Scanner(System.in);

int mark=o.nextInt();{
System.out.println("Number of subject:");
}
 
void dis_mark(){
int i;

int per;
 for(i=0;i<mark;i++)
 {
 System.out.println("Enter mark:");
 }

void dis_total(){
 int total;
 total=mark+mark[i];{
 System.out.println("Total Mark:"+total);

}

per=total/mark.length;{
System.out.println("Percentag is"+per);
}
}
}

class grade extends mark
{
int total;
void display_grade(){
 if(total<150){
 System.out.println("Your Grade is D!!");
}
 else if(total<300 && total>=151){
 System.out.println("Your Grade is C!!");
}
 else if(total<400 && total>=301){
 System.out.println("Your Grade is B!!");
}
 else if(total<500 && total>=401){
 System.out.println("Your Grade is A!!");
}
}
}

public class multilevel
{
public static void main(String args[])
{
grade obj=new grade();
obj.dis();
obj.dis_mark();
obj.dis_total();
obj.display_grade();
}
}
}


 

