package core.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLog {

    public static Logger logger = LogManager.getLogger(TestLog.class);

    public static void main(String[] args){

        PropertyConfigurator.configure("src/test/resources/configs/log4j.properties");
        logger.info("Informative message");
        logger.debug("Debug message");
        logger.warn("Warn message");
        logger.error("Error message");
        logger.fatal("Fatal message");
    }
}
