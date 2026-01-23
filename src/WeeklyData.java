/**
 * Represents a week’s worth of sleep data and provides methods to analyze it.
 * Each value in the array represents hours slept on a particular day.
 *
 * This class can calculate:
 * - total sleep hours
 * - average sleep per night
 * - maximum sleep in a day
 * - minimum sleep in a day
 *
 * @author Rin Ryu
 * @version 1/22/2026
 */
public class WeeklyData {

    /** Array storing hours of sleep for each day of the week */
    private double[] sleepData;

    /**
     * Constructs a WeeklyData object by making a deep copy of the input array.
     * Prevents external changes from affecting the internal data.
     *
     * @param input an array of sleep hours for each day
     */
    public WeeklyData(double[] input) {
        // If input is null, create an empty array
        if (input == null) {
            sleepData = new double[0];
        } else {
            // Create a new array and copy each value from input
            sleepData = new double[input.length];
            for (int i = 0; i < input.length; i++) {
                sleepData[i] = input[i];
            }
        }
    }

    /**
     * Calculates the total hours slept during the week.
     *
     * @return sum of all sleep hours
     */
    public double getTotal() {
        double total = 0.0;

        // Add each day’s sleep to total
        for (double hours : sleepData) {
            total += hours;
        }

        return total;
    }

    /**
     * Calculates the average number of hours slept per day.
     *
     * @return average sleep, or 0.0 if no data exists
     */
    public double getAverage() {
        if (sleepData.length == 0) {
            return 0.0;
        }

        // Use getTotal() and divide by number of days
        return getTotal() / sleepData.length;
    }

    /**
     * Finds the maximum hours slept in a single day.
     *
     * @return maximum sleep value, or 0.0 if no data exists
     */
    public double getMax() {
        if (sleepData.length == 0) {
            return 0.0;
        }

        // Assume the first day is the max initially
        double max = sleepData[0];

        // Compare with remaining days to find the max
        for (int i = 1; i < sleepData.length; i++) {
            if (sleepData[i] > max) {
                max = sleepData[i];
            }
        }

        return max;
    }

    /**
     * Finds the minimum hours slept in a single day.
     *
     * @return minimum sleep value, or 0.0 if no data exists
     */
    public double getMin() {
        if (sleepData.length == 0) {
            return 0.0;
        }

        // Assume the first day is the min initially
        double min = sleepData[0];

        // Compare with remaining days to find the min
        for (int i = 1; i < sleepData.length; i++) {
            if (sleepData[i] < min) {
                min = sleepData[i];
            }
        }

        return min;
    }

    /**
     * Returns a formatted string showing each day’s sleep.
     *
     * Example:
     * Day 1: 7.5 hours
     * Day 2: 8.0 hours
     *
     * @return formatted string representing the week’s sleep data
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Loop through each day and append data to the string
        for (int i = 0; i < sleepData.length; i++) {
            sb.append("Day ").append(i + 1)
              .append(": ")
              .append(sleepData[i])
              .append(" hours\n");
        }

        return sb.toString();
    }
}
