import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testn2 {
    @Test
    public void addEmp(){
        System.out.println("adding new employee");
    }
    @BeforeClass
    public void login(){
        System.out.println("login completed");
    }
    @Test
    public void delEmp(){
        System.out.println("deleting employee");
    }
    @AfterClass
    public void logout(){
        System.out.println("logout successful");
    }
}
