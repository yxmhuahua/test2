
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialTest {

    public static void main(String[] args) {
        Person p;
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\YXM\\Desktop\\Person4.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            p = (Person) ois.readObject();
            ois.close();
            System.out.println(p.toString());
            p.aa();
            p.bb();
            System.out.println(p.a);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}