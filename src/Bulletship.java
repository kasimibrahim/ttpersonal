public class Bulletship extends Spaceship{
    @Override
    public int getCapacity() {
        return 100;
    }

    @Override
    public int getSpeed() {
        return 1800;
    }

    @Override
    public int getSafetyRating() {
        return 2;
    }
}
