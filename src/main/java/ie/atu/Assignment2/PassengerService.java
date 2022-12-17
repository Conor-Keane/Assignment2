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
                new Passenger("Mrs","Jessica","1110987654", "1234567891", 24),
                new Passenger("Ms","Jenna","2356891357913", "2354678796", 27),
                new Passenger("Mr","Ryan","0987654321011", "0987654321", 40),
                new Passenger("Mrs","Anna","246810121416", "7531345678", 34),
                new Passenger("Ms","Paula","0001112233455", "1356785432", 21)

        );
        return list;
    }
}

//Testt
