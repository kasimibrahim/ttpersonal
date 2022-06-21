package company;

import company.Company;
import ships.Bulletship;
import ships.Spacer;
import ships.Spaceship;
import ships.Stardelino;

import java.util.List;

public class TurntablGalactic extends Company {
    private final String companyName;
    private final List<Spaceship> fleet;

    public TurntablGalactic(){
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
