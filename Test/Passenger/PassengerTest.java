package Passenger;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    @Test
    public void humanCanDateTheirType(){
        Human male = new Human("Kasim");
        Human female = new Human("Linda");
        Assert.assertTrue(male.canDate(female));

    }

    @Test
    public void martianCanDateTheirType(){

        Martian m = new Martian("Goppy");
        Martian n = new Martian("Hoppy");
        Assert.assertTrue(m.canDate(n));
    }

    @Test
    public void martianCannotDateHuman(){
        Martian m = new Martian("Hoppy");
        Human h = new Human("Kasim");

        Assert.assertFalse(m.canDate(h));
    }

    @Test
    public void doesPersonHaveAName(){
        Assert.assertTrue(new Human("Kasim").getName(), true);
    }

}