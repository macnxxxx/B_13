package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC003 {
    public static void main(String[] args) throws Exception{
        General gn2=new General();
        gn2.openApplication();
        Thread.sleep(4000);
        gn2.login();
        Thread.sleep(4000);
        gn2.editEmployee();
        Thread.sleep(4000);
        gn2.logout();
        gn2.closeApplication();
    }
}
