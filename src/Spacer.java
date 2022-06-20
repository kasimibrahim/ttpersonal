import java.util.ArrayList;
import java.util.List;

public class Spacer extends  Spaceship{

    Spacer(){
        super();
    }
    @Override
    public int getCapacity() {
        return 20;
    }

    @Override
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



}
