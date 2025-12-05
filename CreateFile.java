import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile{
    public static void main(String[] args) {
        try {
            // Create a File object
            File file = new File("example.txt");

            // Create the new file (if it doesn't already exist)
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write content into the file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is sample content written into the file.\n");
            writer.write("You can add multiple lines of text here.");
            writer.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}