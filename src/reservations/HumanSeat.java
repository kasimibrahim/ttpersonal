package reservations;

import Passenger.*;
import reservations.Seat;

public class HumanSeat extends Seat {
    public HumanSeat(int id,  Human traveller){
        super(id, traveller);
    }

    @Override
    public boolean isPlutoMoon() {
        return true;
    }

}
