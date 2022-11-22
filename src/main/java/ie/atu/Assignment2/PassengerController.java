package ie.atu.Assignment2;

import org.springframework.boot.SpringApplication;
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
    private PassengerService newService;

    public PassengerController(PassengerService newService) {
        this.newService = newService;
    }

    public static void main(String[] args) {
        SpringApplication.run(PassengerController.class, args);
    }

    @GetMapping("")
    public List<Passenger> getMyPassengers()
    {
        return newService.getPassengers();
    }

    @GetMapping("/{passengerID}")
    public Passenger getPassenger(@PathVariable String passengerID) {
        return (Passenger) newService.getPassenger(passengerID);
    }

}
