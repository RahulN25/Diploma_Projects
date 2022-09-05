import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class AfterLogin implements ActionListener {
	int balance;
	String card = "45324842265070881";
	String exp = "08/25";
	String cvv = "277";
	JFrame f;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	JTextField t1,t2,t3,t4;
	JButton b1,b2,b3;
	
	public void afterlogin()
	{
		f = new JFrame();
		
		//Send Money Section
		Font myFont1 = new Font("Serif",Font.BOLD,30);
		l1 = new JLabel("ABC Bank");
		l1.setBounds(360,20,200,50);
		l1.setForeground(Color.GRAY);
		l1.setFont(myFont1);
		f.add(l1);
		
		l2 = new JLabel("Account Balance");
		l2.setBounds(315,100,100,20);
		f.add(l2);
		
		l3 = new JLabel("₹");
		l3.setBounds(470,100,100,20);
		l3.setForeground(Color.GREEN);
		f.add(l3);
		
		l4 = new JLabel("Make Payments");
		l4.setBounds(370,160,200,20);
		f.add(l4);
		
		l5 = new JLabel("Enter Card No");
		l5.setBounds(270,220,200,20);
		f.add(l5);
		t1 = new JTextField();
		t1.setBounds(380,220,200,20);
		f.add(t1);
		
		l6 = new JLabel("Enter Expiry Date");
		l6.setBounds(270,270,200,20);
		f.add(l6);
		t2 = new JTextField("month/year");
		t2.setBounds(380,270,100,20);
		f.add(t2);
		
		l7 = new JLabel("Enter CVV");
		l7.setBounds(270,320,200,20);
		f.add(l7);
		t3 = new JTextField();
		t3.setBounds(380,320,100,20);
		f.add(t3);
		
		l8 = new JLabel("Enter Amount");
		l8.setBounds(270,370,200,20);
		f.add(l8);
		t4 = new JTextField();
		t4.setBounds(380,370,100,20);
		f.add(t4);
		
		b1 = new JButton("Send Money");
		b1.setBounds(270,420,105,30);
		b1.setBackground(Color.CYAN);
		b1.addActionListener(this);
		f.add(b1);
		
		b2 = new JButton("Reset");
		b2.setBounds(400,420,80,30);
		b2.setBackground(Color.GRAY);
		b2.addActionListener(this);
		f.add(b2);
		
		b3 = new JButton("Forgot Details");
		b3.setBounds(500,420,115,30);
		b3.setBackground(Color.RED);
		b3.addActionListener(this);
		f.add(b3);
		
		l9 = new JLabel("Indicator");
		l9.setBounds(270,480,200,20);
		f.add(l9);
		
		l10 = new JLabel("Enter Card Details and Amount");
		l10.setBounds(360,480,500,20);
		f.add(l10);
		
		l12 = new JLabel("");
		l12.setBounds(360,480,200,20);
		f.add(l12);
		
		f.setSize(900,600);
		f.setVisible(true);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		
		
	}
	 

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1)
		{
			if(t1.getText().equals(card) && t2.getText().equals(exp) && t3.getText().equals(cvv))
			{
				JFrame f2 = new JFrame();
				
				l11 = new JLabel(t4.getText()+"  Payment is Successful");
				l11.setBounds(10,20,180,20);
				l11.setForeground(Color.GREEN);
				f2.add(l11);
				
				f2.setSize(200,200);
				f2.setVisible(true);
				f2.setLayout(null);
				f2.setLocationRelativeTo(null);
			}
			else
			{
				l10.setText("Invalid Card Credentials");
				l10.setForeground(Color.RED);
			}
		}
		
		if(e.getSource() == b2)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
		}
		
		if(e.getSource() == b3)
		{
			l10.setForeground(Color.BLUE);
			l10.setText("Card No -  "+card+ "  Expiray Date -  " +exp+ "  CVV -  "+cvv);
		}
	}
	
	public static void main(String args[])
	{
		AfterLogin a = new AfterLogin();
		a.afterlogin();
	}
}
