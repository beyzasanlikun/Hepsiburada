package com.hepsiburada.page;

import com.hepsiburada.constants.Payment_Constants;
import com.hepsiburada.util.WaitTool;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends Payment_Constants {
    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    public PaymentPage checkOpenPaymentPageAndGoToInstantTransfer(){
        try {
            Assert.assertTrue("Ödeme yöntemleri sayfası açılamadı", WaitTool.waitElementDisplay(driver, PAYMENTMETHODS, 10));//Ödeme yöntemleri sayfası kontrolü
            clickObjectBy(INSTATREMITTANCE);
            return this;
        }
        catch (Exception ex){

        }
        return this;
    }

    public PaymentPage chooseYourBankToPayWithInstantTransfer(String bankName){
        try {
            switch (bankName.trim()) {
                case "AlBaraka Türk":
                    clickObjectBy(ALBARAKA);
                    sleep(1000);
                    break;
                case "Vakıfbank":
                    clickObjectBy(VAKIFBANK);
                    sleep(1000);
                    break;
                case "Kuveyt Türk":
                    clickObjectBy(KUVEYTTURK);
                    sleep(1000);
                    break;
                case "Akbank":
                    clickObjectBy(AKBANK);
                    sleep(1000);
                    break;
                case "İş Bankası":
                    clickObjectBy(ISBANKASI);
                    sleep(1000);
                    break;
                default:
                    System.out.println("Anında Havale Ödeme Yönteminde Seçtiğiniz Banka Adını Kontrol Ediniz!!!");

            }
            return this;
        }
        catch (Exception ex){
            System.out.println("Anında Havale Ödeme Yönteminde Seçtiğiniz Banka Adını Kontrol Ediniz!!!");

        }
        return this;
    }

    public PaymentPage chooseInstantBank (String instantBankName){
        try {
            switch (instantBankName.trim()) {
                case "AlBaraka Türk":
                    clickObjectBy(INSTANTALBARAKA);
                    sleep(1000);
                    break;
                case "Vakıfbank":
                    clickObjectBy(INSTANTVAKIFBANK);
                    sleep(1000);
                    break;
                case "Kuveyt Türk":
                    clickObjectBy(INSTANTKUVEYTTURK);
                    sleep(1000);
                    break;
                case "Akbank":
                    clickObjectBy(INSTANTAKBANK);
                    sleep(1000);
                    break;
                case "İş Bankası":
                    clickObjectBy(INSTANTISBANKASI);
                    sleep(1000);
                    break;
                default:
                    System.out.println("Anında Havale Ödeme Yönteminde Seçtiğiniz Banka Adını Kontrol Ediniz!!!");

            }
            return this;
        }
        catch (Exception ex){

        }
        return this;
    }

    public SummaryPage callSummaryPage(){
        try {
            clickContinueStepButton();
            sleep(1000);
            return new SummaryPage(driver);
        }
        catch (Exception ex){

        }
        return new SummaryPage(driver);
    }
}
