class test//constructor
{
test()
{
System.out.println("Constructor\n");
System.out.println("it is Defualt consturctor\n");
}

test(int x,int y)
{
System.out.println("parameter constructor");
System.out.println("x is:"+ x);
System.out.println("y is:"+ y);
}

//void display1(display1 d)
//{
//System.out.println("Copy Constructor");
//}
}


 
class dis
{
public static void main(String args[])
{
test o= new test();
test ob= new test(10,20);
test obj= new test(40,20);

}
}
