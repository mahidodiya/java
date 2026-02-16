class static_key
{
static String name;
 int age;

static_key(String name,int age){
this.name=name;
this.age=age;

} 

static{
name="My name is Mahi";
System.out.println(name);

}

static void display(){
 System.out.println(name);
 }

public static void main(String args[])
{
System.out.println("Prrety Girl!!");
static_key key= new static_key("mahi",18);
System.out.println(key.age);

static_key.display();
//System.out.println((static_key.name));
}
}
