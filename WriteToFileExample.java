import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class WriteToFileExample {

    public static void main(String[] args) {
        String fileName = "output.txt";
        String contentToWrite = "This is a line of text that will be written to the file.\nAnother line follows.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(contentToWrite);
            System.out.println("Successfully wrote to the file: " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}