import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        F1Team f1Team = new F1Team("Ferrari", 1979);


        Enginner enginner1 = new Enginner(10, "Electrónica");
        Enginner enginner2 = new Enginner(15, "Mecánica");

        Mechanic mechanic1 = new Mechanic(50, "Frenos");
        Mechanic mechanic2 = new Mechanic(60, "Suspensión");

        TireChanger tireChanger1 = new TireChanger(50, 2.5);
        TireChanger tireChanger2 = new TireChanger(60, 3.0);

        TireBringer tireBringer1 = new TireBringer(4, 0.5);
        TireBringer tireBringer2 = new TireBringer(4, 0.5);

        LollipopMan lollipopMan = new LollipopMan("Rojo", 1.5);

        FuelMan fuelMan = new FuelMan(12.0, 100);

        FrontJackMan frontJackMan = new FrontJackMan(3.0);

        RearJackMan rearJackMan = new RearJackMan(3.0);

        WindscreenCleaner windscreenCleaner1 = new WindscreenCleaner(0.5, 10);
        WindscreenCleaner windscreenCleaner2 = new WindscreenCleaner(0.5, 10);

        SeatBeltMan seatBeltMan = new SeatBeltMan(1.0);

        // Agregar miembros de la pit crew
        PitCrewTeam pitCrew = new PitCrewTeam();
        pitCrew.addMember(enginner1);
        pitCrew.addMember(enginner2);
        pitCrew.addMember(mechanic1);
        pitCrew.addMember(mechanic2);
        pitCrew.addMember(tireChanger1);
        pitCrew.addMember(tireChanger2);
        pitCrew.addMember(tireBringer1);
        pitCrew.addMember(tireBringer2);
        pitCrew.addMember(lollipopMan);
        pitCrew.addMember(fuelMan);
        pitCrew.addMember(frontJackMan);
        pitCrew.addMember(rearJackMan);
        pitCrew.addMember(windscreenCleaner1);
        pitCrew.addMember(windscreenCleaner2);
        pitCrew.addMember(seatBeltMan);


        TeamDriverA driverA = new TeamDriverA();
        driverA.setName("Piloto A");

        TeamDriverB driverB = new TeamDriverB();
        driverB.setName("Piloto B");


        pitCrew.setDriverA(driverA);
        pitCrew.setDriverB(driverB);


        pitCrew.performTasks();


        pitCrew.communicateWithDrivers();


        pitCrew.checkEquipment();
    }
}

