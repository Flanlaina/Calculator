package calc;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class Main {

	private JFrame frmCalculator;
	private JTextField textField;
	private JButton btnBksp;
	private JButton btnC;
	private JButton btnDiv;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnMult;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnMinus;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnPlus;
	private JButton btn0;
	private JButton btnDot;
	private JButton btnEqual;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Main window = new Main();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public double num,ans;
	public int  oper;
	private JLabel lbl1;
	boolean calculated = false;

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}
	public void arithmeticOper() {
		switch(oper)
		{
		case 1://Addition
			ans = num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 2://Subtraction
			ans = num - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 3://Multiplication
			ans = num * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 4://Division
			ans = num / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		}
		calculated = true;
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setResizable(false);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 420, 456);
		frmCalculator.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 39, 384, 52);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				oper = 4;
				textField.setText("");
				lbl1.setText(num + "/");
				calculated = false;
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv.setBounds(305, 102, 89, 52);
		frmCalculator.getContentPane().add(btnDiv);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				calculated = false;
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setBounds(206, 102, 89, 52);
		frmCalculator.getContentPane().add(btnC);
		
		btnBksp = new JButton("<--");
		btnBksp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int length = textField.getText().length();
				int number = textField.getText().length() - 1;
				if(length > 0 && !calculated) {
					StringBuilder back = new StringBuilder(textField.getText());
					back.deleteCharAt(number);
					textField.setText(back.toString());
				}
			}
		});
		btnBksp.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBksp.setBounds(107, 102, 89, 52);
		frmCalculator.getContentPane().add(btnBksp);
		
		btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				oper = 3;
				textField.setText("");
				lbl1.setText(num + "*");
				calculated = false;
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMult.setBounds(305, 165, 89, 52);
		frmCalculator.getContentPane().add(btnMult);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!calculated) {
					textField.setText(textField.getText() + "9");
				}
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(206, 165, 89, 52);
		frmCalculator.getContentPane().add(btn9);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!calculated) {
					textField.setText(textField.getText() + "8");
				}
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(107, 165, 89, 52);
		frmCalculator.getContentPane().add(btn8);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!calculated) {
					textField.setText(textField.getText() + "7");
				}
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(8, 165, 89, 52);
		frmCalculator.getContentPane().add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!calculated) {
					textField.setText(textField.getText() + "4");
				}
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(8, 228, 89, 52);
		frmCalculator.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!calculated) {
					textField.setText(textField.getText() + "5");
				}
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(107, 228, 89, 52);
		frmCalculator.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!calculated) {
					textField.setText(textField.getText() + "6");
				}
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(206, 228, 89, 52);
		frmCalculator.getContentPane().add(btn6);
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				oper = 2;
				textField.setText("");
				lbl1.setText(num + "-");
				calculated = false;
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMinus.setBounds(305, 228, 89, 52);
		frmCalculator.getContentPane().add(btnMinus);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				oper = 1;
				textField.setText("");
				lbl1.setText(num + "+");
				calculated = false;
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(305, 291, 89, 52);
		frmCalculator.getContentPane().add(btnPlus);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!calculated) {
					textField.setText(textField.getText() + "3");
				}
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(206, 291, 89, 52);
		frmCalculator.getContentPane().add(btn3);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!calculated) {
					textField.setText(textField.getText() + "1");
				}
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(107, 291, 89, 52);
		frmCalculator.getContentPane().add(btn2);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!calculated) {
					textField.setText(textField.getText() + "1");
				}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(8, 291, 89, 52);
		frmCalculator.getContentPane().add(btn1);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!calculated) {
					textField.setText(textField.getText() + "0");
				}
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(8, 354, 89, 52);
		frmCalculator.getContentPane().add(btn0);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String content = textField.getText();
				if (!calculated && !content.contains(".")) {
						textField.setText(textField.getText() + ".");
				}
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(107, 354, 89, 52);
		frmCalculator.getContentPane().add(btnDot);
		
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				arithmeticOper();
				lbl1.setText("");
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(206, 354, 188, 52);
		frmCalculator.getContentPane().add(btnEqual);
		
		lbl1 = new JLabel("");
		lbl1.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl1.setForeground(new Color(255, 0, 0));
		lbl1.setBounds(305, 14, 89, 14);
		frmCalculator.getContentPane().add(lbl1);
	}
}
