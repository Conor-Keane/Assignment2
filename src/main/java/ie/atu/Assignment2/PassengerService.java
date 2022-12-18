package ie.atu.Assignment2;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
@AllArgsConstructor
@Service
public class PassengerService {

    private final PassengerRepo passengerRepo;

    public List<Passenger> getPassengers() {
        return passengerRepo.findAll();
    }

    public void savePassenger(Passenger newpassenger) {
        passengerRepo.save(newpassenger);
    }

    public Passenger findPassengerByName(String Name){
        return passengerRepo.findPassengerByName(Name);
    }

    public void deletePassenger(Long count){
        passengerRepo.deleteById(count);
    }
//http://localhost:8081/api/passenger/age?age_start=1&age_end=60

    public  List<Passenger> findPassengerByAge(int age1, int age2){
        return passengerRepo.findPassengerByAge(age1,age2);
    }
}