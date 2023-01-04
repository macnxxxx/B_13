package com.hrms.lib;

import com.hrms.utility.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class General extends Global{
    public void openApplication(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\selenium_drivers\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to(url);
        System.out.println("application opened");
        Reporter.log("application opened");
        Log.info("application opened");
    }
    public void closeApplication(){
        driver.close();
        System.out.println("application closed");
        Log.info("application closed");
    }
    public void login(){
        driver.findElement(By.xpath(logxpth)).sendKeys(usnm);
        driver.findElement(By.xpath(pwdxpth)).sendKeys(pwd);
        driver.findElement(By.xpath(logbtn)).click();
        System.out.println("login completed");
        Log.info("login completed");
    }
    public void logout()throws Exception{
        driver.findElement(By.xpath(log1)).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText(log2)).click();
        System.out.println("logout completed");
        Log.info("logout completed");
    }
    public void addEmployee()throws Exception{
        driver.findElement(By.linkText(pimtabtxt)).click();
        System.out.println("clicked on PIM tab");
        Thread.sleep(3000);
        driver.findElement(By.xpath(addbtnxpth)).click();
        System.out.println("clicked on add button");
        Thread.sleep(4000);
        driver.findElement(By.xpath(efntxtxpth)).sendKeys(FN);
        driver.findElement(By.xpath(elntxtxpth)).sendKeys(LN);
        Thread.sleep(3000);
        driver.findElement(By.xpath(savebtn)).click();
        System.out.println("clicked on save button");
        System.out.println("new employee added");
    }
    public void editEmployee()throws Exception{
        driver.findElement(By.linkText(pimtabtxt)).click();
        System.out.println("clicked on PIM tab");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//i[@class='oxd-icon bi-pencil-fill']")).click();
        System.out.println("clicked on edit button");
        Thread.sleep(4000);
        driver.findElement(By.xpath(efntxtxpth)).clear();
        driver.findElement(By.xpath(elntxtxpth)).clear();
        System.out.println("employee name cleared");
        driver.findElement(By.xpath(efntxtxpth)).sendKeys(newFN);
        driver.findElement(By.xpath(elntxtxpth)).sendKeys(newLN);
        System.out.println("new names typed");
        driver.findElement(By.xpath(savebtn1xpth)).click();
        System.out.println("clicked on save button");
    }

}
