import javax.swing.*;
 import java.awt.*; 
import java.awt.event.*;
 import java.sql.*;
import java.awt.Color;

class Registerslot extends JFrame implements ActionListener
{
Container c;
JLabel l1, l3 ,l4, l5, l6, l7, l8, l9, l10, l11, l12; 
JTextField fname, mno, age, aadhar; 
JRadioButton male, female, covaxin, covishield, polio, rubela;
 ButtonGroup gender, vaccine;
JComboBox date, dt, month, mth, yr, year, slot; 
JTextArea address;
JButton register, back;
String dates[] = { "1", "2", "3", "4", "5",
"6", "7", "8", "9", "10",
"11", "12", "13", "14", "15",
"16", "17", "18", "19", "20",
"21", "22", "23", "24", "25",
"26", "27", "28", "29", "30",
"31" };
String months[] = { "Jan", "feb", "Mar", "Apr",
"May", "Jun", "July", "Aug",
"Sup", "Oct", "Nov", "Dec" };
String yrs[] = { "1995", "1996", "1997", "1998",
"1999", "2000", "2001", "2002",
"2003", "2004", "2005", "2006",
"2007", "2008", "2009", "2010",
"2011", "2012", "2013", "2014",
"2015", "2016", "2017", "2018",
"2019" };
String years[] = { "2021", "2022","2023" };
Connection cn;
 Statement st;

Registerslot()
{
 
setDefaultCloseOperation(EXIT_ON_CLOSE); 
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
setSize(screenSize.width, screenSize.height);
setVisible(true);
 
c = getContentPane();
 c.setLayout(null);

Color co = new Color(230,230,250);
c.setBackground(co);	


l1 = new JLabel("Register slot!!",JLabel.CENTER); 
l1.setFont(new Font("Arial", Font.BOLD, 25));
l1.setSize(600, 30);
l1.setLocation(320, 10);
 l1.setForeground(Color.red);
 c.add(l1);

l3= new JLabel("Full Name");
l3.setFont(new Font("Arial", Font.BOLD, 15)); 
l3.setSize(100, 20);
l3.setLocation(450, 100);
c.add(l3);

fname = new JTextField(30);
fname.setFont(new Font("Arial", Font.BOLD, 15)); 
fname.setSize(190, 20);
fname.setLocation(550, 100); 
c.add(fname);

l4 = new JLabel("Mobile No."); 
l4.setFont(new Font("Arial", Font.BOLD, 15)); 
l4.setSize(100, 20);
l4.setLocation(450, 150); 
c.add(l4);
 

mno = new JTextField();
mno.setFont(new Font("Arial", Font.BOLD, 15)); 
mno.setSize(150, 20);
mno.setLocation(550, 150); 
c.add(mno);

l10 = new JLabel("Aadhar No.");
 l10.setFont(new Font("Arial", Font.BOLD, 15)); 
l10.setSize(100, 20);
l10.setLocation(450, 200);
 c.add(l10);

aadhar = new JTextField();
aadhar.setFont(new Font("Arial", Font.BOLD, 15)); 
aadhar.setSize(150, 20);
aadhar.setLocation(550, 200);
 c.add(aadhar);

l5 = new JLabel("Gender");
l5.setFont(new Font("Arial", Font.BOLD, 15)); 
l5.setSize(100, 20);
l5.setLocation(450, 250);
 c.add(l5);

male = new JRadioButton("Male"); 
male.setFont(new Font("Arial", Font.BOLD, 15)); 
male.setSize(75, 20);
male.setLocation(550, 250); 
c.add(male);

female = new JRadioButton("Female");
female.setFont(new Font("Arial", Font.BOLD, 15)); 
female.setSize(80, 20);
female.setLocation(625, 250);
 c.add(female);

gender = new ButtonGroup();
 gender.add(male);
 gender.add(female);

l6 = new JLabel("DOB");
l6.setFont(new Font("Arial", Font.BOLD, 15));
 l6.setSize(100, 20);
l6.setLocation(450, 300);
 c.add(l6);

date = new JComboBox(dates);
 date.setFont(new Font("Arial", Font.BOLD, 15)); 
date.setSize(50, 20);
date.setLocation(550, 300);
 c.add(date);

month = new JComboBox(months); 
month.setFont(new Font("Arial", Font.BOLD, 15));
 month.setSize(60, 20);
month.setLocation(620, 300); 
c.add(month);

yr = new JComboBox(yrs);
yr.setFont(new Font("Arial", Font.BOLD, 15));
 yr.setSize(60, 20);
yr.setLocation(700, 300); 
c.add(yr);
 

l7 = new JLabel("Address");
l7.setFont(new Font("Arial", Font.BOLD, 15)); 
l7.setSize(100, 20);
l7.setLocation(450, 350); 
c.add(l7);

address= new JTextArea();
address.setFont(new Font("Arial", Font.BOLD, 15)); 
address.setSize(200, 75);
address.setLocation(550, 350);
 address.setLineWrap(true); 
c.add(address);

l8 = new JLabel("Vaccine");
l8.setFont(new Font("Arial", Font.BOLD, 15));
l8.setSize(100, 20);
l8.setLocation(450, 450); 
c.add(l8);

covaxin = new JRadioButton("Covaxin"); 
covaxin.setFont(new Font("Arial", Font.BOLD, 15));
covaxin.setSize(100, 20);
covaxin.setLocation(550, 450);
 c.add(covaxin);

covishield = new JRadioButton("Covishield"); 
covishield.setFont(new Font("Arial", Font.BOLD, 15)); 
covishield.setSize(150, 20);
covishield.setLocation(650, 450); 
c.add(covishield);

polio = new JRadioButton("Polio");
 polio.setFont(new Font("Arial", Font.BOLD, 15));
polio.setSize(100, 20);
polio.setLocation(800, 450); 
c.add(polio);

rubela = new JRadioButton("Rubela"); 
rubela.setFont(new Font("Arial", Font.BOLD, 15)); 
rubela.setSize(100, 20);
rubela.setLocation(880, 450); 
c.add(rubela);

 

vaccine = new ButtonGroup(); 
vaccine.add(covaxin); 
vaccine.add(covishield);
vaccine.add(polio); 
vaccine.add(rubela);

l9 = new JLabel("Vaccination date"); 
l9.setFont(new Font("Arial", Font.BOLD, 15)); 
l9.setSize(150, 20);
l9.setLocation(450, 500); 
c.add(l9);

dt = new JComboBox(dates);
dt.setFont(new Font("Arial", Font.BOLD, 15));
 dt.setSize(50, 20);
dt.setLocation(580, 500); 
c.add(dt);

mth = new JComboBox(months); 
mth.setFont(new Font("Arial", Font.BOLD, 15));
 mth.setSize(60, 20);
mth.setLocation(650, 500);
 c.add(mth);

year = new JComboBox(years); 
year.setFont(new Font("Arial", Font.BOLD, 15)); 
year.setSize(60, 20);
year.setLocation(720, 500);
 c.add(year);

l12 = new JLabel("Vaccination slot"); 
l12.setFont(new Font("Arial", Font.BOLD, 15));
 l12.setSize(200, 20);
l12.setLocation(450, 550);
 c.add(l12);

slot = new JComboBox();
slot.addItem("Morning slot: 9am to 11am ");
slot.addItem("Afternoon slot: 12pm to 2pm ");
slot.addItem("Morning slot: 4pm to 6pm ");
slot.setFont(new Font("Arial", Font.BOLD, 15)); slot.setSize(250, 20);
slot.setLocation(580, 550); 
c.add(slot);


register = new JButton("Register");
register.setFont(new Font("Arial", Font.BOLD, 20)); 
register.setSize(180, 40);
register.setLocation(450, 650);
 
register.addActionListener(this);
c.add(register);

back = new JButton("Back");
back.setFont(new Font("Arial", Font.BOLD, 15));
 back.setSize(150, 40);
back.setLocation(750, 650); 
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
if(ae.getSource()==register)
{
if(fname.getText().trim().length()>0)
{
if(mno.getText().trim().length()>0)
{
if(aadhar.getText().trim().length()>0)
{
if(address.getText().trim().length()>0)
{
 
String name = fname.getText(); String mob = mno.getText(); String ano = aadhar.getText(); String gen = ""; 
if(male.isSelected())
gen = "Male";
else
gen = "Female";
String birth= ""+(String)date.getSelectedItem()+"/"+(String)month.getSelectedItem()+"/"+(String)yr.getSelectedItem();
String addr = address.getText(); String vacc = ""; if(covaxin.isSelected())
vacc = "Covaxin";
else if(covishield.isSelected())
vacc = "Covishield";
else if(polio.isSelected())
vacc = "Polio";
else if(rubela.isSelected())
vacc = "Rubela";
String vaccdate= ""+(String)dt.getSelectedItem()+"/"+(String)mth.getSelectedItem()+"/"+ (String)year.getSelectedItem();
String slotse = ""+(String)slot.getSelectedItem();
int i = st.executeUpdate("Insert into vaccine values('"+name+"','"+mob+"','"+ano+"','"+gen+"','"+birth+"','"+addr+"','"+vacc+"','"+vaccdate+"','"+slotse+"')");
if(i>0)

JOptionPane.showMessageDialog(null,"Vaccination Slot inserted Successfully");
}
else JOptionPane.showMessageDialog(null,"Please Enter the Address...");
 

}
else
 



JOptionPane.showMessageDialog(null,"Please Enter the Aadhar No...");
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

public static void main(String[] args) throws Exception
{
new Registerslot();
}
}


