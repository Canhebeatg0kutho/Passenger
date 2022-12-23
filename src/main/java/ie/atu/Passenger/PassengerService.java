package ie.atu.Passenger;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class PassengerService {
public List<Passenger> getPassenger(){
    List<Passenger> myPassengers = List.of(
            new Passenger("Mr", "Paul", "1rereerwt5t45w23", 224242322, 23),
            new Passenger("Mr", "Paul2", "672y54y5yh56hy54wh3", 24441321, 93),
            new Passenger("Mr", "Paul3", "145ryhw45ryhw5454w4w54", 532333562L, 53));
    return myPassengers;
}


}
