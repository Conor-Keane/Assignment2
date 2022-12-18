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
    private String title;
    private String name;
    private String id;
    private String phoneNo;
    private int age;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long count;
}
