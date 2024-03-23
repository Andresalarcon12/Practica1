public class TeamDriverA extends TeamDriver {
    private String name;

    public TeamDriverA() {
        this.name = "Team Driver A";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void announcePitStop() {
        System.out.println("El piloto A anunció una parada en boxes.");
    }

    public void communicateWithPitCrew(PitCrewTeam pitCrew) {
        pitCrew.communicateWithDriver(this);
    }

    public void communicateWithPitCrew() {
        System.out.println("Comunicándose con la pit crew.");
    }
}
