package ie.atu.Assignment2;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PassengerService {

    public Passenger getPassenger(@PathVariable String passengerID)
    {
        return new Passenger("Mr", "Conor", "1234", "0879543461", 21);
    }

    public List<Passenger> getPassengers() {
        List<Passenger> myPassengers = List.of(
                new Passenger("Mr", "Conor", "12345678910", "0879543461", 23),
                new Passenger("Mrs", "Conita", "0879543461", "123456819", 45),
                new Passenger("Ms", "Con", "0123456789", "246835790", 20));
        return myPassengers;
    }
}
