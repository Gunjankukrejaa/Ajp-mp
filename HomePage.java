import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class HomePage extends JFrame implements ActionListener
{
	JButton jb1;
	JLabel l1, l2, l3;
	
	public HomePage()
	{
		Container cp = getContentPane();
		cp.setLayout(null);
		
		Color c = new Color(230,230,250);
		cp.setBackground(c);	

		l3 = new JLabel("Welcome");
		l3.setBounds(650,50,350,80);
		l3.setFont(new Font("Calibiri",20,20));
		
		
		l2 = new JLabel("Vaccination Management System!!");
		l2.setBounds(450,200,850,80);
		l2.setFont(new Font("Calibiri",20,40));
		
		jb1 = new JButton("Next");
		jb1.setBounds(650,350,130,30);
		jb1.addActionListener(this);
		
		cp.add(l2);
		cp.add(l3);
		cp.add(jb1);
		
	}
	
	public void actionPerformed( ActionEvent ae)
	{
		if(ae.getSource()==jb1)
		{
			LoginPage lp = new LoginPage();
		}
	}
	
	public static void main(String args[])
	{
		HomePage hp = new HomePage();
		hp.setVisible(true);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		hp.setSize(screenSize.width, screenSize.height);
		hp.setTitle("Home Page");
		hp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}