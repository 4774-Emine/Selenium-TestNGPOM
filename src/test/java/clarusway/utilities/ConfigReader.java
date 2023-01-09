package clarusway.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {//kodları ezberlemeye gerek yok, google dan configreader adıyla bulabiliriz


    public static Properties properties;

    static {
        String filePath = "config.properties";//bilgilerin olduğu dosya yolunu verdik
        try {
            FileInputStream fis = new FileInputStream(filePath);

            properties = new Properties();
            properties.load(fis);

            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {

        return properties.getProperty(key);
    }

}