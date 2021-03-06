package collectionMapping;

import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity(name="stu")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;


    @ElementCollection(fetch= FetchType.LAZY)
    private List<Address> address=new ArrayList();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }


}