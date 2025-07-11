import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample {

    public static void main(String[] args) {
        String fileName = "output2.txt";
        String contentToWrite = "12213343324 2344234234 12334123.\nAnother line follows.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(contentToWrite);
            writer.write("\nCSE\nEEE\n");
              writer.write("\nHi, I am from Ashrai Engineering College\n");
            System.out.println("Successfully wrote to the file: " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
