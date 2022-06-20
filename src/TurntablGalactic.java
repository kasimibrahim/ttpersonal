import java.util.List;

public class TurntablGalactic extends Company {
    private final String companyName;
    private final List<Spaceship> fleet;

    TurntablGalactic(){
        companyName = "Turntabl Galactic";
        fleet = List.of(
                new Spacer(),
                new Spacer(),
                new Spacer(),
                new Stardelino(),
                new Stardelino(),
                new Stardelino(),
                new Stardelino(),
                new Stardelino(),
                new Stardelino(),
                new Stardelino(),
                new Stardelino(),
                new Stardelino(),
                new Stardelino(),
                new Stardelino(),
                new Stardelino(),
                new Stardelino(),
                new Bulletship(),
                new Bulletship(),
                new Bulletship(),
                new Bulletship(),
                new Bulletship(),
                new Bulletship()
        );
    }
    @Override
    public List<Spaceship> getFleet() {
        return fleet;
    }

    @Override
    public String getCompanyName() {
        return companyName;
    }

}
