

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialTest {

    public static void main(String[] args) {
        Person p = new Person(1L, "陈俊生");
        System.out.println("person Seria:" + p);
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\YXM\\Desktop\\Person4.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);//p是需要序列化写的对象
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}