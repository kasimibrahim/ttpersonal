package Planets;

public class RockyPlanet extends Planet{

    @Override
    public boolean supportsLife() {
        return true;
    }

    @Override
    public boolean canLand() {
        return true;
    }
}
