package com.hepsiburada.base;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private static Object WebDriverManager;
    private static WebDriver driver;
    public static String browserName= "chrome";
    public static String baseUrl = "https://www.hepsiburada.com/";
    public static String bankName = "Akbank";

    @BeforeClass
    public void setUpClass() throws InterruptedException{
       /* switch (browserName){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
        }*/
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver","src/test/drivers/chromedriver.exe");
        this.driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Before
    public void setUp() throws Exception{
        switch (browserName){
            case "chrome":
                driver= new ChromeDriver();
                break;
            case "firefox":
                driver= new FirefoxDriver();
                break;
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println(baseUrl);
        driver.get(baseUrl);
        System.out.println("Browser Name = " + browserName);
    }

    @After
    public void tearDown() throws Exception{
        driver.quit();
    }

}
