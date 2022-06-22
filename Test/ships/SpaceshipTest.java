package ships;

import Passenger.Human;
import Passenger.Martian;
import org.junit.Assert;
import org.junit.Test;
import reservations.HumanSeat;
import reservations.MartianSeat;
import reservations.Seat;

import static org.junit.jupiter.api.Assertions.*;

public class SpaceshipTest {

    @Test
    public void testBooking(){
        Assert.assertTrue(new Bulletship().bookSeat(new HumanSeat(4, new Human("Kasim")), "Abunabunu"));

    }
    @Test
    public void testBookSeatCapacityBulletship() {
        Bulletship b = new Bulletship();
        boolean full = false;
        while (!full) {
            full = !b.bookSeat(new MartianSeat(14, new Martian("Yoshi")));
        }

        Assert.assertFalse(b.bookSeat(new MartianSeat(44, new Martian("Gride"))));
    }
}