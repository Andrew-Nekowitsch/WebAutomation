package com.company.GUI;

import com.company.LoginInformation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChromeButton extends JButton {

	LoginCredentialsPanel login_Panel;

	public ChromeButton(LoginCredentialsPanel p_Panel) {
		super("Chrome");
		this.addActionListener(new ChromeButtonActionListener());
		login_Panel = p_Panel;
	}

	private class ChromeButtonActionListener implements ActionListener {

		private WebDriver driver;
		private final String address = "https://www.stcloudstate.edu/its/services/academic/";
		private LoginInformation info;

		public void actionPerformed(ActionEvent e) {

			//take the login information from the text fields
			info = new LoginInformation(
					login_Panel.getUsername_Text_Field().getText(),
					login_Panel.getPassword_Text_Field().getText());

			//validate that there is something in both of the
			//text fields
			if (info.getUsername().length() > 0 &&
					info.getPassword().length() > 0) {

				//setup the chrome driver
				InitializeChrome();

				//login to the d2l website
				info.D2LLogin(driver);

				//remove the gui
				System.exit(0);

			}   //end if
		}

		//setup the chrome driver
		private void InitializeChrome() {
			try {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Program Files\\Java\\chromedriver.exe");

				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(address);

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}