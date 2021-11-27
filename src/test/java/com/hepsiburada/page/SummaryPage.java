package com.hepsiburada.page;

import com.hepsiburada.constants.Summary_Constants;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SummaryPage extends Summary_Constants {
    public SummaryPage(WebDriver driver) {
        super(driver);
    }

    public SummaryPage checkSummaryBankName(String bankName){
        try {
            if (!getElementBy(SUMMARYBANKNAME).getText().contains(bankName)){

            }
            Assert.assertTrue("Banka eşleşmesi başarısız oldu!!!", getElementBy(SUMMARYBANKNAME).getText().contains(bankName));
            System.out.println("Banka eşleşmesi başarılı oldu!!!");
            return this;
        }
        catch (Exception ex){

        }
        return this;
    }
}
