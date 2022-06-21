
import java.util.List;

public class Stardelino extends Spaceship {

    public Stardelino(){
        //counts the number of times a spaceship is created;
        super();
        count++;
    }
    @Override
    public int getCapacity() {
        return 80;
    }


    public int getSpeed() {
        return 900;
    }

    @Override
    public int getSafetyRating() {
        return 8;
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
