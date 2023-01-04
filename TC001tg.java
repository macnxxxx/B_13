package com.hrms.testscripts;

import com.hrms.lib.General;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class TC001tg {
    @Test
    public void tc001tg1()throws Exception{
        DOMConfigurator.configure("log4j.xml");
        General gn4=new General();
        gn4.openApplication();
        Thread.sleep(3000);
        gn4.login();
        Thread.sleep(3000);
        gn4.logout();
        gn4.closeApplication();
    }
}
