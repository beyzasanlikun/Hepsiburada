package com.hepsiburada.constants;

import com.hepsiburada.base.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart_Constants extends BasePageUtil {
    public ShoppingCart_Constants(WebDriver driver) {
        super(driver);
    }
//sepete ekleme
    public By ADDTOCART = By.id("addToCart");
    public By PRODUCTCARTMESSAGE = By.cssSelector(".checkoutui-SalesFrontCash-XeG2a");
    public By GOTOCARTBUTTON = By.cssSelector("button[type ='button']");
    public By MYORDERS = By.xpath("/html//div[@id='app']/div[@class='main_layout_1yjd1']/div[@class='basket_layout_t5aTY']//div[@class='basket_header_MxGOQ']/div/div/div/div//a[@title='Siparişlerim']/div");
    public By GOTOSHOPPINGCART = By.linkText("Sepete git");
    public By SHOPPINGCART = By.id("shoppingCart");
}
