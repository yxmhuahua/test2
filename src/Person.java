

import java.io.Serializable;

public class Person extends pp implements Serializable {

    private static final long serialVersionUID = 3359709211352400087L;
    public Long id;
    public String name;
    public final String userName;


    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
        userName = "dddbbb";

    }
public void aa(){
        System.out.println("fangfa子类");
}
    public String toString() {
        return id.toString() + "--" + name.toString();
    }
}