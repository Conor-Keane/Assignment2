package ie.atu.Assignment2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@SpringBootApplication
@RestController
@RequestMapping(path = "api/passenger")

public class PassengerController {
    public List<Passenger> myPassengers = List.of(
            new Passenger("Mr", "Conor", "12345678910", "0879543461", 21),
            new Passenger("Mr", "Conor2", "4567891011", "091098765", 24),
            new Passenger("Mr", "Conor3", "78910111213", "087123456", 21)
    );


    @GetMapping
    public List<Passenger> getMyPassengers() {
        return myPassengers;
    }

    @GetMapping("/{passengerID}")
    public Passenger getPassenger(@PathVariable String passengerID) {
        return new Passenger("Mr", "Conor", "1234", "0879543461", 21);
    }

}
