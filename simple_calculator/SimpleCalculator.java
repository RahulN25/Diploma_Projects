import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator implements ActionListener
{
	int result,num1,num2;
	JFrame f;
	JPanel p;
	JLabel l1,l2,l3;
	JTextField no1,no2,ans;
	JButton add,subtract,multiply,divide;
	
	void Calculator()
	{
		f = new JFrame();
		p = new JPanel();

		l1 = new JLabel("NO 1");
		l1.setBounds(100,30,100,30);
		l1. setFont(new Font("Arial", Font. PLAIN, 15));
		f.add(l1);
		
		no1 = new JTextField();
		no1.setBounds(190,30,100,30);
		no1. setFont(new Font("Arial", Font. PLAIN, 15));
		f.add(no1);
		
		l2 = new JLabel("NO 2");
		l2.setBounds(100,100,100,30);
		l2. setFont(new Font("Arial", Font. PLAIN, 15));
		f.add(l2);
		
		no2 = new JTextField();
		no2.setBounds(190,100,100,30);
		no2. setFont(new Font("Arial", Font. PLAIN, 15));
		f.add(no2);
		
		l3 = new JLabel("ANSWER");
		l3.setBounds(100,170,100,30);
		l3. setFont(new Font("Arial", Font. PLAIN, 15));
		f.add(l3);
		
		ans = new JTextField();
		ans.setBounds(190,170,100,30);
		ans. setFont(new Font("Arial", Font. PLAIN, 15));
		f.add(ans);
		
		add = new JButton("+");
		add. setFont(new Font("Arial", Font. PLAIN, 40));
		p.add(add);
		add.addActionListener(this);
		
		subtract = new JButton("-");
		subtract. setFont(new Font("Arial", Font. PLAIN, 40));
		p.add(subtract);
		subtract.addActionListener(this);
		
		multiply = new JButton("*");
		multiply. setFont(new Font("Arial", Font. PLAIN, 40));
		p.add(multiply);
		multiply.addActionListener(this);
		
		divide = new JButton("/");
		divide. setFont(new Font("Arial", Font. PLAIN, 40));
		p.add(divide);
		divide.addActionListener(this);
		
		p.setBounds(90,250,200,200);  
		p.setLayout(new GridLayout(2,2));
		p.setVisible(true);
		
		f.add(p);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(420,500);
		f.setLocationRelativeTo(null);
	}

	public static void main(String args[])
	{
		SimpleCalculator c = new SimpleCalculator();
		c.Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == add)
		{
			num1 = Integer.parseInt(no1.getText());
			num2 = Integer.parseInt(no2.getText());
			result = num1 + num2;
			ans.setText(Integer.toString(result));
		}
		
		if(e.getSource() == subtract)
		{
			num1 = Integer.parseInt(no1.getText());
			num2 = Integer.parseInt(no2.getText());
			result = num1 - num2;
			ans.setText(Integer.toString(result));
		}
		
		if(e.getSource() == multiply)
		{
			num1 = Integer.parseInt(no1.getText());
			num2 = Integer.parseInt(no2.getText());
			result = num1 * num2;
			ans.setText(Integer.toString(result));
		}
		
		if(e.getSource() == divide)
		{
			num1 = Integer.parseInt(no1.getText());
			num2 = Integer.parseInt(no2.getText());
			result = num1 / num2;
			ans.setText(Integer.toString(result));
		}
	}
}
