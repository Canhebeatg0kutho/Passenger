package ie.atu.Passenger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    private Passenger myPassenger;

    @BeforeEach
    void setUp() {
        myPassenger = new Passenger("Mr", "John Doe", 1234334567891L, 1233456789, 42);

    }

    @AfterEach
    void tearDown() {
    }
}