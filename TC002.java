package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC002 {
    public static void main(String[] args) throws Exception{
        General gn1=new General();
        gn1.openApplication();
        Thread.sleep(3000);
        gn1.login();
        Thread.sleep(4000);
        gn1.addEmployee();
        Thread.sleep(9000);
        gn1.logout();
        gn1.closeApplication();
    }
}
