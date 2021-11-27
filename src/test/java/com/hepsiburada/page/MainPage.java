package com.hepsiburada.page;

import com.hepsiburada.constants.Main_Constants;
import com.hepsiburada.util.WaitTool;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class MainPage extends Main_Constants {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public AllTransactionPage login(String customerNo, String password) {
        try {
            Assert.assertTrue("Ana sayfa açılamadı", WaitTool.waitElementDisplay(driver, MYACCOUNT, 10));//Ana sayfanın açıldığının kontrolü
            HoverElement(MYACCOUNT, true);
            clickObjectBy(LOGIN);
            Assert.assertTrue("Login sayfası açılamadı", WaitTool.waitElementDisplay(driver, USERNAME, 10));//Login sayfasının açıldığının kontrolü
            if (!isElementPresentAndDisplay(PASSWORD)) {
                setObjectBy(USERNAME, customerNo);
                clickObjectBy(BTNLOGIN);
                setObjectBy(PASSWORD, password);
                clickObjectBy(BTNEMAILSELECT);
            } else {
                setObjectBy(USERNAME, customerNo);
                setObjectBy(PASSWORD, password);
                clickObjectBy(BTNLOGIN);
            }
        }
        catch (Exception ex){

        }
        return new AllTransactionPage(driver);
    }

    private boolean isElementPresentAndDisplay(By password) {
        try {
            By by = null;
            return driver.findElement(by).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
