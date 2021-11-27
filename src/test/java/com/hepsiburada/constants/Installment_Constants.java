package com.hepsiburada.constants;

import com.hepsiburada.base.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Installment_Constants extends BasePageUtil {
    public Installment_Constants(WebDriver driver) {
        super(driver);
    }
    public By INSTALLMENTS = By.linkText("Teslimat");
}
