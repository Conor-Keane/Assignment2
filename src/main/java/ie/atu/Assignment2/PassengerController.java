package ie.atu.Assignment2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@SpringBootApplication
@RestController
@RequestMapping(path = "api/passenger")

public class PassengerController {
    private PassengerService newService;

    public PassengerController(PassengerService newService) {
        this.newService = newService;
    }

    @PostMapping("")
    public void savePassenger(@RequestBody Passenger newpassenger){
        newService.savePassenger(newpassenger);
    }
    @GetMapping("/name/{Name}")
    public Passenger getPassengerName(@PathVariable("Name") String Name){
        return newService.findPassengerByName(Name);
    }
    @DeleteMapping("/delete/{count}")
    public void deletePassenger(@PathVariable("count") Long count){
        newService.deletePassenger(count);
    }
    //http://localhost:8081/anpi/passeger/age?age_start=1&age_end=60
    @GetMapping("/age")
    public  List<Passenger> findPassengerByAgeRange(@RequestParam(name = "age_start") int age1, @RequestParam(name = "age_end") int age2){
        return newService.findPassengerByAge(age1,age2);
    }

    public static void main(String[] args) {
        SpringApplication.run(PassengerController.class, args);
    }

    @GetMapping("")
    public List<Passenger> getMyPassengers()
    {
        return newService.getPassengers();
    }
    //http://localhost:8081/api/passenger/age?age_start=1&age_end=60

}
