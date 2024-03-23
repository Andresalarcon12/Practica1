public class Enginner extends PitCrewMember {   //Tire Gunner
    private int yearsOfExperience;
    private String areaOfExpertise;

    public Enginner(int yearsOfExperience, String areaOfExpertise) {
        this.yearsOfExperience = yearsOfExperience;
        this.areaOfExpertise = areaOfExpertise;
    }

    public void performTask() {
        System.out.println("Tyre gunner llegando con la pistola de llantas y aflojar.");
    }

    public void communicateWithDriver(TeamDriver driver) {
        System.out.println("Ingeniero comunicándose con el piloto " + driver.getName() + ".");
    }

    public void checkEquipment() {
        System.out.println("Ingeniero verificando el equipo del coche.");
    }

    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }

    public String getAreaOfExpertise() {
        return this.areaOfExpertise;
    }
}