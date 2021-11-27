package com.hepsiburada.page;

import com.hepsiburada.constants.AllTransaction_Constants;
import com.hepsiburada.util.WaitTool;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class AllTransactionPage extends AllTransaction_Constants {
    public AllTransactionPage(WebDriver driver) {
        super(driver);
    }

    public AllTransactionPage checkOpenMainPage(){
        try {
            sleep(1000);
            Assert.assertTrue("Ana sayfa açılamadı", WaitTool.waitElementDisplay(driver, SHOPPINGCART, 10));//Login sonrası ana sayfa açılış kontrolü
            sleep(1000);
            return new AllTransactionPage(driver);
        }
        catch (Exception ex){
            
        }
        return this;
    }


    public AllTransactionPage addProduct(){
        try{
            sleep(1000);
            clickObjectBy(MENUITEM);
            HoverElement(MENUITEM,false);
            clickObjectBy(BESTSELLERS);
            waitForElement(driver,15,TITLEWRAPPER);
            Assert.assertTrue("Çok satılan kitaplar menüsü açılamadı",getElementBy(SEARCHRESULTSTITLE).getText().contains("Çok Satan Kitaplar"));//Çok satılan kitaplar menüsü kontrolü
            HoverElement(BOOK,false);
            return new AllTransactionPage(driver);
        }
        catch (Exception ex){
            
        }
        return this;
    }

    public ShoppingCartPage callShoppingCartsPage(){
        try {
            clickObjectBy(ADDBASKETBTN);
            sleep(1000);
            return new ShoppingCartPage(driver);
        }
        catch (Exception ex){
            
        }
        return new ShoppingCartPage(driver);
    }

    

}
