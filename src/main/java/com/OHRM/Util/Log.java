package com.OHRM.Util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {
	public static Logger logger=Logger.getLogger("Log");
	
	public static void info(String message) {
		PropertyConfigurator.configure(".\\resources\\log4j.properties");
		Log.info(message);
	}
	
	
}
