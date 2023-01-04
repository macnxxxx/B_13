package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
    public WebDriver driver;
    public String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    public String logxpth="//input[@name='username'][@placeholder='Username']";
    public String usnm="Admin";
    public String pwdxpth="//input[@name='password'][@placeholder='Password']";
    public String pwd="admin123";
    public String logbtn="//button[@type='submit']";
    public String log1="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']";
    public String log2="Logout";
    public String FN="selenium";
    public String LN="suresh";
    public String addbtnxpth="//i[@class='oxd-icon bi-plus oxd-button-icon']";
    public String pimtabtxt="PIM";
    public String efntxtxpth="//input[@name='firstName'][@placeholder='First Name']";
    public String elntxtxpth="//input[@name='lastName'][@placeholder='Last Name']";
    public String savebtn="//button[@type='submit'][@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']";
    public String edtbtnxpth="//i[@class='oxd-icon bi-pencil-fill']";
    public String newFN="selenium1";
    public String newLN="suresh1";
    public String savebtn1xpth="//button[@type='submit'][@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']";

}
