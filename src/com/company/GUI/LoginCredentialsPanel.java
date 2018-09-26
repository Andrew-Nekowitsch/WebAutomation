package com.company.GUI;

import javax.swing.*;
import java.awt.*;

public class LoginCredentialsPanel extends JPanel {

	private JTextField username_Text_Field, password_Text_Field;

	public LoginCredentialsPanel() {
		username_Text_Field = new JTextField(10);
		password_Text_Field = new JPasswordField(10);
		Label username_Label = new Label("Username:");
		Label password_Label = new Label("Password:");

		add(username_Label);
		add(username_Text_Field);

		add(password_Label);
		add(password_Text_Field);
	}

	public JTextField getUsername_Text_Field() {
		return username_Text_Field;
	}

	public JTextField getPassword_Text_Field() {
		return password_Text_Field;
	}

}
