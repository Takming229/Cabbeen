package Page;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class APPlocalaction extends BasePage {
    public APPlocalaction login(){
        String URL="http://47.102.164.111:27777/";
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(URL);
        driver.manage().window().maximize();
       findElement(By.cssSelector(".username")).sendKeys("root");
       findElement(By.cssSelector(".pwd")).sendKeys("kb123456");
       findElement(By.id("btn")).click();
        return this;
    }
    public OC_B_SALE_APPLY Order_center(){
      findElement(By.cssSelector(".navigator-primary-menu:nth-child(8)")).click();
        return new OC_B_SALE_APPLY();
    }

}
