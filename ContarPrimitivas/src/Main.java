import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main <path-to-java-file>");
            return;
        }

        PrimitiveAnalyzer analyzer = new PrimitiveAnalyzer();

        try {
            FileReaderUtility.processFile(args[0], analyzer::analyzeLine);
            analyzer.displayResults();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}