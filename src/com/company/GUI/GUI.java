package com.company.GUI;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

	private JPanel button_Panel;
	private JButton chrome_Button;
	private LoginCredentialsPanel login_Panel;


	public GUI() {
		//instantiate
		super("D2L Login");
		login_Panel = new LoginCredentialsPanel();
		BuildButtonPanel();

		setLayout(new GridLayout(2, 1));
		add(login_Panel);
		add(button_Panel);

		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 150);
		setVisible(true);
	}

	private void BuildButtonPanel() {

		try {
			button_Panel = new JPanel();

			//add chrome button
			chrome_Button = new ChromeButton(login_Panel);
			button_Panel.add(chrome_Button);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}