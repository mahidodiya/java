import java.util.Scanner;
public class student
{
Scanner s=new Scanner(System.in);

System.out.println("Enter name:");
String nm=s.nextString();

System.out.println("Enter rollno:");
int rno=s.nextInt();
}

public class mark extends student
{
Scanner o=new Scanner(System.in);

System.out.println("Number of subject:");
int mark=o.nextInt();

for(int i=o;i<mark.length;i++)
{
 System.out.println("Enter mark:");
 }

int total=mark+mark[i];
System.out.println("Total Mark:"+total);

int per=total/mark.length;
System.out.println("Percentag is"+per);

}

public class grade extends mark
{

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

public class multilevel
{
public static void main(String args[])
{
grade obj=new grade();
obj.display_grade();
}
}


