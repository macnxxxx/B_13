import org.testng.annotations.Test;

public class Testn1 {
    @Test
    public void login(){
        System.out.println("login completed");
    }
    @Test
    public void logout(){
        System.out.println("logout completed");
    }
    @Test
    public void addEmp(){
        System.out.println("adding new employee");
    }
    @Test
    public void delEmp(){
        System.out.println("delete employee");
    }
}
