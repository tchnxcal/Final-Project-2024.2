import java.util.Scanner;

public class Average {
    private int[] data;
    private double mean;

    public Average() {
        data = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter score number " + (i + 1) + ": ");
            data[i] = scanner.nextInt();
        }

        selectionSort();
        calculateMean();
    }

    public void calculateMean() {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        mean = (double) total / data.length;
    }

    public void selectionSort() {
        for (int i = 0; i < data.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = data[i];
            data[i] = data[maxIndex];
            data[maxIndex] = temp;
        }
    }
}