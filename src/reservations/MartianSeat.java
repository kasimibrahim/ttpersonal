package reservations;

import reservations.Seat;

public class MartianSeat extends Seat {
    public MartianSeat(int id, String nameOfPerson){
        super(id, nameOfPerson);
    }

    @Override
    public boolean isPlutoMoon() {
        return false;
    }
}
