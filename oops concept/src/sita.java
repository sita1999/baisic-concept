import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
class Form extends JFrame implements ActionListener {
	JTextField txt1,txt2,txt3;
	JButton btn,btn1;
	public Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE ) ;
		setTitle("demo");
		setSize(400,400);
		setLayout(null);
		JLabel lbl1=new JLabel();
		lbl1.setBounds(60,100,120,40);
		JLabel lbl2=new JLabel();
		lbl2.setBounds(60,140,120,40);
		JLabel lbl3=new JLabel();
		lbl3.setBounds(60,180,120,40);
		
		
		lbl1.setText("enter any number1");
		lbl2.setText("enter any number2");
		lbl3.setText("result");
		add (lbl1);
		add (lbl2);
		add (lbl3);
		

		txt1=new JTextField();
		txt1.setBounds(200,100,100,30);
		txt2=new JTextField();
		txt2.setBounds(200,150,100,30);
		txt3=new JTextField();
		txt3.setBounds (200,190,100,30);
		
		
		add(txt1);
		add(txt2);
		add(txt3);
		 btn=new JButton("+");
		btn.setBounds(100,240,100,30);
		 btn1=new JButton("-");
		btn1.setBounds(210,240,100,30);
		add(btn);
		add(btn1);
		btn.addActionListener(this);
		btn1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int a=Integer.parseInt(txt1.getText());  
		int b=Integer.parseInt(txt2.getText());		
		int c=0;
		if(e.getSource()==btn) {
			c=a+b;
		}else if(e.getSource()==btn1) {
			c=a-b;
		}
		
		txt3.setText(String.valueOf(c));
	}
}


public class sita{		
				public static void main(String[] args) {
					Form frm=new Form();
					frm.setVisible(true);
				}
			}