import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.Color;

class updateslot2 extends JFrame implements ActionListener
{
Container c;
JLabel l1, l3 ,l4, l5, l6, l7, l8, l9, l10, l11, l12; 
JTextField fname, mno, age, aadhar;
 JRadioButton male, female, covaxin, covishield, polio, rubela; 
ButtonGroup gender, vaccine;
JComboBox date, dt, month, mth, yr, year, slot; 
JTextArea address;
JButton update, show, back;
String dates[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20","21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
String months[] = { "Jan", "feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sup", "Oct", "Nov", "Dec" };
String yrs[] = { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019" };
String years[] = { "2021", "2022","2023" };
Connection cn; 
Statement st;
ResultSet rs;

updateslot2()
{


setDefaultCloseOperation(EXIT_ON_CLOSE); 
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
setSize(screenSize.width, screenSize.height);
setVisible(true);

c = getContentPane(); 
c.setLayout(null);

Color co = new Color(230,230,250);
c.setBackground(co);	

l1 = new JLabel("Update slot!!",JLabel.CENTER);
l1.setFont(new Font("Arial", Font.BOLD, 25));
l1.setSize(600, 30);
l1.setLocation(350, 10);
l1.setForeground(Color.red);
c.add(l1);

l3= new JLabel("Enter Aadhar No."); 
l3.setFont(new Font("Arial", Font.BOLD, 15)); 
l3.setSize(150, 20);
l3.setLocation(420, 100);
c.add(l3);

aadhar = new JTextField(12);
aadhar.setFont(new Font("Arial", Font.BOLD, 15));
 aadhar.setSize(150, 20);
aadhar.setLocation(550, 100);
 c.add(aadhar);

show = new JButton("Show previous Data");
 show.setFont(new Font("Arial", Font.BOLD, 15));
 show.setSize(250, 20);
show.setLocation(470, 150); 
show.addActionListener(this);
c.add(show);

l4 = new JLabel("Full Name");
l4.setFont(new Font("Arial", Font.BOLD, 15)); 
l4.setSize(100, 20);
l4.setLocation(420, 200);
 c.add(l4);

fname = new JTextField(30);
fname.setFont(new Font("Arial", Font.BOLD, 15)); 
fname.setSize(190, 20);
fname.setLocation(550, 200); 
c.add(fname);

l10 = new JLabel("Mobile No.");
 l10.setFont(new Font("Arial", Font.BOLD, 15)); 
l10.setSize(100, 20);
l10.setLocation(420, 250);
 c.add(l10);
 

mno = new JTextField();
mno.setFont(new Font("Arial", Font.BOLD, 15)); 
mno.setSize(150, 20);
mno.setLocation(550, 250);
 c.add(mno);

l5 = new JLabel("Gender");
l5.setFont(new Font("Arial", Font.BOLD, 15)); 
l5.setSize(100, 20);
l5.setLocation(420, 300); 
c.add(l5);

male = new JRadioButton("Male"); 
male.setFont(new Font("Arial", Font.BOLD, 15)); 
male.setSize(75, 20);
male.setLocation(550, 300);
 c.add(male);

female = new JRadioButton("Female"); 
female.setFont(new Font("Arial", Font.BOLD, 15));
female.setSize(80, 20);
female.setLocation(650, 300); 
c.add(female);

gender = new ButtonGroup(); 
gender.add(male); 
gender.add(female);

l6 = new JLabel("DOB");
l6.setFont(new Font("Arial", Font.BOLD, 15));
l6.setSize(100, 20);
l6.setLocation(420, 350); 
c.add(l6);

date = new JComboBox(dates);
date.setFont(new Font("Arial", Font.BOLD, 15)); 
date.setSize(50, 20);
date.setLocation(550, 350); 
c.add(date);

month = new JComboBox(months); 
month.setFont(new Font("Arial", Font.BOLD, 15)); 
month.setSize(60, 20);
month.setLocation(600, 350);
 c.add(month);

yr = new JComboBox(yrs);
yr.setFont(new Font("Arial", Font.BOLD, 15)); 
yr.setSize(60, 20);
yr.setLocation(670, 350);
 c.add(yr);

l7 = new JLabel("Address");
l7.setFont(new Font("Arial", Font.BOLD, 15));
 l7.setSize(100, 20);
l7.setLocation(420, 400);
 c.add(l7);

address= new JTextArea();
address.setFont(new Font("Arial", Font.BOLD, 15));
 address.setSize(200, 75);
address.setLocation(550, 400);
 address.setLineWrap(true);
c.add(address);

l8 = new JLabel("Vaccine");
l8.setFont(new Font("Arial", Font.BOLD, 15)); 
l8.setSize(100, 20);
l8.setLocation(420, 500); 
c.add(l8);

covaxin = new JRadioButton("Covaxin");
 covaxin.setFont(new Font("Arial", Font.BOLD, 15)); 
covaxin.setSize(100, 20);
covaxin.setLocation(550, 500); 
c.add(covaxin);

covishield = new JRadioButton("Covishield"); 
covishield.setFont(new Font("Arial", Font.BOLD, 15)); 
covishield.setSize(110, 20);
covishield.setLocation(650, 500);
 c.add(covishield);

polio = new JRadioButton("Polio");
 polio.setFont(new Font("Arial", Font.BOLD, 15));
polio.setSize(100, 20);
polio.setLocation(800, 500); 
c.add(polio);

rubela = new JRadioButton("Rubela"); 
rubela.setFont(new Font("Arial", Font.BOLD, 15)); 
rubela.setSize(100, 20);
rubela.setLocation(880, 500); 
c.add(rubela);


vaccine = new ButtonGroup(); 
vaccine.add(covaxin); 
vaccine.add(covishield);
vaccine.add(polio); 
vaccine.add(rubela);


l9 = new JLabel("Vaccination date"); 
l9.setFont(new Font("Arial", Font.BOLD, 15));
 l9.setSize(150, 20);
l9.setLocation(420, 550); 
c.add(l9);

dt = new JComboBox(dates);
dt.setFont(new Font("Arial", Font.BOLD, 15)); 
dt.setSize(50, 20);
dt.setLocation(580, 550);
 c.add(dt);

mth = new JComboBox(months); 
mth.setFont(new Font("Arial", Font.BOLD, 15));
 mth.setSize(60, 20);
mth.setLocation(650, 550);
 c.add(mth);

year = new JComboBox(years);
 year.setFont(new Font("Arial", Font.BOLD, 15)); 
year.setSize(60, 20);
year.setLocation(720, 550);
 c.add(year);

l12 = new JLabel("Vaccination slot"); 
l12.setFont(new Font("Arial", Font.BOLD, 15));
 l12.setSize(200, 20);
l12.setLocation(420, 600);
 c.add(l12);

slot = new JComboBox();
slot.addItem("Morning slot: 9am to 11am ");
slot.addItem("Afternoon slot: 12pm to 2pm ");
slot.addItem("Morning slot: 4pm to 6pm ");
slot.setFont(new Font("Arial", Font.BOLD, 15)); slot.setSize(250, 20);
slot.setLocation(550, 600); 
c.add(slot);

update = new JButton("Update Data");
 update.setFont(new Font("Arial", Font.BOLD, 20));
 update.setSize(150, 40);
update.setLocation(470, 650); 
update.addActionListener(this); 
c.add(update);

back = new JButton("Back");
back.setFont(new Font("Arial", Font.BOLD, 15));
 back.setSize(150, 40);
back.setLocation(680, 650); 
back.addActionListener(this);
c.add(back);

try
{
Class.forName("oracle.jdbc.driver.OracleDriver");	

cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","TYCO");	

st = cn.createStatement();	

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
rs = st.executeQuery("Select * from Vaccine where ano='"+aadhar.getText()+"' ");
 rs.next();
fname.setText(rs.getString(1)); 
mno.setText(rs.getString(2)); 
address.setText(rs.getString(6));
}
else
JOptionPane.showMessageDialog(null,"Please Enter the Aadhar No...");
}
else if(ae.getSource()==update)
{
if(fname.getText().trim().length()>0)
{
if(mno.getText().trim().length()>0)
{
if(address.getText().trim().length()>0)
 
{
String gen = ""; if(male.isSelected())
gen = "Male";
else
gen = "Female";
String birth= ""+(String)date.getSelectedItem()+"/"+(String)month.getSelectedItem()+"/"+(String)yr.getSelectedItem();
String vacc = ""; if(covaxin.isSelected())
vacc = "Covaxin";
else if(covishield.isSelected())
vacc = "Covishield";
else if(polio.isSelected())
vacc = "Polio";
else if(rubela.isSelected())
vacc = "Rubela";
String vaccdate= ""+(String)dt.getSelectedItem()+"/"+(String)mth.getSelectedItem()+"/"+ (String)year.getSelectedItem();
String slotse1 = ""+(String)slot.getSelectedItem();

int i = st.executeUpdate("Update Vaccine set Name='"+fname.getText()+"', Mob='"+mno.getText()+"', Gen='"+gen+"',Birth='"+birth+"', Addr='"+address.getText()+"', Vacc='"+vacc+"', VaccDate='"+vaccdate+"', slotse='"+slotse1+"' where ano='"+aadhar.getText()+"'");
if(i>0)

JOptionPane.showMessageDialog(null,"Vaccination Slot updated Successfully");
else

JOptionPane.showMessageDialog(null,"Vaccination Slot updation failed");
}
else
 
JOptionPane.showMessageDialog(null,"Please Enter the Address...");
}
else
JOptionPane.showMessageDialog(null,"Please Enter the Mobile No...");
}
else
JOptionPane.showMessageDialog(null,"Please Enter the Full Name...");
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
new updateslot2();
}
}
