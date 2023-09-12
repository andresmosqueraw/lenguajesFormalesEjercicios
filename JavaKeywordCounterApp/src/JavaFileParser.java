import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JavaFileParser {
    private final String filePath;

    public JavaFileParser(String filePath) {
        this.filePath = filePath;
    }

    public Map<String, Integer> countJavaKeywords() throws IOException {
        Map<String, Integer> keywordCounts = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");  // Divide la línea en palabras basándose en caracteres no alfanuméricos
                for (String word : words) {
                    if (JavaKeywords.isKeyword(word)) {
                        keywordCounts.put(word, keywordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
        }
        return keywordCounts;
    }
}
