public class TeamDriverB extends TeamDriver {
    private String name;

    public TeamDriverB() {
        this.name = "Team Driver B";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void announcePitStop() {
        System.out.println("El piloto B anunció una parada en boxes.");
    }

    public void communicateWithPitCrew(PitCrewTeam pitCrew) {
        pitCrew.communicateWithDriver(this);
    }

    public void communicateWithPitCrew() {
        System.out.println("Comunicando con la pit crew (Equipo B)");
    }
}
