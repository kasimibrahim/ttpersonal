import java.util.ArrayList;
import java.util.List;

public abstract class Spaceship {

    public List<Seat> seats = new ArrayList<>();

    public abstract int getCapacity();
    public abstract  int getSpeed();
    public abstract  int getSafetyRating();

    public abstract List<Seat> getSeats();

//    public  boolean bookSeat(spaceships.HumanSeat s){
//        if (seats.size() < this.getCapacity()) {
//            seats.add(s);
//            return true;
//        }
//        return false;
//    }
    public boolean bookSeat(Seat s){
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
