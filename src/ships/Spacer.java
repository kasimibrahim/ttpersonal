package ships;

import reservations.*;
import ships.Spaceship;

import java.util.List;

public class Spacer extends Spaceship {

    public Spacer(){
        //counts the number of times a spaceship is created;
        super();
        count++;
    }
    @Override
    public int getCapacity() {
        return 20;
    }


    public int getSpeed() {
        return 450;
    }

    @Override
    public int getSafetyRating() {
        return 4;
    }

    @Override
    public List<Seat> getSeats() {
        return seats;
    }

    @Override
    public int getCount() {
        return count;
    }


}
