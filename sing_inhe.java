class cow{
void run(){
System.out.println("Cow are runing!");
}
}

class dog extends cow{
void eat(){
System.out.println("Dog is eating!!");
}

class cat
void dance(){
System.out.println("Cat is dancing..");

class animal extends dog,cat
void stand(){
System.out.println("All Amimal are Standing!!..");
}

class hybrid_inhe{
public static void main(String args[])
{

animal a=new animal();
a.run();
a.eat();
a.dance();
a.stand();

}
}