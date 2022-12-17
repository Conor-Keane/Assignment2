package ie.atu.Assignment2;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@Service
public class PassengerService {

    public Passenger getPassenger(@PathVariable String passengerID)

    {
        return new Passenger("Mr", "Conor", "1234", "0879543461", 21);
    }

    public List<Passenger> getPassengers(){
        List<Passenger> list = List.of(
                new Passenger("Mr","Conor","1234567891011", "0879543461", 21),
                new Passenger("Mrs","Conor","1234567891011", "0879543461", 21),
                new Passenger("Mr","Conor","1234567891011", "0879543461", 21),
                new Passenger("Mrs","Conor","1234567891011", "0879543461", 21),
                new Passenger("Mr","Conor","1234567891011", "0879543461", 21),
                new Passenger("Mrs","Conor","1234567891011", "0879543461", 21)

        );
        return list;
    }
}
