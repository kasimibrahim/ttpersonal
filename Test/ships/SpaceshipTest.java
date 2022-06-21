package ships;

import org.junit.Assert;
import org.junit.Test;
import reservations.HumanSeat;
import reservations.MartianSeat;
import reservations.Seat;

import static org.junit.jupiter.api.Assertions.*;

public class SpaceshipTest {

    @Test
    public void testBooking(){
        Assert.assertTrue(new Bulletship().bookSeat(new HumanSeat(4, "Kasim"), "Abunabunu"));

    }
    @Test
    public void testBookSeatCapacityBulletship() {
        Bulletship b = new Bulletship();
        boolean full = false;
        while (!full) {
            full = !b.bookSeat(new MartianSeat(14, "Okay"));
        }

        Assert.assertFalse(b.bookSeat(new MartianSeat(44, "Mars boy")));
    }
}