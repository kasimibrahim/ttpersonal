package Passenger;

public class Martian extends Passenger{
    public Martian(String name) {
        super(name);
    }

    @Override
    public boolean isHuman() {
        return false;
    }
}
