package com.hepsiburada.test;

import com.hepsiburada.base.BaseTest;
import com.hepsiburada.page.MainPage;
import com.hepsiburada.util.ReadProperties;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class OrderCheckTests extends BaseTest {

    @Test
    public void bankNameCheckInOrderSummary(){
        WebDriver driver = null;
        new MainPage(driver)
                .login(ReadProperties.getCustomerNo(), ReadProperties.getPassword())
                .checkOpenMainPage()
                .checkOpenMainPage()
                .addProduct()
                .callShoppingCartsPage()
                .checkOpenShoppingCart()
                .callInstallmentPage()
                .checkOpenInstallmentPage()
                .callPaymentPage()
                .checkOpenPaymentPageAndGoToInstantTransfer()
                .chooseYourBankToPayWithInstantTransfer(bankName)
                .chooseInstantBank(bankName)
                .callSummaryPage()
                .checkSummaryBankName(bankName);
    }
}
