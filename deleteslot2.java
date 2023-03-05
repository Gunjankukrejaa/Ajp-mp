import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.Color.*;

class deleteslot2 extends JFrame implements ActionListener
{
	JLabel l1, l2;
	JTextField aadhar;
	JButton delete, back;
	Container c;
	Connection con;
	Statement stmt;
	ResultSet rs;
	deleteslot2()
	{
		setVisible(true);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width, screenSize.height);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		c = getContentPane();
		Color c1 = new Color(230,230,250);
		c.setBackground(c1);
		c.setLayout(null);
		

		l1 = new JLabel("Delete slot!!",JLabel.CENTER);
 		l1.setFont(new Font("Arial", Font.BOLD, 25));
		l1.setSize(600, 30);
		l1.setLocation(300, 20);
		l1.setForeground(Color.red);
		c.add(l1);

		l2 = new JLabel("Enter Aadhar No");
 		l2.setFont(new Font("Arial", Font.BOLD, 15));
		l2.setSize(600, 30);
		l2.setLocation(450, 100);
		c.add(l2);

		aadhar = new JTextField(12);
		aadhar.setFont(new Font("Arial", Font.BOLD, 15));
 		aadhar.setSize(150, 20);
		aadhar.setLocation(580, 100);
 		c.add(aadhar);

		delete = new JButton("Delete slot");
 		delete.setFont(new Font("Arial", Font.BOLD, 15));
 		delete.setSize(150, 20);
		delete.setLocation(470, 170); 
		delete.addActionListener(this);
		c.add(delete);

		back = new JButton("Back");
 		back.setFont(new Font("Arial", Font.BOLD, 15));
 		back.setSize(150, 20);
		back.setLocation(690, 170); 
		back.addActionListener(this);
		c.add(back);

		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");	//register the driver

			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","TYCO");	//establish connection

			stmt = con.createStatement();	//create Statement
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
		public void actionPerformed(ActionEvent ae)
		{
				try
					{
						if(ae.getSource()==delete)
							{
								if(aadhar.getText().trim().length()>0)
									{
 
										int i = stmt.executeUpdate("Delete from Vaccine where ano = '"+aadhar.getText()+"'");
										if(i>0)
										{
											JOptionPane.showMessageDialog(null,"Slot deleted successfully!!!");
										}
										else
										JOptionPane.showMessageDialog(null,"Please enter valid aadhar number !!!");
									}
							}
						else if (ae.getSource()==back)
						{
							DetailPagedemo dpg = new DetailPagedemo();
						}
	
					}
						
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String args[])
{
new deleteslot2();
}
}
			

