package Passenger;

public abstract class Passenger {
    private final String name;

    public Passenger(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract boolean isHuman();

    public boolean canDate(Passenger p){
        return this.isHuman() == p.isHuman();
    }



}
