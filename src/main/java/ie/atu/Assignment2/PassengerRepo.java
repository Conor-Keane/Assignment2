package ie.atu.Assignment2;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PassengerRepo extends JpaRepository <Passenger, Long> {
    public Passenger findPassengerByName(String Name);

    @Query("SELECT p FROM Passenger p WHERE p.Age > ?1 and p.Age < ?2")
    public List<Passenger> findPassengerByAge(int age, int age2);
}
