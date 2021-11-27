package com.hepsiburada.base;

import com.hepsiburada.util.WaitTool;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import javax.swing.text.Highlighter;

public class BasePageUtil {

    protected WebDriver driver;

    public BasePageUtil(WebDriver driver) { this.driver = driver; }

    protected WebElement setObjectBy(By by, String value) {
        WebElement element = getElementBy(by);
        HighlightElement(element);
        element.clear();
        element.sendKeys(value);
        return element;
    }

    protected void HighlightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
                "color: red; border: 1px dashed red;");
    }

    protected WebElement clickObjectBy(By by) {
        WaitTool.waitForElementClickable(driver, by, 10);
        WebElement element= driver.findElement(by);
        HighlightElement(element);
        element.click();
        return element;
    }

    public WebElement getElementBy(By by) { return driver.findElement(by);}

    protected WebElement clickElementByText(By by, String text){
        WaitTool.waitForElementClickable(driver, by,10);
        WebElement element = driver.findElement(by);
        if (element.getText().contains(text)){
            HighlightElement(element);
            element.click();
        }
        sleep(1000);
        return element;
    }

    public void sleep(long time){
        try{
            Thread.sleep(time);
        } catch (InterruptedException e){}
    }

    public void waitForElement(WebDriver driver, int seconds, By elementBy){
        WebDriverWait wait = new WebDriverWait(driver, seconds, 1000);
        wait.until(ExpectedConditions.presenceOfElementLocated(elementBy));
    }

    protected void HoverElement(By by, boolean click){
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(by);
        action.moveToElement(element).build().perform();
        if (click){
            clickObjectBy(by);
        }
    }

    public void clickContinueStepButton(){
        sleep(500);
        clickObjectBy(By.id("continue_step_btn"));
    }
}

//screenshot kısmı yok
