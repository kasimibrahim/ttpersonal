package reservations;

import Passenger.Passenger;

public abstract class Seat {
    private final int id;
    private final Passenger passenger;

    public Seat(int id, Passenger traveller){
        this.id = id;
        this.passenger = traveller;
    }

    public int getId(){
        return this.id;
    }

    public Passenger getPassenger(){
        return passenger;
    }



    public abstract boolean isPlutoMoon();
}
