import javax.swing.*;
public class jbutton
{
public static void main(String args[])
{
	JFrame f=new JFrame("Swing button example");

	JButton b=new JButton ("Click here");
	b.setBounds(10,30,80,40);

	f.add(b);
	f.setSize(500,500);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
	