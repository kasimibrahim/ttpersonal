package ships;

import Passenger.Human;
import Passenger.Martian;
import org.junit.Assert;
import org.junit.Test;
import reservations.HumanSeat;
import reservations.MartianSeat;
import reservations.Seat;

import javax.swing.*;
import java.util.List;

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

    @Test
    public void numberOfMartiansOnboard(){
        Bulletship b = new Bulletship();
        b.bookSeat(new MartianSeat(1, new Martian("K")));
        b.bookSeat(new MartianSeat(4, new Martian("kk")));
        b.bookSeat(new HumanSeat(8, new Human("Lio")));

        int martians_onboard = b.getSeats().stream()
                .filter(s -> s instanceof MartianSeat)
                .toList()
                .size();
        System.out.println(b.seats);
        System.out.println(martians_onboard);

        int humans_onboard = b.getSeats().stream()
                .filter(s -> s instanceof HumanSeat)
                .toList()
                .size();
        System.out.println(b.seats);
        System.out.println(martians_onboard);

        Assert.assertEquals(2, martians_onboard);
        Assert.assertEquals(1, humans_onboard);
    }

}