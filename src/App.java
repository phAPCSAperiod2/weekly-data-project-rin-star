import java.util.Scanner;

/**
 * Main application class for the Weekly Sleep Analyzer.
 * Collects and analyzes a week’s worth of sleep data.
 * Displays totals, averages, min/max, and provides user insights.
 *
 * @author Rin Ryu
 * @version 1/22/2026
 */
public class App {

    /**
     * Main method that drives the Weekly Sleep Analyzer program.
     * Collects sleep data for 7 days, analyzes it, and displays results.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Introduce the program to the user
        System.out.println("Weekly Sleep Analyzer");
        System.out.println("Enter the number of hours you slept each day (0-24 hours).\n");

        // Create an array to store 7 days of sleep data
        double[] weekData = new double[7]; // array index 0 = day 1, index 6 = day 7

        // Collect sleep data from the user with validation
        for (int i = 0; i < weekData.length; i++) {
            double hours;

            while (true) {
                System.out.print("Enter hours slept for day " + (i + 1) + ": ");

                // Check if input is a valid number
                if (scanner.hasNextDouble()) {
                    hours = scanner.nextDouble();

                    // Check if hours are in a reasonable range
                    if (hours >= 0 && hours <= 24) {
                        break; // valid input, exit loop
                    } else {
                        System.out.println("Invalid input. Hours must be between 0 and 24.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // clear invalid input
                }
            }

            // Store valid input in the weekData array
            weekData[i] = hours;
        }

        // Create a WeeklyData object to analyze the week's sleep
        WeeklyData sleepWeek = new WeeklyData(weekData);

        // Display analysis results: total, average, min, max
        System.out.println("\n--- Sleep Summary ---");
        System.out.printf("Total sleep: %.2f hours%n", sleepWeek.getTotal());
        System.out.printf("Average sleep: %.2f hours/night%n", sleepWeek.getAverage());
        System.out.printf("Most sleep in one day: %.2f hours%n", sleepWeek.getMax());
        System.out.printf("Least sleep in one day: %.2f hours%n", sleepWeek.getMin());

        // Display full week of sleep data
        System.out.println("\n--- Daily Breakdown ---");
        System.out.println(sleepWeek); // uses WeeklyData.toString()

        // Provide simple insights based on average sleep
        if (sleepWeek.getAverage() < 7) {
            System.out.println("Insight: You should try to get more sleep next week!");
        } else if (sleepWeek.getAverage() > 9) {
            System.out.println("Insight: You slept more than recommended. Aim for 7-9 hours per night.");
        } else {
            System.out.println("Insight: Great job maintaining healthy sleep habits!");
        }

        // Close scanner to prevent resource leaks
        scanner.close();
    }
}
