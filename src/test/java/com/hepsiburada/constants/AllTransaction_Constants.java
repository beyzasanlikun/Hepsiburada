package com.hepsiburada.constants;

import com.hepsiburada.base.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllTransaction_Constants extends BasePageUtil {
    public AllTransaction_Constants(WebDriver driver) {
        super(driver);
    }

    public By SHOPPINGCART = By.id("shoppingCart");
    public By DELETEPRODUCT = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Kaldır'])[1]/preceding::*[name()='svg'][1]");
    public By DELETEPRODUCTBUTTON = By.cssSelector("button[class='sc-AxjAm iDSyON sflButton_2fKbY']");
    public By HEPSIBURADA = By.cssSelector("a[title='Hepsiburada'] > svg");
    public By PRODUCTMESSAGE = By.xpath("/html//div[@id='app']/div[@class='main_layout_1yjd1']/div[@class='basket_layout_t5aTY']//div[@class='basket_container_1VEW_']//h1[.='Sepetin şu an boş']");
    public By CARDITEMCOUNT = By.id("cartItemCount");
    public By MYORDERS = By.xpath("/html//div[@id='app']/div[@class='main_layout_1yjd1']/div[@class='basket_layout_t5aTY']//div[@class='basket_header_MxGOQ']/div/div/div/div//a[@title='Siparişlerim']/div");
    public By ADDBASKETBTN = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='%'])[1]/following::button[1]");
    public By MENUITEM = By.xpath("//*/text()[normalize-space(.)='Kitap, Müzik, Film, Hobi']/parent::*");
    public By BESTSELLERS = By.linkText("Çok Satanlar");
    public By BOOK = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='%'])[1]/following::button[1]");
    public By SEARCHRESULTSTITLE = By.cssSelector(".search-results-title");
    public By TITLEWRAPPER = By.cssSelector(".title-wrapper");


}