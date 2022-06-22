package Passenger;

public class Human extends Passenger{
    public Human(String name) {
        super(name);
    }

    @Override
    public boolean isHuman() {
        return true;
    }

}
