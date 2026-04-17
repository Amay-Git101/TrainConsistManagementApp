class InvalidCapacityException extends Exception {
    InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    String name;
    int capacity;

    PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " - " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println(b1);

            PassengerBogie b2 = new PassengerBogie("AC Chair", 60);
            System.out.println(b2);

            PassengerBogie b3 = new PassengerBogie("First Class", 0);
            System.out.println(b3);

        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}