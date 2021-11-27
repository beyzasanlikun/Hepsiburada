package com.hepsiburada.page;

import com.hepsiburada.constants.Installment_Constants;
import com.hepsiburada.util.WaitTool;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class InstallmentPage extends Installment_Constants {
    public InstallmentPage(WebDriver driver) {
        super(driver);
    }

    public InstallmentPage checkOpenInstallmentPage(){
        try {
            Assert.assertTrue("Teslimat sayfası açılamadı", WaitTool.waitElementDisplay(driver, INSTALLMENTS, 10));//Teslimat bilgileri sayfası kontrolü
            return this;
        }
        catch (Exception ex){

        }
        return this;
    }

    public PaymentPage callPaymentPage(){
        try {
            clickContinueStepButton();
            sleep(1000);
            return new PaymentPage(driver);
        }
        catch (Exception ex){

        }
        return new PaymentPage(driver);
    }
}
