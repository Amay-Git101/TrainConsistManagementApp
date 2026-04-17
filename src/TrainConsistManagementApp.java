import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainConsistManagementApp {

    private static List<String> trainConsist = new ArrayList<>();
    private static Set<String> bogieIds = new HashSet<>();

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        addPassengerBogies();
        displayBogies();
        removeBogie("AC Chair");
        checkBogie("Sleeper");
        displayBogies();

        addBogieIds();
        displayBogieIds();
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

    public static void addBogieIds() {
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101");
        bogieIds.add("BG103");
    }

    public static void displayBogieIds() {
        System.out.println("Unique Bogie IDs: " + bogieIds);
    }
}