import java.util.List;

public class Warpship extends Spaceship{

    private final int speed = 2150;

    @Override
    public int getCapacity() {
        return 200;
    }


    public int getSpeed() {
        return 900;
    }

    public int getSpeed(String pass){
        if (pass.equals("passWorD")){
            return speed;
        }
        return 900;
    }

    @Override
    public int getSafetyRating() {
        return 2;
    }

    @Override
    public List<Seat> getSeats() {
        return null;
    }

    @Override
    public int getCount() {
        return count;
    }
}
