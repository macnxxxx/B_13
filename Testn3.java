import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testn3 {
    @Test(priority=1)
    public void delEmp(){
        System.out.println("deleting employee");
    }
    @Test(priority=2)
    public void addEmp(){
        System.out.println("adding employee");
    }
    @BeforeClass
    public void login(){
        System.out.println("login successful");
    }
    @AfterClass
    public void logout(){
        System.out.println("logout successful");
    }
}
