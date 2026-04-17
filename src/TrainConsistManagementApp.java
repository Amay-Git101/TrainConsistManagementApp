import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    private static List<String> trainConsist = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        addPassengerBogies();
        displayBogies();
        removeBogie("AC Chair");
        checkBogie("Sleeper");
        displayBogies();
    }

    public static void addPassengerBogies() {
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");
    }

    public static void displayBogies() {
        System.out.println("Bogies: " + trainConsist);
    }

    public static void removeBogie(String bogie) {
        trainConsist.remove(bogie);
    }

    public static void checkBogie(String bogie) {
        System.out.println(bogie + " exists: " + trainConsist.contains(bogie));
    }
}