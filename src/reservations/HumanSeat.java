package reservations;

import reservations.Seat;

public class HumanSeat extends Seat {
    public HumanSeat(int id, String nameOfPerson){
        super(id, nameOfPerson);
    }

    @Override
    public boolean isPlutoMoon() {
        return true;
    }

}
