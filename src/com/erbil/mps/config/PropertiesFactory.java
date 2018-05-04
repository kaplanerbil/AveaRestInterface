package com.erbil.mps.config;

import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PropertiesFactory {

	private static Logger log = LoggerFactory.getLogger(PropertiesFactory.class);
	private static boolean directorySet = false;
	private static String directory = null;

	public static void init(String directory) {
		if (directory != null && !directory.equals("")) {
			PropertiesFactory.directory = directory;
			PropertiesFactory.directorySet = true;
		}
	}

	public static Properties loadPropertyFile(String fileName) {
		if (directorySet) {
			return loadFromDirectory(fileName);
		} else {
			return loadFromClasspath(fileName);
		}
	}

	private static Properties loadFromClasspath(String fileName) {
		Properties properties = new Properties();
		try {
//			InputStream is = PropertiesFactory.class.getClassLoader().getResourceAsStream(fileName);
//			properties.load(is);
			
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			try(InputStream resourceStream = loader.getResourceAsStream(fileName)) {
				properties.load(resourceStream);
			}
			
		} catch (Exception e) {
			log.error("Error loading property file " + fileName + " from classPath", e.fillInStackTrace());
		}
		return properties;
	}

	private static Properties loadFromDirectory(String fileName) {
		Properties properties = new Properties();
		try {
			URL[] urls = new URL[1];
			urls[0] = new URL(directory);
			ClassLoader classLoader = URLClassLoader.newInstance(urls, null);
			InputStream is = classLoader.getResourceAsStream(fileName);
			properties = new Properties();
			properties.load(is);
		} catch (Exception e) {
			log.error("Error loading property file " + fileName + " from directory " + directory, e.fillInStackTrace());
		}
		return properties;
	}

	public static String getDirectory(){
		return directory;
	}
	
	public static boolean isDirectorySet(){
		return directorySet;
	}	
}
