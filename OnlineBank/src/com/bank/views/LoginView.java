package com.bank.views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the frame.
	 */
	public LoginView() {
		setTitle("BANK HOME");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblRegisteredUsersLogin = new JLabel(
				"Registered Users, Login Here");
		lblRegisteredUsersLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRegisteredUsersLogin.setBounds(119, 93, 268, 31);
		contentPane.add(lblRegisteredUsersLogin);
		
		JLabel lblOnlineBankingApplication = new JLabel("Online Banking Application");
		lblOnlineBankingApplication.setForeground(Color.RED);
		lblOnlineBankingApplication.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblOnlineBankingApplication.setBounds(119, 13, 252, 67);
		contentPane.add(lblOnlineBankingApplication);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Login", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel.setBounds(72, 158, 381, 195);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(32, 39, 89, 16);
		panel.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(32, 91, 89, 16);
		panel.add(lblPassword);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(133, 37, 214, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setBounds(133, 89, 214, 22);
		panel.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(156, 140, 97, 25);
		panel.add(btnLogin);
		
		JButton btnReset = new JButton("ReSet");
		btnReset.setBounds(265, 140, 97, 25);
		panel.add(btnReset);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RegisterView();
			}
		});
		btnRegister.setBounds(191, 405, 97, 25);
		contentPane.add(btnRegister);
		
		JButton btnForgotPassword = new JButton("Forgot Password ??");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnForgotPassword.setBounds(300, 405, 153, 25);
		contentPane.add(btnForgotPassword);
		setVisible(true);
		setSize(500, 500);
	}
}
