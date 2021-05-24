import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestLogin {

	private JFrame frame;
	private JTextField UserNameTextField;
	private JTextField PasswordTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestLogin window = new TestLogin();
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
	public TestLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 674, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton LoginButton = new JButton("Login");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(UserNameTextField.getText().equals("Tan") && PasswordTextField.getText().equals("abc123")) 
						JOptionPane.showMessageDialog(null, "Login Successful");
					else
						JOptionPane.showMessageDialog(null, "Login Unsuccessful");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right user name and password");
				}
			}
		});
		LoginButton.setFont(new Font("Tahoma", Font.PLAIN, 28));
		LoginButton.setBounds(245, 290, 181, 60);
		frame.getContentPane().add(LoginButton);
		
		JLabel NameLabel = new JLabel("User Name");
		NameLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		NameLabel.setBounds(141, 121, 170, 60);
		frame.getContentPane().add(NameLabel);
		
		JLabel PasswordLabel = new JLabel("Password");
		PasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		PasswordLabel.setBounds(140, 199, 132, 54);
		frame.getContentPane().add(PasswordLabel);
		
		UserNameTextField = new JTextField();
		UserNameTextField.setBounds(346, 138, 181, 41);
		frame.getContentPane().add(UserNameTextField);
		UserNameTextField.setColumns(10);
		
		PasswordTextField = new JTextField();
		PasswordTextField.setBounds(346, 213, 181, 41);
		frame.getContentPane().add(PasswordTextField);
		PasswordTextField.setColumns(10);
	}
}
