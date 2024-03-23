public class Mechanic extends PitCrewMember {
    private int numberOfTools;
    private String specialization;

    public Mechanic(int numberOfTools, String specialization) {
        this.numberOfTools = numberOfTools;
        this.specialization = specialization;
    }

    public void performTask() {
        System.out.println("Mecánico realizando reparaciones en el coche.");
    }

    public void communicateWithDriver(TeamDriver driver) {
        System.out.println("Mecánico comunicándose con el piloto " + driver.getName() + ".");
    }

    public void checkEquipment() {
        System.out.println("Mecánico verificando el equipo de herramientas.");
    }

    public int getNumberOfTools() {
        return this.numberOfTools;
    }

    public String getSpecialization() {
        return this.specialization;
    }
}