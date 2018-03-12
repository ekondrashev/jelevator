package elevator;

import java.util.Timer;

public interface Elevator {
    int floor();

    Queue call(int floor);

    Moves moves();

    public class Moves {

        private int floor;
        private Direction direction;

        Moves(int floor, Direction direction) {
            this.floor = floor;
            this.direction = direction;
        }

        int to() {
            return floor;
        }

        public enum Direction {
            UP,
            DOWN,
            STOP;
        }

        public Direction direction() {

            return direction;
        }
    }

    public interface Queue {
        String toString();

        Queue queue();

        int position();

        Timer time();

    }

}


