import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Webdtestn {
    WebDriver driver;
    @BeforeClass
    public void startup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\selenium_drivers\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    @AfterClass
    public void teardwn(){
        driver.close();
    }
    @Test
    public void TC001()throws Exception{
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Reporter.log("application openend");
        System.out.println("application opened");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='username'][@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@type='password'][@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("clicked on login button");
        Reporter.log("loggeed in successful");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Logout")).click();
        Reporter.log("logout successful");
        System.out.println("logout successful");
    }
}
