package Calculation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculation {

	private JFrame frame;
	private JTextField NumTextField;
	private JTextField NumTextField2;
	private JTextField AnsTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculation window = new Calculation();
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
	public Calculation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 609, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton AddButton = new JButton("Add");
		AddButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				int num1, num2, ans;
				
				try {
					num1 = Integer.parseInt(NumTextField.getText());
					num2 = Integer.parseInt(NumTextField2.getText());
					ans = num1 + num2;
					AnsTextField.setText(Integer.toString(ans));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		AddButton.setForeground(Color.BLACK);
		AddButton.setBackground(Color.DARK_GRAY);
		AddButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		AddButton.setBounds(77, 151, 160, 47);
		frame.getContentPane().add(AddButton);
		
		JButton MinusButton = new JButton("Minus");
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1, num2, ans;
				
				try {
					num1 = Integer.parseInt(NumTextField.getText());
					num2 = Integer.parseInt(NumTextField2.getText());
					ans = num1 - num2;
					AnsTextField.setText(Integer.toString(ans));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		MinusButton.setForeground(Color.BLACK);
		MinusButton.setBackground(Color.DARK_GRAY);
		MinusButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		MinusButton.setBounds(347, 151, 154, 47);
		frame.getContentPane().add(MinusButton);
		
		NumTextField = new JTextField();
		NumTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		NumTextField.setBackground(Color.WHITE);
		NumTextField.setBounds(77, 72, 160, 36);
		frame.getContentPane().add(NumTextField);
		NumTextField.setColumns(10);
		
		NumTextField2 = new JTextField();
		NumTextField2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		NumTextField2.setBackground(Color.WHITE);
		NumTextField2.setBounds(347, 72, 154, 36);
		frame.getContentPane().add(NumTextField2);
		NumTextField2.setColumns(10);
		
		AnsTextField = new JTextField();
		AnsTextField.setBackground(Color.WHITE);
		AnsTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		AnsTextField.setBounds(298, 250, 119, 36);
		frame.getContentPane().add(AnsTextField);
		AnsTextField.setColumns(10);
		
		JLabel AnswerLabel = new JLabel("Answer :");
		AnswerLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		AnswerLabel.setBounds(177, 244, 111, 47);
		frame.getContentPane().add(AnswerLabel);
	}
}
