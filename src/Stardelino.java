import java.util.List;

public class Stardelino extends Spaceship{
    @Override
    public int getCapacity() {
        return 80;
    }

    @Override
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


}
