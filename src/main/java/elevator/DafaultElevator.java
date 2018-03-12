package elevator;

public class DafaultElevator implements Elevator {


    @Override
    public int floor() {
        return 0;
    }

    @Override
    public Queue call(int floor) {
        return null;
    }

    @Override
    public Moves moves() {
        return null;
    }

}