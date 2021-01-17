/**
 * 
 * https://www.youtube.com/watch?v=J44d_ynAqNY
 * 14ºÐ
 */

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private String func = "";
	private double firstNumber = 0.0;

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
		frame.setBounds(100, 100, 415, 645);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(11, 219, 83, 83);
		btn7.setFont(new Font("±¼¸²", Font.BOLD, 16));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		JLabel answer = new JLabel("0");
		answer.setFont(new Font("±¼¸²", Font.BOLD, 50));
		answer.setHorizontalAlignment(SwingConstants.RIGHT);
		answer.setBounds(11, 61, 359, 49);
		frame.getContentPane().add(answer);
		
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(106, 219, 83, 83);
		btn8.setFont(new Font("±¼¸²", Font.BOLD, 16));
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(201, 219, 83, 83);
		btn9.setFont(new Font("±¼¸²", Font.BOLD, 16));
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Double.parseDouble(curr);
				answer.setText("0");
				func = "ADD";
			}
		});
		btnPlus.setBounds(296, 219, 83, 83);
		btnPlus.setFont(new Font("±¼¸²", Font.BOLD, 16));
		frame.getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Double.parseDouble(curr);
				answer.setText("0");
				func = "MINUS";
			}			
		});
		btnMinus.setBounds(296, 312, 83, 83);
		btnMinus.setFont(new Font("±¼¸²", Font.BOLD, 16));
		frame.getContentPane().add(btnMinus);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(201, 312, 83, 83);
		btn6.setFont(new Font("±¼¸²", Font.BOLD, 16));
		frame.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(106, 312, 83, 83);
		btn5.setFont(new Font("±¼¸²", Font.BOLD, 16));
		frame.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(11, 312, 83, 83);
		btn4.setFont(new Font("±¼¸²", Font.BOLD, 16));
		frame.getContentPane().add(btn4);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Double.parseDouble(curr);
				answer.setText("0");
				func = "MULTI";
			}			
		});
		btnX.setBounds(296, 405, 83, 83);
		btnX.setFont(new Font("±¼¸²", Font.BOLD, 16));
		frame.getContentPane().add(btnX);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(201, 405, 83, 83);
		btn3.setFont(new Font("±¼¸²", Font.BOLD, 16));
		frame.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(106, 405, 83, 83);
		btn2.setFont(new Font("±¼¸²", Font.BOLD, 16));
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(11, 405, 83, 83);
		btn1.setFont(new Font("±¼¸²", Font.BOLD, 16));
		frame.getContentPane().add(btn1);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Double.parseDouble(curr);
				answer.setText("0");
				func = "DIV";
			}			
		});
		btnDiv.setBounds(296, 498, 83, 83);
		btnDiv.setFont(new Font("±¼¸²", Font.BOLD, 16));
		frame.getContentPane().add(btnDiv);
		
		JButton btnEnter = new JButton("=");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				int firstNumberToInt = 0;
				switch(func) {
					case "ADD" :
						firstNumber = firstNumber + Double.parseDouble(curr);
						break;
					case "MINUS" :
						firstNumber = firstNumber - Double.parseDouble(curr);
						answer.setText(Double.toString(firstNumber));
						break;
					case "MULTI" :
						firstNumber = firstNumber * Double.parseDouble(curr);
						answer.setText(Double.toString(firstNumber));
						break;
					case "DIV" :
						firstNumber = firstNumber / Double.parseDouble(curr);
						break;
				}
				if(curr.contains(".")) {
					answer.setText(Double.toString(firstNumber));
				}else {
				    firstNumberToInt = Integer.parseInt(String.valueOf(Math.round(firstNumber)));
					answer.setText(Integer.toString(firstNumberToInt));
				}	
			}		
			
		});
		btnEnter.setBounds(12, 125, 177, 83);
		btnEnter.setFont(new Font("±¼¸²", Font.BOLD, 16));
		frame.getContentPane().add(btnEnter);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new NumberActionListener(answer, "0"));
		btn0.setBounds(11, 498, 178, 83);
		btn0.setFont(new Font("±¼¸²", Font.BOLD, 16));
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setBounds(201, 498, 83, 83);
		btnDot.setFont(new Font("±¼¸²", Font.BOLD, 16));
		frame.getContentPane().add(btnDot);
		
		JButton btnDel = new JButton("\u2190");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				if(curr.length() <= 1) {
					answer.setText("0");
				}else {
					answer.setText(curr.substring(0,curr.length()-1));
				}
			}	
		});
		btnDel.setFont(new Font("±¼¸²", Font.BOLD, 16));
		btnDel.setBounds(296, 125, 83, 83);
		frame.getContentPane().add(btnDel);
		
		btn1.addActionListener(new NumberActionListener(answer,"1"));
		btn2.addActionListener(new NumberActionListener(answer,"2"));
		btn3.addActionListener(new NumberActionListener(answer,"3"));
		btn4.addActionListener(new NumberActionListener(answer,"4"));
		btn5.addActionListener(new NumberActionListener(answer,"5"));
		btn6.addActionListener(new NumberActionListener(answer,"6"));
		btn7.addActionListener(new NumberActionListener(answer,"7"));
		btn8.addActionListener(new NumberActionListener(answer,"8"));
		btn9.addActionListener(new NumberActionListener(answer,"9"));
		btnDot.addActionListener(new NumberActionListener(answer,"."));
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				func = "";
				firstNumber = 0.0;
				answer.setText("0");
			}
		});
		btnClear.setFont(new Font("±¼¸²", Font.BOLD, 16));
		btnClear.setBounds(200, 125, 83, 83);
		frame.getContentPane().add(btnClear);
		
	}
}

class NumberActionListener implements ActionListener{
	private JLabel label;
	private String text;
	
	public NumberActionListener(JLabel l, String s) {
		label = l;
		text = s;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String curr = label.getText();
		//Ã¹±ÛÀÚ¸¸...
		if(curr.equals("0")) {
			label.setText(text);
		}else {
			label.setText(curr+text);
		}
	}
}

