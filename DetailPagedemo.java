import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class DetailPagedemo extends JFrame implements ActionListener
{
	JLabel l1;
	JButton register, update, view, delete;

	public DetailPagedemo()
	{
		setLayout(null);
		setVisible(true);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width, screenSize.height);
		
		Color c = new Color(230,230,250);
		setBackground(c);	


		l1 = new JLabel("Vaccination Management System!!");
		l1.setBounds(150,100,850,80);
		l1.setFont(new Font("Calibiri",20,40));
		add(l1);

		register = new JButton("REGISTER SLOT");
		register.setBounds(350,250,150,50);
		add(register);
		register.addActionListener(this);
		

		update = new JButton("UPDATE SLOT");
		update.setBounds(350,350,150,50);
		add(update);
            	update.addActionListener(this);

		view = new JButton("VIEW SLOT");
		view.setBounds(350,450,150,50);
		add(view);
		view.addActionListener(this);
 
		delete = new JButton("DELETE SLOT");
		delete.setBounds(350,550,150,50);
		add(delete);
		delete.addActionListener(this);	
		
	}

	public void actionPerformed( ActionEvent ae)
	{
		if(ae.getSource()==register)
		{
			Registerslot rpg = new Registerslot();
		}
		if(ae.getSource()==update)
		{
			updateslot2 ups = new updateslot2();
		}
		if(ae.getSource()==view)
		{
			 viewslot2 rpg = new viewslot2();
		}
		if(ae.getSource()==delete)
		{
			deleteslot2 rpg = new deleteslot2();
		}
	}
	
}