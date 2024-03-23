public class RearJackMan extends PitCrewMember {
    private double averageJackingTime;

    public RearJackMan(double averageJackingTime) {
        this.averageJackingTime = averageJackingTime;
    }

    public void performTask() {
        System.out.println("Encargado de la elevación trasera levantando el coche.");
    }

    public void communicateWithDriver(TeamDriver driver) {
        System.out.println("Encargado de la elevación trasera comunicándose con el piloto " + driver.getName() + ".");
    }

    public void checkEquipment() {
        System.out.println("Encargado de la elevación trasera verificando el equipo de elevación.");
    }

    public double getAverageJackingTime() {
        return this.averageJackingTime;
    }
}