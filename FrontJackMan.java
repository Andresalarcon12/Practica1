public class FrontJackMan extends PitCrewMember {
    private double averageJackingTime;

    public FrontJackMan(double averageJackingTime) {
        this.averageJackingTime = averageJackingTime;
    }

    public void performTask() {
        System.out.println("Encargado de la elevación delantera levantando el coche.");
    }

    public void communicateWithDriver(TeamDriver driver) {
        System.out.println("Encargado de la elevación delantera comunicándose con el piloto " + driver.getName() + ".");
    }

    public void checkEquipment() {
        System.out.println("Encargado de la elevación delantera verificando el equipo deelevación.");
    }

    public double getAverageJackingTime() {
        return this.averageJackingTime;
    }
}