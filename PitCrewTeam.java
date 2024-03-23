import java.util.ArrayList;
import java.util.List;

public class PitCrewTeam extends PitCrewMember {
    private List<PitCrewMember> members;
    private TeamDriverA driverA;
    private TeamDriverB driverB;

    public PitCrewTeam() {
        this.members = new ArrayList<PitCrewMember>();
    }

    public void addMember(PitCrewMember member) {
        this.members.add(member);
    }

    @Override 
    public void performTask() {
        System.out.println("Realizando tarea de la tripulación");
    }

    public void performTasks() {
        for (PitCrewMember member : members) {
            member.performTask();
        }
    }

    public void communicateWithDrivers() {
        for (PitCrewMember member : members) {
            member.communicateWithDriver(driverA);
            member.communicateWithDriver(driverB);
        }
    }

    public void checkEquipment() {
        System.out.println("Encargado de equipo verificando el equipo general.");
    }

    public void setDriverA(TeamDriverA driver) {
        this.driverA = driver;
    }

    public void setDriverB(TeamDriverB driver) {
        this.driverB = driver;
    }

    public void communicateWithDriver(TeamDriver driver) {
        System.out.println("Comunicándose con el conductor: " + driver.getName());
    }
}
