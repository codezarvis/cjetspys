package com.bank.views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class ChangePasswordView extends JFrame{
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	public ChangePasswordView() {
		getContentPane().setBackground(Color.GRAY);
		setTitle("Change Password");
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().setLayout(null);
		
		JLabel lblChangePassword = new JLabel("Change Password");
		lblChangePassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblChangePassword.setBounds(222, 24, 194, 45);
		getContentPane().add(lblChangePassword);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUserName.setBounds(53, 90, 145, 14);
		getContentPane().add(lblUserName);
		
		JLabel lblOldPassword = new JLabel("Old Password");
		lblOldPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOldPassword.setBounds(53, 143, 145, 14);
		getContentPane().add(lblOldPassword);
		
		JLabel lblConformPassword = new JLabel("Conform Password");
		lblConformPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConformPassword.setBounds(53, 243, 139, 14);
		getContentPane().add(lblConformPassword);
		
		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewPassword.setBounds(53, 189, 145, 14);
		getContentPane().add(lblNewPassword);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(256, 89, 231, 23);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSubmit.setBounds(185, 295, 89, 23);
		getContentPane().add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReset.setBounds(300, 295, 89, 23);
		getContentPane().add(btnReset);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		passwordField.setBounds(256, 139, 231, 23);
		getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		passwordField_1.setBounds(256, 185, 231, 23);
		getContentPane().add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		passwordField_2.setBounds(256, 239, 231, 23);
		getContentPane().add(passwordField_2);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
