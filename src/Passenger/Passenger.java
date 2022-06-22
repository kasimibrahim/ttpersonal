package Passenger;

public abstract class Passenger {
    private String name;

    public Passenger(String name){
        this.name = name;
    }


    public abstract boolean isHuman();
    public String getName(){
        return this.name;
    }
}
