import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class LoginPage extends JFrame implements ActionListener
{
	JButton login;
	JLabel username, password,l1;
	JTextField user;
	JPasswordField pass;
	
	public LoginPage()
	{
		setLayout(null);
		setVisible(true);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width, screenSize.height);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		Color c = new Color(230,230,250);
		setBackground(c);	


		l1 = new JLabel("Login");
		l1.setBounds(450,50,150,50);
		 l1.setFont(new Font("Arial", Font.BOLD, 35));

		username = new JLabel("Enter UserName:");
		username.setBounds(350,150,150,50);
		username.setFont(new Font("Arial", Font.BOLD, 15));

		
		password = new JLabel("Enter Password:");
		password.setBounds(350,250,150,50);
		password.setFont(new Font("Arial", Font.BOLD, 15));
		

		user = new JTextField(10);
		user.setBounds(550,170,150,20);
		
		pass = new JPasswordField();
		pass.setBounds(550,270,150,20);
		
		login = new JButton("LOGIN");
		login.setBounds(450,350,150,50);
		login.addActionListener(this);
		
		add(username);
		add(password);
		add(user);
		add(pass);
		add(login);
		add(l1);
		
	}
	
	public void actionPerformed( ActionEvent ae)
	{
		if(ae.getSource()==login)
		{
			if(user.getText().trim().length()>0)
                                 {
 
                                    if(pass.getText().trim().length()>0)
                                      {

			            DetailPagedemo d = new DetailPagedemo();
				}
			else
				JOptionPane.showMessageDialog(null,"Please Enter Password");
			}
				else
				JOptionPane.showMessageDialog(null,"Please Enter Username");		
		}
	}
}