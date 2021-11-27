package com.hepsiburada.constants;

import com.hepsiburada.base.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Summary_Constants  extends BasePageUtil {
    public Summary_Constants(WebDriver driver) {
        super(driver);
    }
    public By SUMMARYBANKNAME = By.cssSelector(".modal_bank_details_lfXb9 .detail_20j8y:nth-of-type(1) span:nth-of-type(2)");
}
