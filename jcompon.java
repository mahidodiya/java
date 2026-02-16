import javax.swing.*;
class jcompon
{
public static void main(String args[])
{
	JFrame f = new JFrame("JComponenat Example");
	JLabel l1,l2,l3,l4,l5;
	JTextField t;
	JTextArea T;
	JCheckBox c,c1,c2,c3;
	JRadioButton r1,r2;
	JComboBox<String> cb;
	JButton b;
	
	l1=new JLabel("Enter your name :");
	l1.setBounds(100,50,200,40);

	t =new JTextField("ex.mahi");
	t.setBounds(400,50,200,40);

	l2=new JLabel("Enter about yourself :");
	l2.setBounds(100,100,200,40);

	T =new JTextArea("i love myself,i like nature!!");
	T.setBounds(400,100,200,40);

	l3=new JLabel("Select your hobi :");
	l3.setBounds(100,150,200,40);

	c =new JCheckBox("dancing");
	c.setBounds(400,150,200,40);
	c1 =new JCheckBox("singing");
	c1.setBounds(400,200,200,40);
	c2 =new JCheckBox("reading");
	c2.setBounds(400,250,200,40);
	c3 =new JCheckBox("drawing");
	c3.setBounds(400,300,200,40);

	l4=new JLabel("Select your gender :");
	l4.setBounds(100,350,200,40);

	r1=new JRadioButton("Male");
	r1.setBounds(400,350,100,40);
	r2=new JRadioButton("Female");
	r2.setBounds(500,350,100,40);

	ButtonGroup bg=new ButtonGroup();
	bg.add(r1);bg.add(r2);
	
	l5=new JLabel("Select Your Country :");
	l5.setBounds(100,400,200,40);
	
	String s[] ={"USA","UAE","India","China","Korea","AUS","England"};
	cb=new JComboBox <> (s);
	cb.setBounds(400,400,200,40);

	b=new JButton("Submit");
	b.setBounds(700,600,150,40);


	f.add(l1);
	f.add(t);
	f.add(l2);
	f.add(T);
	f.add(l3);
	f.add(c);
	f.add(c1);
	f.add(c2);
	f.add(c3);
	f.add(l4);
	f.add(r1);
	f.add(r2);
	f.add(l5);
	f.add(cb);
	f.add(b);

	f.setSize(300,300);
	f.setLayout(null);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}