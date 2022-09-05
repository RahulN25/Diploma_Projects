import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener
{
	JFrame f;
	JPanel p;
	JTextField t;
	JLabel l;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	Integer num,ans;
	int calculation;
	void Cal()
	{
		f = new JFrame("Calculator");
		t = new JTextField();
		t. setFont(new Font("Arial", Font. PLAIN, 30));
		t.setBounds(0,30,400,60);
		f.add(t);
		
		l = new JLabel("");
		l.setBounds(0,0,400,30);
		l.setForeground(Color.RED);
		l. setFont(new Font("Arial", Font. PLAIN, 15));
		f.add(l);
		
		
		p = new JPanel();
		
		b1 = new JButton("7");
		b1. setFont(new Font("Arial", Font. PLAIN, 30));
		p.add(b1);
		b2 = new JButton("8");
		b2. setFont(new Font("Arial", Font. PLAIN, 30));
		p.add(b2);
		b3 = new JButton("9");
		b3. setFont(new Font("Arial", Font. PLAIN, 30));
		p.add(b3);
		b4 = new JButton("/");
		b4. setFont(new Font("Arial", Font. PLAIN, 30));
		p.add(b4);
		b5 = new JButton("4");
		b5. setFont(new Font("Arial", Font. PLAIN, 30));
		p.add(b5);
		b6 = new JButton("5");
		b6. setFont(new Font("Arial", Font. PLAIN, 30));
		p.add(b6);
		b7 = new JButton("6");
		b7. setFont(new Font("Arial", Font. PLAIN, 30));
		p.add(b7);
		b8 = new JButton("*");
		b8. setFont(new Font("Arial", Font. PLAIN, 30));
		p.add(b8);
		b9 = new JButton("1");
		b9. setFont(new Font("Arial", Font. PLAIN, 30));
		p.add(b9);
		b10 = new JButton("2");
		b10. setFont(new Font("Arial", Font. PLAIN, 30));
		p.add(b10);
		b11 = new JButton("3");
		b11. setFont(new Font("Arial", Font. PLAIN, 30));
		p.add(b11);
		b12 = new JButton("-");
		b12. setFont(new Font("Arial", Font. PLAIN, 30));
		p.add(b12);
		b13 = new JButton("<--");
		b13. setFont(new Font("Arial", Font. PLAIN, 30));
		p.add(b13);
		b14 = new JButton("0");
		b14. setFont(new Font("Arial", Font. PLAIN, 30));
		p.add(b14);
		b15 = new JButton("=");
		b15. setFont(new Font("Arial", Font. PLAIN, 30));
		p.add(b15);
		b16 = new JButton("+");
		b16. setFont(new Font("Arial", Font. PLAIN, 30));
		p.add(b16);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		
		p.setBounds(2,90,400,400);  
		p.setLayout(new GridLayout(4,4));
		p.setVisible(true);
		
		f.add(p);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(420,530);
		f.setLocationRelativeTo(null);	
	}
	
	public void arithmatic()
	{
		switch(calculation)
		{
			case 1:
				ans = num + Integer.parseInt(t.getText());
				t.setText(Integer.toString(ans));
				break;
				
			case 2:
				ans = num - Integer.parseInt(t.getText());
				t.setText(Integer.toString(ans));
				break;
				
			case 3:
				ans = num * Integer.parseInt(t.getText());
				t.setText(Integer.toString(ans));
				break;
				
			case 4:
				ans = num / Integer.parseInt(t.getText());
				t.setText(Integer.toString(ans));
				break;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1)
		{
			t.setText(t.getText() + "7");
		}
		if(e.getSource() == b2)
		{
			t.setText(t.getText() + "8");
		}
		if(e.getSource() == b3)
		{
			t.setText(t.getText() + "9");
		}
		if(e.getSource() == b4)
		{
			num = Integer.parseInt(t.getText());
			calculation = 4;
			t.setText("");
			l.setText(num + "/");
		}
		if(e.getSource() == b5)
		{
			t.setText(t.getText() + "4");
		}
		if(e.getSource() == b6)
		{
			t.setText(t.getText() + "5");
		}
		if(e.getSource() == b7)
		{
			t.setText(t.getText() + "6");
		}
		if(e.getSource() == b8)
		{
			num = Integer.parseInt(t.getText());
			calculation = 3;
			t.setText("");
			l.setText(num + "*");
		}
		if(e.getSource() == b9)
		{
			t.setText(t.getText() + "1");
		}
		if(e.getSource() == b10)
		{
			t.setText(t.getText() + "2");
		}
		if(e.getSource() == b11)
		{
			t.setText(t.getText() + "3");
		}
		if(e.getSource() == b12)
		{
			num = Integer.parseInt(t.getText());
			calculation = 2;
			t.setText("");
			l.setText(num + "-");
		}
		if(e.getSource() == b13)
		{
			int length = t.getText().length();
			int number = t.getText().length() - 1;
			
			if(length > 0)
			{
				StringBuilder back = new StringBuilder(t.getText());
				back.deleteCharAt(number);
				String store = back.toString();
				t.setText(store);
			}
		}
		if(e.getSource() == b14)
		{
			t.setText(t.getText() + "0");
		}
		if(e.getSource() == b15)
		{
			arithmatic();
			
		}
		if(e.getSource() == b16)
		{
			num = Integer.parseInt(t.getText());
			calculation = 1;
			t.setText("");
			l.setText(num + "+");
		}
	}
	
	public static void main(String args[])
	{
		Calculator c = new Calculator();
		c.Cal();
	}

}