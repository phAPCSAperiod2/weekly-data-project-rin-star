/**
 * The WeeklyData class stores and analyzes a week’s worth of sleep data.
 * Each value represents the number of hours slept on a given day.
 *
 * This class provides methods to calculate:
 * - total sleep hours
 * - average sleep per night
 * - maximum sleep in a day
 * - minimum sleep in a day
 *
 * AP CSA – Arrays & OOP Practice
 */
public class WeeklyData {

    // -------------------------------------------------------------
    // Instance Variables
    // -------------------------------------------------------------
    /** Array storing hours of sleep for each day */
    private double[] sleepData;


    // -------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------
    /**
     * Constructs a WeeklyData object by deep-copying the input array.
     *
     * @param input an array representing hours slept each day
     */
    public WeeklyData(double[] input) {
        if (input == null) {
            sleepData = new double[0];
        } else {
            sleepData = new double[input.length];
            for (int i = 0; i < input.length; i++) {
                sleepData[i] = input[i];
            }
        }
    }


    // -------------------------------------------------------------
    // getTotal
    // -------------------------------------------------------------
    /**
     * Calculates the total number of hours slept during the week.
     *
     * @return total sleep hours
     */
    public double getTotal() {
        double total = 0.0;
        for (double hours : sleepData) {
            total += hours;
        }
        return total;
    }


    // -------------------------------------------------------------
    // getAverage
    // -------------------------------------------------------------
    /**
     * Calculates the average number of hours slept per day.
     *
     * @return average sleep hours, or 0.0 if no data exists
     */
    public double getAverage() {
        if (sleepData.length == 0) {
            return 0.0;
        }
        return getTotal() / sleepData.length;
    }


    // -------------------------------------------------------------
    // getMax
    // -------------------------------------------------------------
    /**
     * Finds the maximum number of hours slept in a single day.
     *
     * @return maximum sleep value
     */
    public double getMax() {
        if (sleepData.length == 0) {
            return 0.0;
        }

        double max = sleepData[0];
        for (int i = 1; i < sleepData.length; i++) {
            if (sleepData[i] > max) {
                max = sleepData[i];
            }
        }
        return max;
    }


    // -------------------------------------------------------------
    // getMin
    // -------------------------------------------------------------
    /**
     * Finds the minimum number of hours slept in a single day.
     *
     * @return minimum sleep value
     */
    public double getMin() {
        if (sleepData.length == 0) {
            return 0.0;
        }

        double min = sleepData[0];
        for (int i = 1; i < sleepData.length; i++) {
            if (sleepData[i] < min) {
                min = sleepData[i];
            }
        }
        return min;
    }


    // -------------------------------------------------------------
    // toString
    // -------------------------------------------------------------
    /**
     * Returns a formatted multi-line String of sleep data.
     *
     * @return formatted String showing sleep per day
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sleepData.length; i++) {
            sb.append("Day ").append(i + 1)
              .append(": ")
              .append(sleepData[i])
              .append(" hours\n");
        }

        return sb.toString();
    }
}
