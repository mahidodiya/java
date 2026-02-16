import javax.swing.*;
class jcompo
{
public static void main(String args[])
{
	JFrame f = new JFrame("JLabel Example");
	JLabel l1,l2;
	JTextField t;
	JTextArea T;
	
	l1=new JLabel("Enter your name");
	l1.setBounds(100,50,200,50);

	t =new JTextField("ex.mahi");
	t.setBounds(400,50,200,50);

	l2=new JLabel("Enter about yourself");
	l2.setBounds(100,100,200,50);

	T =new JTextArea("i love myself,i like nature!!");
	T.setBounds(400,100,200,50);

	f.add(l1);
	f.add(t);
	f.add(l2);
	f.add(T);

	f.setSize(300,300);
	f.setLayout(null);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}