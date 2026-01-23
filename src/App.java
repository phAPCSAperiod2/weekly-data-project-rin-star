import java.util.Scanner;

/**
 * Main application class for the Weekly Sleep Analyzer.
 * Collects user input and displays sleep statistics.
 *
 * AP CSA – Arrays & OOP Practice
 */
public class App {

    public static void main(String[] args) {

        // -------------------------------------------------------------
        // TODO 1: Create a Scanner for user input
        // -------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);


        // -------------------------------------------------------------
        // TODO 2: Give information about your program
        // -------------------------------------------------------------
        System.out.println("Weekly Sleep Analyzer");
        System.out.println("Enter the number of hours you slept each day.\n");


        // -------------------------------------------------------------
        // TODO 3: Create an array to hold 7 days of sleep data
        // -------------------------------------------------------------
        double[] weekData = new double[7];


        // -------------------------------------------------------------
        // TODO 4: Collect sleep data with validation
        // -------------------------------------------------------------
        for (int i = 0; i < weekData.length; i++) {
            double hours;

            while (true) {
                System.out.print("Enter hours slept for day " + (i + 1) + ": ");
                hours = scanner.nextDouble();

                if (hours >= 0 && hours <= 24) {
                    break;
                }
                System.out.println("Invalid input. Hours must be between 0 and 24.");
            }

            weekData[i] = hours;
        }


        // -------------------------------------------------------------
        // TODO 5: Create a WeeklyData object
        // -------------------------------------------------------------
        WeeklyData sleepWeek = new WeeklyData(weekData);


        // -------------------------------------------------------------
        // TODO 6: Display analysis results
        // -------------------------------------------------------------
        System.out.println("\n--- Sleep Summary ---");
        System.out.printf("Total sleep: %.2f hours%n", sleepWeek.getTotal());
        System.out.printf("Average sleep: %.2f hours/night%n", sleepWeek.getAverage());
        System.out.printf("Most sleep in one day: %.2f hours%n", sleepWeek.getMax());
        System.out.printf("Least sleep in one day: %.2f hours%n", sleepWeek.getMin());


        // -------------------------------------------------------------
        // TODO 7: Display full week of data
        // -------------------------------------------------------------
        System.out.println("\n--- Daily Breakdown ---");
        System.out.println(sleepWeek);


        // -------------------------------------------------------------
        // TODO 8: Give user insights
        // -------------------------------------------------------------
        if (sleepWeek.getAverage() < 7) {
            System.out.println("Insight: You should try to get more sleep next week!");
        } else {
            System.out.println("Insight: Great job maintaining healthy sleep habits!");
        }

        scanner.close();
    }
}
