package org.eclipse.acceleo.module.M2TGraces.services;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.logging.log4j.*;

import com.google.common.collect.Collections2; 

public class LocationServices {
	
//	private static final Logger LOGGER = LogManager.getLogger(LocationServices.class);
	
	private static final String PROPERTIES_FILE_NAME = "location.properties";
	private static final Locale DEFAULT_LOCALE = new Locale("en", "US");
	private static final String BUNDLE_FILE_PREFIX = "org.eclipse.acceleo.module.M2TGraces.resources.MessagesBundle";
	private static final ResourceBundle DEF_MESSAGES = ResourceBundle.getBundle(BUNDLE_FILE_PREFIX, DEFAULT_LOCALE);


	private static LocationServices instance; 
	private Locale locale;
	private Properties properties;
	private ResourceBundle messages;
	private MessageFormat formatter;
	
	//TODO: Eliminar esto, puede que no haga falta
	public static LocationServices getInstance() {
		if (instance == null) {	
			instance = new LocationServices();
		}
		return instance;
	}
	
	public LocationServices() {
		//TODO: Comprobar de alguna manera si se ejecuta una vez o cada vez que se llama a un metodo
		
		InputStream file = getClass().getClassLoader().getResourceAsStream(PROPERTIES_FILE_NAME);
		this.properties = new Properties();
		try {
			properties.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}	
		String lang = properties.getProperty("lang");
		String language = lang.split("_")[0];
		String country = lang.split("_")[1];        
        this.locale = new Locale(language, country);
//        
//        try {
//			FileWriter mifichero = new FileWriter("/home/nachoigs/GRACES/prueba.txt");
//			mifichero.append('a');
//			mifichero.flush();
//			mifichero.close(); 
////			LOGGER.error("Prueba");
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block 
//			throw new RuntimeException(e1); 
//		}
        
        formatter = new MessageFormat("");
        
        try {
			this.messages = 
					ResourceBundle.getBundle(BUNDLE_FILE_PREFIX, this.locale);
			this.formatter.setLocale(this.locale);
		} catch (MissingResourceException e) {
			this.locale = DEFAULT_LOCALE;
			this.messages = ResourceBundle.getBundle(BUNDLE_FILE_PREFIX, this.locale);
			this.formatter.setLocale(this.locale);
		}
    }
	
	public String localize(String key, List<Object> args) {
		String formatString;
        try {
			formatString = messages.getString(key);			
		} catch (MissingResourceException | ClassCastException e) {
			formatString = DEF_MESSAGES.getString(key);
		}
        formatter.applyPattern(formatString);
        return formatter.format(args.toArray());
	}
	
	public String localize(String key) {
		return localize(key, null);
	}

}
