package com.hrms.testscripts;

import com.hrms.lib.General;
import org.testng.annotations.Test;

public class TC003tg {
    @Test
    public void tc003tg3()throws Exception{
        General gn6=new General();
        gn6.openApplication();
        Thread.sleep(4000);
        gn6.login();
        Thread.sleep(4000);
        gn6.editEmployee();
        Thread.sleep(6000);
        gn6.logout();
        gn6.closeApplication();
    }
}
