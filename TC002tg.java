package com.hrms.testscripts;

import com.hrms.lib.General;
import org.testng.annotations.Test;

public class TC002tg {
    @Test
    public void tc002tg2() throws Exception{
        General gn5=new General();
        gn5.openApplication();
        Thread.sleep(3000);
        gn5.login();
        Thread.sleep(4000);
        gn5.addEmployee();
        Thread.sleep(6000);
        gn5.logout();
        gn5.closeApplication();
    }
}
