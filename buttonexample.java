import java.awt.*;
class buttonexample;
{
public static void main(string args[])
{

	Frame f =new Frame("awt Button Example");

	Button b=new Button("Submit");
	b.setbounds(10,20,100,100);
	
	f.add(b);
	f.setsize(400,400);
	f.setvisible(true);

}
}