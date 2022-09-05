import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.*;


public class Login implements ActionListener
{	
	private String username = "rahul";
	private String password = "123";
	String p2;
	JFrame f1,f2;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1;
	JTextField p1;
	JButton b1,b2,b3,b4;
	JPanel panel;
	
	void login()
	{
		f1 = new JFrame("Login Page");
		
		JLabel l1 = new JLabel("Username");
		l1.setBounds(200,100,100,20);
		f1.add(l1);
		
		l2 = new JLabel("Password");
		l2.setBounds(200,160,100,20);
		f1.add(l2);
		
		l3 = new JLabel("Enter Username and Password and click on Login");
		l3.setBounds(300,280,400,20);
		f1.add(l3);
		
		l4 = new JLabel("Indicator");
		l4.setBounds(200,280,100,20);
		f1.add(l4);

		t1 = new JTextField();
		t1.setBounds(300,100,200,20);
		f1.add(t1);
		
		p1 = new JPasswordField(8);
		p1.setBounds(300,160,200,20);
		f1.add(p1);

		b1 = new JButton("Login");
		b1.setBounds(300,220,70,20);
		b1.setBackground(Color.GREEN);
		f1.add(b1);
		b1.addActionListener(this);
		
		b2 = new JButton("Reset");
		b2.setBounds(420,220,70,20);
		b2.setBackground(Color.GRAY);
		f1.add(b2);
		b2.addActionListener(this);
		
		b3 = new JButton("Forgot");
		b3.setBounds(510,160,70,20);
		b3.setBackground(Color.RED);
		f1.add(b3);
		b3.addActionListener(this);
		
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setSize(900,600);
		f1.setLocationRelativeTo(null);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{  
		if(e.getSource() == b1)
		{
			if(t1.getText().equals(username) && p1.getText().equals(password))
			{
				l3.setText("Login Successful You will be Redirected to next Page");
				l3.setForeground(Color.GREEN);
				f1.dispose();
				AfterLogin a = new AfterLogin();
				a.afterlogin();
			}
			else
			{
				l3.setText("Login Failed wrong Username or Password");
				l3.setForeground(Color.RED);
			}
		}
		
		if(e.getSource() == b2)
		{
			t1.setText("");
			p1.setText("");
		}
		
		if(e.getSource() == b3)
		{
			l3.setText("Your Username  :  " +username+ "  and your password  :  " +password);
			l3.setForeground(Color.BLACK);
		}
		
	}
	
	public static void main(String args[])
	{
		Login l = new Login();
		l.login();
	}
		
}


