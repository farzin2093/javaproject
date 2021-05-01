package fourthpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileUtils {

    public static String read(String fileLocation, String key) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(fileLocation);
        properties.load(inputStream);
        String value = properties.getProperty(key);
        return value;


    }

    public static void main(String[] args) throws IOException {

        String value = read("src/fourthpackage/config.properties", "dbName");
        String value2 = read("src/fourthpackage/config2.properties", "course");


        System.out.println(value);
        System.out.println(value2);


    }
}


