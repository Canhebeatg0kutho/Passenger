package ie.atu.Passenger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/passenger")
public class PassengerController {
    private PassengerService newService;


    public PassengerController(PassengerService newService){
        this.newService = newService;
    }

    @GetMapping("")
    public List<Passenger> getPassenger(){
        return newService.getPassenger();
    }
}
