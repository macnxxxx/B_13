import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drpdwn {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\selenium_drivers\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.goodreads.com/ap/signin?language=en_US&openid.assoc_handle=amzn_goodreads_web_na&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.goodreads.com%2Fap-handler%2Fsign-in&siteState=5d3c561d12266d3cdb0169209c91e869");
        Thread.sleep(3000);
        driver.findElement(By.name("email")).sendKeys("1mansooralikhan@gmail.com");
        driver.findElement(By.name("password")).sendKeys("fountainhead");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        System.out.println("login successful");

        Select st=new Select(driver.findElement(By.linkText("Browse ▾")));
        st.selectByIndex(5);
        System.out.println("browse dropdown selected");
        driver.close();

    }
}
