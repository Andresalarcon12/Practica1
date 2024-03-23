public class FuelMan extends PitCrewMember {
    private double averageFuelingTime;
    private int fuelCapacity;

    public FuelMan(double averageFuelingTime, int fuelCapacity) {
        this.averageFuelingTime = averageFuelingTime;
        this.fuelCapacity = fuelCapacity;
    }

    public void performTask() {
        System.out.println("Encargado de combustible repostando combustible.");
    }

    public void communicateWithDriver(TeamDriver driver) {
        System.out.println("Encargado de combustible comunicándose con el piloto " + driver.getName() + ".");
    }

    public void checkEquipment() {
        System.out.println("Encargado de combustible verificando el equipo de combustible.");
    }

    public double getAverageFuelingTime() {
        return this.averageFuelingTime;
    }

    public int getFuelCapacity() {
        return this.fuelCapacity;
    }
}