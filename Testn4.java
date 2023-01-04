import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testn4 {
    @Test(priority=1)
    public void delEmp(){
        System.out.println("delete employee");
    }
    @Test(priority=2)
    public void addEmp(){
        System.out.println("adding employee");
    }
    @BeforeMethod
    public void login(){
        System.out.println("login completed");
    }
    @AfterMethod
    public void logout(){
        System.out.println("logout completed");
    }
}
