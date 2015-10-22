package com.engine.search;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Client implements Runnable {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

				try {
					Client client = new Client();
				} catch (Exception e) {
					e.printStackTrace();
				}

	}

	/**
	 * Create the application.
	 */
	public Client() {
		this.run();
	}

	
	public void run() {
		frame = new JFrame();
		frame.setTitle("Uriel & Livne Information Retrieval Application");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(320, 21, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		textField = new JTextField();
		textField.setBounds(32, 22, 278, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		frame.setVisible(true);
		
	}
}
