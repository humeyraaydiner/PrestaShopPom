package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    //read the properties file
    static {
        String path ="configuration.properties";


            try {
                FileInputStream fileInputStream = new FileInputStream (path);

                properties =new Properties ();
                properties.load (fileInputStream);

                fileInputStream.close ();

            } catch (Throwable IOException ) {

            }
        }
        //returns the value of specific property
    public static String getProperty(String property){
        return properties.getProperty (property);
    }
    }

