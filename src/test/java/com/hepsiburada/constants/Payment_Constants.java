package com.hepsiburada.constants;

import com.hepsiburada.base.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Payment_Constants extends BasePageUtil {
    public Payment_Constants(WebDriver driver) {
        super(driver);
    }
    //ödeme yöntemleri inspect edilir
    public By PAYMENTMETHODS = By.id("payment-methods");
    // Anında havale butonu
    public By INSTATREMITTANCE = By.cssSelector("div:nth-of-type(2) h3");
    //banka listesi
    public By BANKNAME = By.cssSelector("div#payment-money-transfer > div > div:nth-of-type(1) .sardesPaymentPage-MoneyTransfer-money_transfer_header  .sardesPaymentPage-MoneyTransfer-bank_name");

    //Tüm bankaların isimleri
    public By AKBANK = By.xpath("//*/text()[normalize-space(.)='Akbank']/parent::*");
    public By VAKIFBANK = By.xpath("//*/text()[normalize-space(.)='Vakıfbank']/parent::*");
    public By ISBANKASI = By.xpath("//*/text()[normalize-space(.)='İş Bankası']/parent::*");
    public By KUVEYTTURK = By.xpath("//*/text()[normalize-space(.)='Kuveyt Türk']/parent::*");
    public By ALBARAKA = By.xpath("//*/text()[normalize-space(.)='AlBaraka Türk']/parent::*");

    //radiobutton
    public By INSTANTAKBANK = By.xpath("/html//div[@id='payment-money-transfer']/div/div[1]//form//input[@name='Akbank']");
    public By INSTANTISBANKASI = By.name("İş Bankası");
    public By INSTANTVAKIFBANK = By.xpath("/html//div[@id='payment-money-transfer']/div/div[3]//form//input[@name='Vakıfbank']");
    public By INSTANTKUVEYTTURK = By.xpath("/html//div[@id='payment-money-transfer']/div/div[4]//form//input[@name='Kuveyt Türk']");
    public By INSTANTALBARAKA = By.xpath("/html//div[@id='payment-money-transfer']/div/div[5]//form//input[@name='AlBaraka Türk']");
}
