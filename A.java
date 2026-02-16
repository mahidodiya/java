public class A
{
  String name;
  int age;

public A(String name,int age){
this.name=name;
System.out.println("Name is:"+ (this.name)); 
System.out.println("Name is:"+ name); 

this.age=age;
}

void dis_det(){
System.out.println("Name is:"+ (this.name)); 
System.out.println("age is:"+ (this.age)); 
}

void setname(String name){
this.name=name;
}

void setage(int age){
this.age=age;
}

public static void main(String args[])
{
A obj=new A("Mahi",18);
obj.dis_det();
obj.setname("Mahi Dodiya");
obj.setage(17);
obj.dis_det();
}
}

 

