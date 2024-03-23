public class TireBringer extends PitCrewMember {
    private int numberOfTiresBrought;
    private double averageTireBringingTime;

    public TireBringer(int numberOfTiresBrought, double averageTireBringingTime) {
        this.numberOfTiresBrought = numberOfTiresBrought;
        this.averageTireBringingTime = averageTireBringingTime;
    }

    public void performTask() {
        System.out.println("Ayudante de mecánico de neumáticos trayendo neumáticos.");
    }

    public void communicateWithDriver(TeamDriver driver) {
        System.out.println("Ayudante de mecánico de neumáticos comunicándose con el piloto " + driver.getName() + ".");
    }

    public void checkEquipment() {
        System.out.println("Ayudante de mecánico de neumáticos verificando el equipo de neumáticos.");
    }

    public int getNumberOfTiresBrought() {
        return this.numberOfTiresBrought;
    }

    public double getAverageTireBringingTime() {
        return this.averageTireBringingTime;
    }
}