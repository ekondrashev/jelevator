package elevator;

import java.util.Timer;

/**
 *
 */
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

    /**
     * Interface "Queue" we need to determine the queue.
     */
    public interface Queue {
        String toString();

        /**
         * Class "Position" we need to determine the position in the queue.
         * Method "positionNumber" we need to know what position by number.
         * Method "time" to calculate the time for how long we have to wait for the elevator, this method
         * takes a queue because every single queue is a certain amount of time.
         */
        public class Position {

            private Queue queue;


            public Position(Queue queue) {
                this.queue = queue;
            }

            int positionNumber() {
                return positionNumber();
            }

            Timer time(Queue queue) {
                return time(queue);
            }


        }

    }

}


