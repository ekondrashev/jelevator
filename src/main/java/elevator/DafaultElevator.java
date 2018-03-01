package elevator;

public class DafaultElevator implements Elevator {
    private int floor;

    public DafaultElevator(int floor) {
        this.floor = floor;
    }

    @Override
    public Integer floor() {
        return floor;
    }

    @Override
    public Boolean call() {
        return null;
    }

    @Override
    public Integer moves() {
        return null;
    }

    @Override
    public Direction direction() {
        return null;
    }
}
