package Planets;

public class Earth extends RockyPlanet{
    private final static Earth earth = new Earth();

    private Earth(){
        System.out.println("Battle Ensues");
    }

    public static Earth getInstance(){
        return earth;
    }



}
