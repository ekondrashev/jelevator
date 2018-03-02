package elevator;

public interface Elevator {
    Integer floor();

    void call();

    Direction to();

    Direction direction();


    public enum Direction {
        UP,
        DOWN,
        STOP;
    }

}
