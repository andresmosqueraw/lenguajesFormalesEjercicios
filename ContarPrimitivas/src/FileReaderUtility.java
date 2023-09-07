import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtility {
    public static void processFile(String filename, LineProcessor processor) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                processor.process(line);
            }
        }
    }

    interface LineProcessor {
        void process(String line);
    }
}
