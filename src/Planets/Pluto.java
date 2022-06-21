package Planets;

public class Pluto extends CelestialBody {


    @Override
    public boolean supportsLife() {
        return false;
    }

    @Override
    public boolean canLand() {
        return true;
    }
}
