package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC001 {
    public static void main(String[] args) throws Exception {
        General gn=new General();
        gn.openApplication();
        Thread.sleep(6000);
        gn.login();
        Thread.sleep(6000);
        gn.logout();
        gn.closeApplication();
    }
}
