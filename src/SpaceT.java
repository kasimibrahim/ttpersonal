import java.util.List;

public class SpaceT extends Company{
    private final String companyName;
    private final List<Spaceship> fleet;
    SpaceT(){
        companyName = "SpaceT";
        fleet = List.of(
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
                new Bulletship(),
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
