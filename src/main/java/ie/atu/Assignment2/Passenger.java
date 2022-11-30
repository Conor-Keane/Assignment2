package ie.atu.Assignment2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Passenger {
    private String Title;
    private String Name;
    private String ID;
    private String PhoneNo;
    private int Age;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long count;

    public Passenger(String title, String name, String ID, String phoneNo, int age) {
        setTitle(title);
        setName(name);
        setID(ID);
        setPhoneNo(phoneNo);
        setAge(age);
    }

    public void setTitle(String title) {

        if(("Mr").equalsIgnoreCase(title) || ("Mrs").equalsIgnoreCase(title) || ("Ms").equalsIgnoreCase(title)) {
            Title = title;
        }
        else {
            throw new IllegalArgumentException("Please enter Mr, Mrs or Ms");
        }

    }

    public void setName(String name) {
        int count = name.length();
        if (count >= 3) {
            Name = name;
        }
        else {
            throw new IllegalArgumentException("Name must be greater than 3 characters long");
        }

    }

    public void setID(String id) {
        int count = id.length();
        if (count >= 10) {
            ID = id;
        }
        else {
            throw new IllegalArgumentException("ID must be greater than 10 characters long");
        }

    }

    public void setPhoneNo(String phoneNo) {
        int count = phoneNo.length();
        if (count > 6) {
            PhoneNo = phoneNo;
        }
        else {
            throw new IllegalArgumentException("Phone number must be greater than 6 characters long");
        }

    }

    public void setAge(int age) {
        if (age > 16) {
            Age = age;
        }
        else {
            throw new IllegalArgumentException("You must be over the age of 16 to fly");
        }

    }
    public String getTitle() {
        return Title;
    }

    public String getName() {
        return Name;
    }

    public String getID() {
        return ID;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public int getAge() {
        return Age;
    }
}
