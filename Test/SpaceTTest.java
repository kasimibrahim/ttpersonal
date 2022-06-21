

import company.*;

import org.junit.Assert;
import org.junit.Test;
import ships.Spaceship;

public class SpaceTTest {

    @Test
    public void test(){
        Assert.assertTrue(new TurntablGalactic().getCompanyName(), true);
        Assert.assertNotNull(new TurntablGalactic().getFleet());
        Assert.assertEquals(new SpaceT().getCompanyName(), "company.SpaceT");

    }

    @Test
    public void fleetSize(){
        Assert.assertEquals(new SpaceT().getFleet().size(), 20);
        Assert.assertEquals(new TurntablGalactic().getFleet().size(), 22);
    }

    @Test
    public void capacity(){
        int capacityST = 0;
        for (Spaceship ship : new SpaceT().getFleet()){
            capacityST += ship.getCapacity();
        }
        Assert.assertEquals(capacityST, 1680);
    }

    @Test
    public void ratingGT4(){
        int ships = 0;
        for (Spaceship ship : new SpaceT().getFleet()){
            if (ship.getSafetyRating() > 4) ships ++;
        }
        System.out.println(ships);
    }

    @Test
    public void mostMoreFastest(){

    }
}