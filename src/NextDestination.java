import com.google.gson.Gson;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class NextDestination {
    private List<Destination> destinations;
    private Scanner scanner;

    public NextDestination() {
        scanner = new Scanner(System.in);
        destinations = new ArrayList<>();
        loadDestinations();
    }

    private void loadDestinations() {
        try {
            FileReader reader = new FileReader("destinations.json");
            Gson gson = new Gson();
            DestinationData data = gson.fromJson(reader, DestinationData.class);
            destinations = data.destinations;
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    
    private static class DestinationData {
        List<Destination> destinations;
    }

    private String getChoice(String choice, String[] options) {
        System.out.println("\n" + choice);
        
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }

        while (true) {
            System.out.print("Enter your choice (1-" + options.length + "): ");
            try {
                int choice2 = Integer.parseInt(scanner.nextLine());
                if (choice2 >= 1 && choice2 <= options.length) {
                    return options[choice2 - 1];
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
            //System.out.println("Please enter a valid number!");
        }
    }

    private List<String> getActivities(String[] allActivities) {
        System.out.println("\nActivities:");
        
        for (int i = 0; i < allActivities.length; i++) {
            System.out.println((i + 1) + ". " + allActivities[i]);
        }

        List<String> selectedActivities = new ArrayList<>();
        
        while (selectedActivities.isEmpty()) {
            System.out.println("Enter activity numbers separated by spaces (e.g., 1 2 3): ");
            String input = scanner.nextLine();
            String[] choices = input.split(" ");

            for (String choice : choices) {
                try {
                    int number = Integer.parseInt(choice);
                    if (number >= 1 && number <= allActivities.length) {
                        selectedActivities.add(allActivities[number - 1]);
                    }
                } catch (NumberFormatException e) {
                    
                }
            }

            if (selectedActivities.isEmpty()) {
                System.out.println("Please select at least one valid activity!");
            }
        }

        return selectedActivities;
    }

    private List<Destination> findMatches(String weather, String budget, List<String> activities) {
        List<Destination> matches = new ArrayList<>();

        for (Destination dest : destinations) {
            if (dest.getWeather().equals(weather) && dest.getBudget().equals(budget)) {
                boolean allActivitiesPresent = true;
                for (String activity : activities) {
                    if (!dest.getActivities().contains(activity)) {
                        allActivitiesPresent = false;
                        break;
                    }
                }
                
                if (allActivitiesPresent) {
                    matches.add(dest);
                }
            }
        }

        return matches;
    }

    public void start() {
        String[] weatherOptions = {"cold", "warm", "hot"};
        String[] budgetOptions = {"low", "medium", "high", "unlimited"};
        String[] activityOptions = {"beach", "hiking", "sightseeing", "culture", "food", "shopping", "museums", "northern lights", "temples"};

        String weather = getChoice("What weather do you prefer?", weatherOptions);
        
        String budget = getChoice("What's your budget?\n" + "low (~500 Euros)\n" + "medium (~500-1000 Euros)\n" + "high (~1000 Euros)\n" + "unlimited", budgetOptions);
        
        List<String> activities = getActivities(activityOptions);

        List<Destination> matches = findMatches(weather, budget, activities);

        System.out.println("\nMatching destinations:");
        if (matches.isEmpty()) {
            System.out.println("No destinations match your preferences.");
        } else {
            for (Destination dest : matches) {
                System.out.println("\n" + dest);
            }
        }
    }

    public static void main(String[] args) {
        NextDestination program = new NextDestination();
        program.start();
    }
}