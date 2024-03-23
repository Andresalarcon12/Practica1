public class WindscreenCleaner extends PitCrewMember {
    private double averageCleaningTime;
    private int numberOfCleaningsPerRace;

    public WindscreenCleaner(double averageCleaningTime, int numberOfCleaningsPerRace) {
        this.averageCleaningTime = averageCleaningTime;
         this.numberOfCleaningsPerRace = numberOfCleaningsPerRace;
    }

    public void performTask() {
        System.out.println("Encargado del limpiaparabrisas limpiando el parabrisas.");
    }

    public void communicateWithDriver(TeamDriver driver) {
        System.out.println("Encargado del limpiaparabrisas comunicándose con el piloto " + driver.getName() + ".");
    }

    public void checkEquipment() {
        System.out.println("Encargado del limpiaparabrisas verificando el equipo de limpieza.");
    }

    public double getAverageCleaningTime() {
        return this.averageCleaningTime;
    }

    public int getNumberOfCleaningsPerRace() {
        return this.numberOfCleaningsPerRace;
    }
}
