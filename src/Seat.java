public abstract class Seat {
    private final int id;
    private final String nameOfPerson;

    public Seat(int id, String n){
        this.id = id;
        this.nameOfPerson = n;
    }

    public int getId(){
        return this.id;
    }
}
