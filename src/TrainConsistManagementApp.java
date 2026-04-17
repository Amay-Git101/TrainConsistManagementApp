public class TrainConsistManagementApp {

    public static void main(String[] args) {

        String[] bogieIds = {};
        String searchKey = "BG101";

        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie Found");
        } else {
            System.out.println("Bogie Not Found");
        }
    }
}