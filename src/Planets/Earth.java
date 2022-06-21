package Planets;

public class Earth extends RockyPlanet{
    private static Earth earth;

    private Earth(){

    }

    public static Earth getInstance(){
        if (earth == null){
            earth = new Earth();
        }
        return earth;
    }


}
