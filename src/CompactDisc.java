import java.util.Scanner;
import java.io.*;

/**
 This program creates a list of songs for a CD
 by reading from a file.
 */
public class CompactDisc {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("C:/Users/dreya/ideaProjects/FinalProject2024.2/src/Classics.txt"));
        String title;
        String artist;

        // ADD LINES FOR TASK #3 HERE
        // Declare an array of Song objects, called cd, with a size of 6
        Song[] cd = new Song[6];

        for (int i = 0; i < cd.length; i++) {
            title = input.nextLine();
            artist = input.nextLine();

            // ADD LINES FOR TASK #3 HERE
            // Fill the array by creating a new song with
            // the title and artist and storing it in the
            // appropriate position in the array
            cd[i] = new Song(title, artist);
        }

        System.out.println("Contents of Classics:");
        for (int i = 0; i < cd.length; i++) {
            // ADD LINES FOR TASK #3 HERE
            // Print the contents of the array to the console
            System.out.print(cd[i]);
        }
    }
}

