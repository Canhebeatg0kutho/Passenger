package ie.atu.Passenger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTestFail {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testTitleFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mister", "John Doe", 1235473822, 1222222223, 19);});
        assertEquals("This is not a valid name. Use Mr, Ms or Mrs.", exMessage.getMessage());
    }


    @AfterEach
    void tearDown() {
    }
}