package UNIT_04;


	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;

	public class P17_CalculatorSwing {

		public static void main(String[] args) {
			SwingIn_Java ob=new SwingIn_Java();
		}

	}
	class SwingIn_Java extends JFrame{
		JTextField t1,t2;
		JButton b1,b2,b3;
		JLabel l1;
		
		SwingIn_Java(){
			t1=new JTextField(20);
			t2=new JTextField(20);
			b1=new JButton("Sum");
			b2=new JButton("Multiply");
			b3=new JButton("SUbtract");
			l1=new JLabel("Result");
			add(t1);
			add(t2);
			add(b1);
			add(b2);
			add(b3);
			add(l1);
			ActionListener al=new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int a1=Integer.parseInt(t1.getText());
					int a2=Integer.parseInt(t2.getText());
					if(e.getSource()==b1) {
						Integer sum=a1+a2;
						l1.setText(sum.toString());
					}
					if(e.getSource()==b2) {
						Integer mul=a1*a2;
						l1.setText(mul.toString());
					}
					if(e.getSource()==b3) {
						Integer sub=a1-a2;
						l1.setText(sub.toString());
					}
				}
			};
			b1.addActionListener(al);
			b2.addActionListener(al);
			b3.addActionListener(al);
			setLayout(new FlowLayout());
			setVisible(true);
			setSize(400,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

