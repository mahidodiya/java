import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventExample
{
	public static void main(String[]args)
	{
		JFrame frame = new JFrame("Action Event Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JButton button =new JButton ("click me");
		button.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Button Clicked");
			}
		});
	
		frame.add(button);
		frame.pack();
		frame.setVisible(true);
       }
}
