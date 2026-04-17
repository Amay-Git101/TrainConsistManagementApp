import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    private static List<String> trainConsist = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        displayBogieCount();
    }

    public static void displayBogieCount() {
        System.out.println("Initial Bogie Count: " + trainConsist.size());
    }
}