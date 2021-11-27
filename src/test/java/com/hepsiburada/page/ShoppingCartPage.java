package com.hepsiburada.page;

import com.hepsiburada.constants.ShoppingCart_Constants;
import com.hepsiburada.util.WaitTool;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends ShoppingCart_Constants {
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public ShoppingCartPage checkOpenShoppingCart(){
        try {
            if (isElementPresentAndDisplay(GOTOSHOPPINGCART)) {
                sleep(1000);
                clickObjectBy(GOTOSHOPPINGCART);
                Assert.assertTrue("Siparişlerim sayfası açılamadı", WaitTool.waitElementDisplay(driver, MYORDERS, 10));//Siparişlerim sayfası kontrolü
            }
            else if (isElementPresentAndDisplay(SHOPPINGCART)){
                sleep(1000);
                clickObjectBy(SHOPPINGCART);
                Assert.assertTrue("Siparişlerim sayfası açılamadı", WaitTool.waitElementDisplay(driver, MYORDERS, 10));//Siparişlerim sayfası kontrolü
            }
            else {
                Assert.assertTrue("Sipariş sayfası açılamadı", WaitTool.waitElementDisplay(driver, ADDTOCART, 10));//Sipariş sayfası kontrolü
                Assert.assertTrue("Sepete ürün ekleme işlemi başarısız oldu.", getElementBy(PRODUCTCARTMESSAGE).getText().contains(" Ürün sepetinizde"));//Sepete ürün ekleme alanı kontrolü
                clickObjectBy(GOTOCARTBUTTON);
                Assert.assertTrue("Siparişlerim sayfası açılamadı", WaitTool.waitElementDisplay(driver, MYORDERS, 10));//Siparişlerim sayfası kontrolü
            }
            return this;
        }
        catch (Exception ex){

        }
        return this;
    }

    private boolean isElementPresentAndDisplay(By gotoshoppingcart) {
        try {
            By by = null;
            return driver.findElement(by).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public InstallmentPage callInstallmentPage(){
        try {
            clickContinueStepButton();
            sleep(1000);
            return new InstallmentPage(driver);
        }
        catch (Exception ex){

        }
        return new InstallmentPage(driver);
    }
}
