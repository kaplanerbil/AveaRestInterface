package com.erbil.mps.config;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetConfigForGeneral {

    private Properties props = null;
    private static GetConfigForGeneral instance;
    private final static Logger log = LoggerFactory.getLogger(GetConfigForGeneral.class);

    private GetConfigForGeneral() {
	loadProperties();
    }

    public static GetConfigForGeneral getInstance() {
	if(instance == null)
	    instance = new GetConfigForGeneral();
	return instance;
    }

    public Properties loadPropertyFile(String fileName) {
	log.debug(fileName);
	Properties properties = null;
	InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
	properties = new Properties();
	try{
	    properties.load(is);
	}catch(IOException ex){
	    log.error("Error occured while loading conf file: " + fileName + ". GetConfigForGeneral loadServerInfo Exception" + ex, ex.fillInStackTrace());
	}
	log.debug("Conf=" + properties.toString());
	return properties;
    }

    private void loadProperties() {
	props = PropertiesFactory.loadPropertyFile("general.properties");
    }

    public void refresh() {
	loadProperties();
    }

    public String getValue(String key) {
	String value = null;
	value = props.getProperty(key);
	return value;
    }
}