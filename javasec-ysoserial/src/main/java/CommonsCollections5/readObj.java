package CommonsCollections5;

import java.io.*;
import java.lang.Runtime;


public class readObj {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file;
        file = new File(System.getProperty("user.dir")+"/javasec-ysoserial/src/main/resources/commonscollections5-2.ser");
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream(file));
        obj.readObject();
    }
}
