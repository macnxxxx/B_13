import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {
    public static void main(String[] args)throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\selenium_drivers\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("login successful");
        Thread.sleep(4000);
        driver.findElement(By.linkText("PIM")).click();
        Thread.sleep(3000);
        System.out.println("PIM menu clicked");
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
        System.out.println("clicked on Add button");
        Thread.sleep(3000);
        driver.findElement(By.name("firstName")).sendKeys("Amy");
        driver.findElement(By.name("lastName")).sendKeys("Jackson");
        driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).clear();
        driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("0001");
        System.out.println("name added successfully");
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
        System.out.println("clicked on save button");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img'][@alt='profile picture']")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Logout")).click();
        System.out.println("logged out successfully");
        driver.close();
    }
}
