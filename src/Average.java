import java.util.Scanner;

// Average class to handle array of scores, sorting, and mean calculation
public class Average {
    private int[] data; // Array to store scores
    private double mean; // Variable to store the mean value

    // Constructor initializes the array and handles user input
    public Average() {
        data = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter 5 scores
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter score number " + (i + 1) + ": ");
            data[i] = scanner.nextInt();
        }

        // Sort scores in descending order and calculate their mean
        selectionSort();
        calculateMean();
    }

    // Calculate the arithmetic mean of the scores
    public void calculateMean() {
        int total = 0;

        // Sum up all the values in the scores array
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }

        // Compute the mean by dividing the total by the number of scores
        mean = (double) total / data.length;
    }

    // Sort the scores in descending order using selection sort
    public void selectionSort() {
        for (int i = 0; i < data.length - 1; i++) {
            int maxIndex = i;

            // Find the maximum element in the remaining unsorted portion of the array
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap the found maximum with the first element
            int temp = data[i];
            data[i] = data[maxIndex];
            data[maxIndex] = temp;
        }
    }

    // Convert the sorted data and mean into a formatted string for display
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Scores in descending order: ");

        // Append all scores to the string
        for (int i = 0; i < data.length; i++) {
            sb.append(data[i]).append(" ");
        }

        // Append calculated mean value
        sb.append("\nMean: ").append(mean);
        return sb.toString();
    }
}

