import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Wait {
    public static void main(String[] args)throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\selenium_drivers\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        WebDriverWait wait=new WebDriverWait(driver,4000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@type='submit']"))));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("logged in successfully");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.close();
        System.out.println("logged out");


    }
}
