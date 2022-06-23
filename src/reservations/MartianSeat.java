package reservations;

import Passenger.*;
import reservations.Seat;

public class MartianSeat extends Seat {
    public MartianSeat(int id, Martian traveller){
        super(id, traveller);
    }

    @Override
    public boolean isPlutoMoon() {
        return false;
    }
}
