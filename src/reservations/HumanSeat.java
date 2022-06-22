package reservations;

import Passenger.Passenger;
import reservations.Seat;

public class HumanSeat extends Seat {
    public HumanSeat(int id,  Passenger traveller){
        super(id, traveller);
    }

    @Override
    public boolean isPlutoMoon() {
        return true;
    }

}
