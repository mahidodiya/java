class cow{
void run(){
System.out.println("Cow are runing!");
}
}

class dog extends cow{
void eat(){
System.out.println("dog is eating!!..");
}
}

interface cat{
 final char da='a';
 void dance();
}

class animal extends dog implements cat{
public void dance()
{
System.out.println("Cat is dancing.."+ da);
}

void stand(){
System.out.println("All Amimal are Standing!!..");
}
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