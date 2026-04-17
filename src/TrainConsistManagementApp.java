import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Comparator;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " - " + capacity;
    }
}

public class TrainConsistManagementApp {

    private static List<String> trainConsist = new ArrayList<>();
    private static Set<String> bogieIds = new HashSet<>();
    private static LinkedList<String> orderedConsist = new LinkedList<>();
    private static LinkedHashSet<String> formation = new LinkedHashSet<>();
    private static HashMap<String, Integer> capacityMap = new HashMap<>();
    private static List<Bogie> bogieList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        addPassengerBogies();
        displayBogies();
        removeBogie("AC Chair");
        checkBogie("Sleeper");
        displayBogies();

        addBogieIds();
        displayBogieIds();

        setupOrderedConsist();
        displayOrderedConsist();

        setupFormation();
        displayFormation();

        setupCapacityMap();
        displayCapacityMap();

        setupBogieObjects();
        sortBogies();
        displaySortedBogies();
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

    public static void setupOrderedConsist() {
        orderedConsist.add("Engine");
        orderedConsist.add("Sleeper");
        orderedConsist.add("AC");
        orderedConsist.add("Cargo");
        orderedConsist.add("Guard");
        orderedConsist.add(2, "Pantry");
        orderedConsist.removeFirst();
        orderedConsist.removeLast();
    }

    public static void displayOrderedConsist() {
        System.out.println("Ordered Train Consist: " + orderedConsist);
    }

    public static void setupFormation() {
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper");
    }

    public static void displayFormation() {
        System.out.println("Final Formation: " + formation);
    }

    public static void setupCapacityMap() {
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 60);
        capacityMap.put("First Class", 24);
    }

    public static void displayCapacityMap() {
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " Capacity: " + entry.getValue());
        }
    }

    public static void setupBogieObjects() {
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 24));
    }

    public static void sortBogies() {
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));
    }

    public static void displaySortedBogies() {
        System.out.println("Sorted Bogies by Capacity:");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }
    }
}