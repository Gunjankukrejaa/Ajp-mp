import javax.swing.*;
 import java.awt.*;
import java.awt.event.*; 
import java.sql.*;
 import java.awt.Color;

class viewslot2 extends JFrame implements ActionListener
{
Container c;
JLabel l1, l2, l3 ,l4, l5, l6, l7, l8, l9, l10, l11;
JTextField fname, mno, age, aadhar, gender, vaccine, vaccdate, dob, slot; 
JTextArea address;
JButton show, back; 
Connection cn; Statement st; ResultSet rs;

viewslot2()
{
setDefaultCloseOperation(EXIT_ON_CLOSE); 
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
setSize(screenSize.width, screenSize.height);
setVisible(true);

c = getContentPane(); 
c.setLayout(null);

Color co = new Color(230,230,250);
c.setBackground(co);	



l2 = new JLabel("Show Vaccination Slot!!",JLabel.CENTER);
 l2.setFont(new Font("Arial", Font.BOLD, 20));
l2.setSize(300, 30);
l2.setLocation(250, 50);
c.add(l2);

l3= new JLabel("Enter Aadhar No.");
l3.setFont(new Font("Arial", Font.BOLD, 15));
l3.setSize(150, 20);
l3.setLocation(220, 100); 
c.add(l3);

aadhar = new JTextField(12);
aadhar.setFont(new Font("Arial", Font.BOLD, 15));
aadhar.setSize(150, 20);
aadhar.setLocation(350, 100); 
c.add(aadhar);

show = new JButton("Show Data"); 
show.setFont(new Font("Arial", Font.BOLD, 15)); 
show.setSize(150, 20);
show.setLocation(270, 150); 
show.addActionListener(this);
c.add(show);

l4 = new JLabel("Full Name");
l4.setFont(new Font("Arial", Font.BOLD, 15)); 
l4.setSize(100, 20);
l4.setLocation(250, 200); 
c.add(l4);

fname = new JTextField(30);
fname.setFont(new Font("Arial", Font.BOLD, 15));
 fname.setSize(190, 20);
fname.setLocation(350, 200); 
fname.setEditable(false); 
c.add(fname);

l10 = new JLabel("Mobile No.");
 l10.setFont(new Font("Arial", Font.BOLD, 15));
 l10.setSize(100, 20);
l10.setLocation(250, 250);
 c.add(l10);

mno = new JTextField();
mno.setFont(new Font("Arial", Font.BOLD, 15)); 
mno.setSize(150, 20);
mno.setLocation(350, 250); 
mno.setEditable(false); c.add(mno);


l7 = new JLabel("Address");
l7.setFont(new Font("Arial", Font.BOLD, 15)); 
l7.setSize(100, 20);
l7.setLocation(250, 300); 
c.add(l7);

address= new JTextArea();
address.setFont(new Font("Arial", Font.BOLD, 15));
 address.setSize(200, 75);
address.setLocation(350, 300);
 address.setLineWrap(true); 
address.setEditable(false); 
c.add(address);


l1 = new JLabel("Vaccination slot");
 l1.setFont(new Font("Arial", Font.BOLD, 15));
 l1.setSize(150, 20);
l1.setLocation(250, 400);
 c.add(l1);

slot= new JTextField(20);
slot.setFont(new Font("Arial", Font.BOLD, 15));
slot.setSize(150, 20);
slot.setLocation(380, 400); 
slot.setEditable(false);
 c.add(slot);

back = new JButton("Back");
back.setFont(new Font("Arial", Font.BOLD, 15));
 back.setSize(150, 40);
back.setLocation(680, 550); 
back.addActionListener(this);
c.add(back);

try
{
Class.forName("oracle.jdbc.driver.OracleDriver");	//register the driver

cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","TYCO");	//establish connection

st = cn.createStatement();	//create Statement
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
if(ae.getSource()==show)
{
if(aadhar.getText().trim().length()>0)
{
rs = st.executeQuery("Select * from Vaccine where ano= '"+aadhar.getText()+"'"); 
rs.next();
fname.setText(rs.getString(1));
 mno.setText(rs.getString(2)); 
 address.setText(rs.getString(6));
slot.setText(rs.getString(9));

}
else
JOptionPane.showMessageDialog(null,"Please Enter the AadharNo...");
}
else if(ae.getSource()==back)
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
new viewslot2();
}
}
