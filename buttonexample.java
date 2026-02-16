import java.awt.*;
public class buttonexample
{
 public static void main (String[] args)
 {

	Frame f = new Frame("Button Example");

	Button b = new Button("Click Here");

	b.setBounds(10,20,40,30);

 	f.add(b);
 	f.setSize(400,400);
 	f.setVisible(true);
		
 }
}