package com.hepsiburada.constants;

import com.hepsiburada.base.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main_Constants extends BasePageUtil {
    public Main_Constants(WebDriver driver) {
        super(driver);
    }

    public By MYACCOUNT = By.id("myAccount");
    public By LOGIN = By.id("login");
    public By USERNAME = By.id("txtUserName");
    public By PASSWORD = By.id("txtPassword");
    public By BTNLOGIN = By.id("btnLogin");
    public By BTNEMAILSELECT = By.id("btnEmailSelect");
}
