package ch05.sec03;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest {

    public static void main(String[] args) {

        Logger.getGlobal().info("Hello World.");

        Logger logger = Logger.getLogger("com.star.myapp");

        logger.setLevel(Level.FINE);

        logger.warning("Hello");
        logger.fine("World");

        Level level = Level.SEVERE;

        logger.log(level, "Hello World.");
    }
}
