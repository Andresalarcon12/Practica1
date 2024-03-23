public class SeatBeltMan extends PitCrewMember {
    private double averageBucklingTime;

    public SeatBeltMan(double averageBucklingTime) {
        this.averageBucklingTime = averageBucklingTime;
    }

    public void performTask() {
        System.out.println("Encargado del cinturón de seguridad abrochando el cinturón.");
    }

    public void communicateWithDriver(TeamDriver driver) {
        System.out.println("Encargado del cinturón de seguridad comunicándose con el piloto " + driver.getName() + ".");
    }

    public void checkEquipment() {
        System.out.println("Encargado del cinturón de seguridad verificando el equipo de cinturones.");
    }

    public double getAverageBucklingTime() {
        return this.averageBucklingTime;
    }
}