import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField Num1;
	private JTextField Num2;
	private JTextField Ans;
	private JButton Mul;
	private JButton Div;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 466, 625);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Num1 = new JTextField();
		Num1.setFont(new Font("Tahoma", Font.ITALIC, 24));
		Num1.setBounds(152, 31, 233, 49);
		frame.getContentPane().add(Num1);
		Num1.setColumns(10);
		
		Num2 = new JTextField();
		Num2.setFont(new Font("Tahoma", Font.ITALIC, 24));
		Num2.setBounds(152, 96, 233, 49);
		frame.getContentPane().add(Num2);
		Num2.setColumns(10);
		
		JButton Add = new JButton("+");
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double n1,n2,ans;
			try {
				n1 = Double.parseDouble(Num1.getText());
				n2 = Double.parseDouble(Num2.getText());
				ans = n1 + n2;
				Ans.setText(Double.toString(ans));
				}
			catch (Exception e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "Please Enter Valid Number....");
				}
			}
		});
		Add.setFont(new Font("Tahoma", Font.BOLD, 26));
		Add.setBounds(46, 180, 73, 59);
		frame.getContentPane().add(Add);
		
		JButton Sub = new JButton("-");
		Sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double n1,n2,ans;
				try {
					n1 = Double.parseDouble(Num1.getText());
					n2 = Double.parseDouble(Num2.getText());
					ans = n1 + n2;
					Ans.setText(Double.toString(ans));
					}
				catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number....");
					}
			
			}
		});
		Sub.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		Sub.setBounds(46, 266, 73, 59);
		frame.getContentPane().add(Sub);
		
		Ans = new JTextField();
		Ans.setFont(new Font("Tahoma", Font.BOLD, 24));
		Ans.setBounds(152, 403, 233, 59);
		frame.getContentPane().add(Ans);
		Ans.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ans");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel.setBounds(50, 406, 69, 39);
		frame.getContentPane().add(lblNewLabel);
		
		Mul = new JButton("*");
		Mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double n1,n2,ans;
				try {
					n1 = Double.parseDouble(Num1.getText());
					n2 = Double.parseDouble(Num2.getText());
					ans = n1 * n2;
					Ans.setText(Double.toString(ans));
					}
				catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number....");
					}
			}
		});
		Mul.setFont(new Font("Tahoma", Font.BOLD, 30));
		Mul.setBounds(182, 180, 57, 59);
		frame.getContentPane().add(Mul);
		
		Div = new JButton("/");
		Div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double n1,n2,ans;
				try {
					n1 = Double.parseDouble(Num1.getText());
					n2 = Double.parseDouble(Num2.getText());
					ans = n1 / n2;
					Ans.setText(Double.toString(ans));
					}
				catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number....");
					}
			}
		});
		Div.setFont(new Font("Tahoma", Font.BOLD, 28));
		Div.setBounds(182, 266, 57, 59);
		frame.getContentPane().add(Div);
	}
}
