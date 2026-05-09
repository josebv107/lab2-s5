public class AdaptadorPato implements Pato {
    protected Drone drone;

    public AdaptadorPato(Drone drone) {
        this.drone = drone;
    }

    @Override
    public void cuaquear() {
        drone.beep();
    }

    @Override
    public void volar() {
        drone.girarRotor();
        drone.despegar();
    }
}
