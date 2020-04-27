package Utilities;

import org.apache.log4j.Logger;


public class Loggers {


    public static void getinfo(String info) {
        Logger log = Logger.getLogger("devpinoyLogger");
        log.info(info);
    }
}
