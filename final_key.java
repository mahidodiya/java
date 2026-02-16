//Final keyword cheking

final class data
{
String name;
int age;

public data(String name,int age){
 this.name=name;
 this.age=age;
}

public void display(){
System.out.println("Name is:"+(this.name));
System.out.println("Age is:"+(this.age));
}

final void phno(){
System.out.println("phone no is 6355959019");
}
}

class test extends data
{
//@override
void phno(){
System.out.println("phone no is 6351642142");
}
}




public class final_key{
public static void main(String args[])
{
data root= new data("mahi",18);
root.display();
//final_key.name="dodiya mahi";

test te=new test();



}

}


