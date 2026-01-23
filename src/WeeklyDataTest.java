/**
 * Manual test class for WeeklyData.
 * This replaces JUnit tests for environments without JUnit support.
 *
 * AP CSA – Arrays & OOP Practice
 * 
 * NOTE: Used Ai because given WeeklyDataTest.java did not work
 * 
 * @author Rin Ryu
 * @collaborators ChatGPT
 * @version 1/22/2026
 */

public class WeeklyDataTest {

    public static void main(String[] args) {

        System.out.println("Running WeeklyData tests...\n");

        testConstructorDeepCopy();
        testGetTotal();
        testGetAverage();
        testGetMax();
        testGetMin();
        testToString();

        System.out.println("\nAll tests completed.");
    }

    private static void testConstructorDeepCopy() {
        double[] input = {8.0, 7.0, 6.0};
        WeeklyData wd = new WeeklyData(input);

        double originalTotal = wd.getTotal();
        input[0] = 100.0;

        System.out.println("Constructor Deep Copy Test:");
        System.out.println(originalTotal == wd.getTotal() ? "PASS" : "FAIL");
        System.out.println();
    }

    private static void testGetTotal() {
        WeeklyData wd = new WeeklyData(new double[]{6, 7, 8});
        System.out.println("getTotal Test:");
        System.out.println(wd.getTotal() == 21.0 ? "PASS" : "FAIL");
        System.out.println();
    }

    private static void testGetAverage() {
        WeeklyData wd = new WeeklyData(new double[]{6, 8, 10});
        System.out.println("getAverage Test:");
        System.out.println(wd.getAverage() == 8.0 ? "PASS" : "FAIL");
        System.out.println();
    }

    private static void testGetMax() {
        WeeklyData wd = new WeeklyData(new double[]{6, 9, 7});
        System.out.println("getMax Test:");
        System.out.println(wd.getMax() == 9.0 ? "PASS" : "FAIL");
        System.out.println();
    }

    private static void testGetMin() {
        WeeklyData wd = new WeeklyData(new double[]{6, 9, 7});
        System.out.println("getMin Test:");
        System.out.println(wd.getMin() == 6.0 ? "PASS" : "FAIL");
        System.out.println();
    }

    private static void testToString() {
        WeeklyData wd = new WeeklyData(new double[]{8, 7});
        String output = wd.toString();

        System.out.println("toString Test:");
        if (output.contains("Day 1") && output.contains("Day 2")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println();
    }
}
