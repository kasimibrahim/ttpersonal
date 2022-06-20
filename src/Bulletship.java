import java.util.List;

public class Bulletship extends Spaceship{
    @Override
    public int getCapacity() {
        return 100;
    }

    @Override
    public int getSpeed() {
        return 1800;
    }

    @Override
    public int getSafetyRating() {
        return 2;
    }

    @Override
    public List<Seat> getSeats() {
        return seats;
    }


    @Override
    public boolean bookSeat(Seat s) {
        if (seats.size() < this.getCapacity()) {
            if (s instanceof HumanSeat){
                System.out.println("Human food will be served");
            }else{ System.out.println("Martian Food will be served");}
            seats.add(s);
            return true;
        }
        return false;
    }
}
