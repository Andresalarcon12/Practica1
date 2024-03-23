        public class LollipopMan extends PitCrewMember {

            private String signalColor;
            private double averageSignalTime;

            public LollipopMan(String signalColor, double averageSignalTime) {
                this.signalColor = signalColor;
                this.averageSignalTime = averageSignalTime;
            }

            @Override
            public void performTask() {
                System.out.println("Hombre de la señal mostrando la señal con color "
                        + this.signalColor + ".");
            }

            @Override
            public void checkEquipment() {
                System.out.println("Hombre de la señal verificando el equipo de señal.");
                verifyRodExtension();
                verifySignalLight();
            }

            private void verifyRodExtension() {
                System.out.println("Hombre de la señal verificando que la varilla 'lollipop'");
                System.out.println("se encuentre extendida correctamente.");
            }

            private void verifySignalLight() {
                System.out.println("Hombre de la señal verificando que la luz de señal funcione correctamente.");
            }

            @Override
            public void communicateWithDriver(TeamDriver driver) {
                System.out.println("Hombre de la señal comunicándose con el piloto " + driver.getName() + ". Señalando que el coche está listo.");
            }

        }