package Planets;

public class Moon extends CelestialBody{
    @Override
    public boolean supportsLife() {
        return false;
    }

    @Override
    public boolean canLand() {
        return true;
    }
}
