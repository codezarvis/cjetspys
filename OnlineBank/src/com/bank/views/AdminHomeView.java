package com.bank.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminHomeView {

	private JFrame frmAdminHome;

	

	/**
	 * Create the application.
	 */
	public AdminHomeView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdminHome = new JFrame();
		frmAdminHome.setVisible(true);
		frmAdminHome.setTitle("Admin Home");
		frmAdminHome.setBounds(100, 100, 450, 300);
		frmAdminHome.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmAdminHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmAdminHome.setJMenuBar(menuBar);
		
		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);
		
		JMenuItem mntmChangePassword = new JMenuItem("Change Password");
		mntmChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChangePasswordView();
			}
		});
		mnHome.add(mntmChangePassword);
		
		JSeparator separator = new JSeparator();
		mnHome.add(separator);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnHome.add(mntmExit);
	}

}
