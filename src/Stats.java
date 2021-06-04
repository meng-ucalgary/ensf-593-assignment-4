/**
 * Stats class to hold the integers entered by the user, and provide methods to
 * return the mean and median of all the entered integers
 *
 * @author Bhavyai Gupta
 * @version 1.0
 * @since June 4, 2021
 *
 */
public class Stats {
    /**
     * int array to store the grades entered by the user upto 100
     */
    private int grades[];

    /**
     * counter to track the number of elements entered by the user
     */
    private int count;

    /**
     * Default constructor to initialize object variables with default values
     */
    public Stats() {
        grades = new int[100];
        count = 0;
    }

    /**
     * Method to insert an integer into the grades array
     *
     * @param x the integer to be added to the grades array
     */
    public void add(int x) {
        grades[count++] = x;
    }

    /**
     * Method to calculate the mean of all the integers in the grades array
     *
     * @return the mean of all the integers in the grades array
     */
    public double getMean() {
        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum = sum + grades[i];
        }

        return ((double) sum / (double) count);
    }

    /**
     * Method to calculate the median of all the integers in the grades array
     *
     * @return the median of all the integers in the grades array
     */
    public double getMedian() {
        // sorting is required to find the mediab
        this.sort(this.grades, this.count);

        // count even means even number of elements
        if (count % 2 == 0) {
            // get the midpoints first
            int mid1 = grades[(count / 2) - 1];
            int mid2 = grades[count / 2];

            // average of midpoints is the median
            return ((double) (mid1 + mid2)) / 2;
        }

        // count odd means odd number of elements
        else {
            // midpoint is the median
            return grades[count / 2];
        }
    }

    /**
     * Overriding toString method to return the sorted array, mean, and the median
     */
    @Override
    public String toString() {
        // call median first so that we are operating on sorted array
        double median = this.getMedian();
        double mean = this.getMean();

        // string to store the sorted array for display
        StringBuilder gradesToString = new StringBuilder();

        for (int i = 0; i < count; i++) {
            gradesToString.append(grades[i]);

            if (i != count - 1)
                gradesToString.append(" ");
        }

        return String.format("Sorted Grades = %s%n%nMean = %.2f%nMedian = %.2f%n", gradesToString.toString(), mean,
                median);
    }

    /**
     * INSERTION SORT OF THE FIRST n ELEMENTS OF ARRAY arr SEE PAGE 407 TO PAGE 410
     * FOR A DISCUSSION
     *
     * @param grades the array to be sorted
     * @param count  the number of elements in the array
     */
    public void sort(int[] grades, int count) {
        int temp, j, k;
        for (j = 1; j < count; j++) {
            temp = grades[j];
            for (k = j - 1; (k >= 0) && (grades[k] > temp); k--) {
                grades[k + 1] = grades[k];
            }
            grades[k + 1] = temp;
        }
    }
}
