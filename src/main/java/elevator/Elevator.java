package elevator;

public interface Elevator{
 Integer floor();
 Boolean call();
 Integer moves();
 Direction direction();



     public enum Direction {
        UP,
        DOWN,
        STOP;
    }

}
