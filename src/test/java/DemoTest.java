

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class DemoTest {

    private static Logger log = LogManager.getLogger(DemoTest.class.getName());

    @Test(description = "Description in DemoTest", groups = {"Regression"})
    public void run_demo_test() {
        log.info(" ------------> printing INFO log4j info of DEMO ");
        log.warn(" ------------> printing WARN log4j info of DEMO ");
        log.error(" ------------> printing ERROR log4j info 1 of DEMO ");
    }

    @Parameters({"firstName"})
    @Test(description = "Description in DemoTest", groups = {"Smoke", "Regression"})
    public void run_demo_test2(String name) {
        log.info(" Welcome ---  " + name);
    }
}
