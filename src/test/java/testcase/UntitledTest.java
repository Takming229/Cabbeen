package testcase;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class UntitledTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void untitled() {
    driver.get("http://47.102.164.111:27777/");
    driver.manage().window().setSize(new Dimension(1217, 685));
    driver.findElement(By.cssSelector(".iconmd-person")).click();
    driver.findElement(By.cssSelector(".panel-item:nth-child(5) > p")).click();
    driver.findElement(By.cssSelector(".username")).click();
    driver.findElement(By.cssSelector(".username")).sendKeys("root");
    driver.findElement(By.cssSelector(".pwd")).sendKeys("kb123456");
    driver.findElement(By.id("btn")).click();
    driver.findElement(By.cssSelector(".navigator-primary-menu:nth-child(8)")).click();
    driver.findElement(By.cssSelector(".menu-group:nth-child(6) > .item:nth-child(2)")).click();
    driver.findElement(By.id("actionADD")).click();
    driver.findElement(By.cssSelector(".CP_C_ORIG_ID .ark-fkrp-select-icon > .ark-icon")).click();
    driver.findElement(By.cssSelector("tr:nth-child(7) > td:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".CP_C_DEST_ID .ark-fkrp-select-icon > .ark-icon")).click();
    driver.findElement(By.cssSelector("tr:nth-child(6) > td:nth-child(3)")).click();
    driver.findElement(By.linkText("【保存】")).click();
  }
}