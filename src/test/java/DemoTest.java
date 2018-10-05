

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;


public class DemoTest {

    private static Logger log = LogManager.getLogger(DemoTest.class.getName());

    @Test(description = "Description in DemoTest")
    public void run_demo_test() {
        log.info(" ------------> printing INFO log4j info of DEMO ");
        log.warn(" ------------> printing WARN log4j info of DEMO ");
        log.error(" ------------> printing ERROR log4j info of DEMO ");
    }
}
