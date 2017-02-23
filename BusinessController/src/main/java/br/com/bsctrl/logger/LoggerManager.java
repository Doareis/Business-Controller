package br.com.bsctrl.logger;

import org.apache.log4j.Logger;

public class LoggerManager {

	static private final Logger logger = Logger.getLogger("LoggerManager");
	
	public static void error(String msg){
		logger.error(msg);
	}
}
