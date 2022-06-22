package reservations;

import Passenger.Passenger;
import reservations.Seat;

public class MartianSeat extends Seat {
    public MartianSeat(int id, Passenger traveller){
        super(id, traveller);
    }

    @Override
    public boolean isPlutoMoon() {
        return false;
    }
}
