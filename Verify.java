import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\selenium_drivers\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        if (driver.getTitle().equals("OrangeHRMS")){
            System.out.println("title matched");
        }
        else {
            System.out.println("title not match");
            System.out.println(driver.getTitle());
        }
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("login successful");
        if (driver.getTitle().equals("Orange HRMS")){
            System.out.println("title match");
        }
        else {
            System.out.println("title not match");
            System.out.println(driver.getTitle());
        }
        Thread.sleep(4000);
        driver.findElement(By.className("oxd-userdropdown-name")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Logout")).click();
        System.out.println("logout successful");
        driver.close();
    }
}
