import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Por favor, especifica la ruta del archivo Java.");
            return;
        }

        String filePath = args[0];
        JavaFileParser parser = new JavaFileParser(filePath);

        try {
            Map<String, Integer> keywordCounts = parser.countJavaKeywords();
            keywordCounts.forEach((keyword, count) -> {
                System.out.println(keyword + ": " + count);
            });
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}