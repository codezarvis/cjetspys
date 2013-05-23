package com.bank.views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerView extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	public CustomerView() {
		setVisible(true);
		setSize(600, 600);
		setTitle("Customer Form");
		// getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().setLayout(null);

		JLabel label = new JLabel("");
		label.setBounds(270, 123, 46, 14);
		getContentPane().add(label);

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstName.setBounds(27, 123, 96, 14);
		getContentPane().add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLastName.setBounds(27, 161, 120, 14);
		getContentPane().add(lblLastName);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGender.setBounds(27, 197, 120, 14);
		getContentPane().add(lblGender);

		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateOfBirth.setBounds(27, 232, 96, 14);
		getContentPane().add(lblDateOfBirth);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(27, 268, 109, 14);
		getContentPane().add(lblEmail);

		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMobile.setBounds(27, 304, 109, 14);
		getContentPane().add(lblMobile);

		JLabel lblSignature = new JLabel("Signature");
		lblSignature.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSignature.setBounds(27, 371, 109, 14);
		getContentPane().add(lblSignature);

		JLabel lblCustomerForm = new JLabel("Customer Form");
		lblCustomerForm.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCustomerForm.setBounds(210, 11, 171, 28);
		getContentPane().add(lblCustomerForm);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setBounds(164, 81, 191, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_2.setBounds(164, 123, 191, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_3.setBounds(164, 160, 191, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);

		final JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Male",
				"Female" }));
		comboBox.setBounds(164, 196, 191, 20);
		getContentPane().add(comboBox);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_5.setBounds(164, 267, 191, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_6.setBounds(164, 303, 191, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_7.setBounds(164, 334, 191, 20);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_8.setBounds(164, 370, 191, 20);
		getContentPane().add(textField_8);
		textField_8.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_4.setBounds(164, 231, 191, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);

		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUserName.setBounds(27, 84, 96, 14);
		getContentPane().add(lblUserName);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(164, 50, 191, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblAccountNum = new JLabel("Account Num");
		lblAccountNum.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAccountNum.setBounds(27, 53, 96, 14);
		getContentPane().add(lblAccountNum);

		JButton btnGenerate = new JButton("Generate");
		btnGenerate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnGenerate.setBounds(381, 49, 89, 23);
		getContentPane().add(btnGenerate);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String accountNum = textField.getText();
				String userName = textField_1.getText();
				String firstName = textField_2.getText();
				String lastName = textField_3.getText();
				String gender = comboBox.getSelectedItem().toString();
				String dateOfBirth = textField_4.getText();
				String email = textField_5.getText();
				String mobile = textField_6.getText();
				String userPic = textField_7.getText();
				String signature = textField_8.getText();
				if (accountNum.length() == 0 || accountNum == null) {
					JOptionPane.showMessageDialog(null,
							"account number is required");
					return;
				}
				if (userName.length() == 0 || userName == null) {
					JOptionPane
							.showMessageDialog(null, "User Name is required");
					return;

				}
				if (firstName.length() == 0 || firstName == null) {
					JOptionPane.showMessageDialog(null,
							"First Name is required");
					return;
				}
				if (lastName.length() == 0 || lastName == null) {
					JOptionPane
							.showMessageDialog(null, "Last Name is required");
					return;
				}
				if (dateOfBirth.length() == 0 || dateOfBirth == null) {
					JOptionPane.showMessageDialog(null,
							"DateOfBirth is required");
					return;
				}
				if (email.length() == 0 || email == null) {
					JOptionPane.showMessageDialog(null, "Email is required");
					return;
				}
				if (mobile.length() == 0 || mobile == null) {
					JOptionPane.showMessageDialog(null,
							"Mobile Number is required");
					return;
				}
				if (userPic.length() == 0 || userPic == null) {
					JOptionPane.showMessageDialog(null,
							"User Picture is required");
					return;
				}
				if (signature.length() == 0 || signature == null) {
					JOptionPane
							.showMessageDialog(null, "Signature is required");
					return;
				}
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSubmit.setBounds(164, 411, 89, 23);
		getContentPane().add(btnSubmit);

		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBrowse.setBounds(381, 333, 89, 23);
		getContentPane().add(btnBrowse);

		JButton btnBrowse_1 = new JButton("Browse");
		btnBrowse_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBrowse_1.setBounds(381, 369, 89, 23);
		getContentPane().add(btnBrowse_1);

		JLabel lbl = new JLabel();
		lbl.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null,
				null));
		lbl.setBounds(381, 123, 89, 88);
		getContentPane().add(lbl);

		JLabel lblSig = new JLabel();

		lblSig.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		lblSig.setBounds(381, 232, 89, 84);
		getContentPane().add(lblSig);

		JLabel lblCustomerPicture = new JLabel("Customer Picture");
		lblCustomerPicture.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCustomerPicture.setBounds(27, 338, 120, 14);
		getContentPane().add(lblCustomerPicture);

		JLabel lblSignature_1 = new JLabel("Signature");
		lblSignature_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSignature_1.setBounds(397, 219, 89, 14);
		getContentPane().add(lblSignature_1);

		JLabel lblUserPicture = new JLabel("User Picture");
		lblUserPicture.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUserPicture.setBounds(397, 110, 89, 14);
		getContentPane().add(lblUserPicture);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField.requestFocus();
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReset.setBounds(270, 412, 89, 23);
		getContentPane().add(btnReset);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new CustomerView();

	}
}
