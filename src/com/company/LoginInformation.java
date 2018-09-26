package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginInformation {
    private String username;
    private String password;

    public LoginInformation(String p_Username, String p_Password) {
        username = p_Username;
        password = p_Password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void D2LLogin(WebDriver driver) {
		driver.findElement(By.id("userName"))
				.sendKeys(getUsername());
		driver.findElement(By.id("password"))
				.sendKeys(getPassword());
		driver.findElement(By.name("Login"))
				.submit();
	}
}
