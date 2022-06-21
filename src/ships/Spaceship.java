package ships;

import reservations.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Spaceship {

    public static int count;
    //By composition principle, a set belongs to a spaceship
    //therefore it makes sense to declare their instance here
    public final List<Seat> seats = new ArrayList<>();

    public abstract int getCapacity();
    // public abstract  int getSpeed();
    public abstract  int getSafetyRating();

    public abstract List<Seat> getSeats();

    public abstract int getCount();

    /**
     *
     * @param s request for seat
     * @return true if seat was successfully booked
     */
    public  boolean bookSeat(HumanSeat s, String preferredFood){
        if (seats.size() < this.getCapacity()) {
            System.out.println(preferredFood + " will be served");
            seats.add(s);
            return true;
        }
        return false;
    }

    public boolean bookSeat(MartianSeat m, String preferredFood){
        if (seats.size() < this.getCapacity()){
            System.out.println(preferredFood + " will be served");
            seats.add(m);
            return true;
        }
        return false;
    }
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
