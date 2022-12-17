package ie.atu.Assignment2;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
@AllArgsConstructor
@Service
public class PassengerService {

    private final PassengerRepo passengerRepo;
    public Passenger getPassenger(@PathVariable String passengerID)

    {
        return new Passenger("Mr", "Conor", "1234", "0879543461", 21);
    }

    public List<Passenger> getPassengers() {
        return passengerRepo.findAll();
    }
}
