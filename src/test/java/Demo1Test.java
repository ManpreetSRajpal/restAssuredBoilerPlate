
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;


public class Demo1Test {

    private static Logger log = LogManager.getLogger(Demo1Test.class.getName());

    @Test
    public void demo() {
        log.info(" ------------> printing INFO log4j info of DEMO1 ");
        log.warn(" ------------> printing WARN log4j info of DEMO1 ");
        log.error(" ------------> printing ERROR log4j info of DEMO1 ");
    }
}
