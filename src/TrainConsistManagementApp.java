import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String trainIdPattern = "TRN-\\d{4}";
        String cargoCodePattern = "PET-[A-Z]{2}";

        Pattern trainPattern = Pattern.compile(trainIdPattern);
        Pattern cargoPattern = Pattern.compile(cargoCodePattern);

        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        if (isTrainValid) {
            System.out.println("Train ID is valid");
        } else {
            System.out.println("Train ID is invalid");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is valid");
        } else {
            System.out.println("Cargo Code is invalid");
        }

        sc.close();
    }
}