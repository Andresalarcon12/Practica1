public class TireChanger extends PitCrewMember {
    private int numberOfTiresChanged;
    private double averageTireChangeTime;

    public TireChanger(int numberOfTiresChanged, double averageTireChangeTime) {
        this.numberOfTiresChanged = numberOfTiresChanged;
        this.averageTireChangeTime = averageTireChangeTime;
    }

    public void performTask() {
        System.out.println("Tyre on cambiando neumáticos.");
    }

    public void communicateWithDriver(TeamDriver driver) {
        System.out.println("Mecánico comunicándose con el piloto " + driver.getName() + ".");
    }

    public void checkEquipment() {
        System.out.println("Mecánico verificando el equipo de cambio de neumáticos.");
    }

    public int getNumberOfTiresChanged() {
        return this.numberOfTiresChanged;}

    public double getAverageTireChangeTime() {
        return this.averageTireChangeTime;
    }
}