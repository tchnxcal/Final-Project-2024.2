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

