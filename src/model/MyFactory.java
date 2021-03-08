package model;

import java.io.FileReader;
import java.util.Properties;

public class MyFactory {
    public static Object getInstance(String objName) throws Exception{
        FileReader r = new FileReader("src/MyFactory.properties");
        Properties p = new Properties();
        p.load(r);
        Class<?> clss = Class.forName(p.getProperty(objName));
        return clss.getDeclaredConstructor().newInstance();
    }
}
