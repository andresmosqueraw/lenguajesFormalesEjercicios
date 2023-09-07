import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrimitiveAnalyzer {
    private Map<String, Integer> primitivesCount = new HashMap<>();

    public PrimitiveAnalyzer() {
        primitivesCount.put("byte", 0);
        primitivesCount.put("short", 0);
        primitivesCount.put("int", 0);
        primitivesCount.put("long", 0);
        primitivesCount.put("float", 0);
        primitivesCount.put("double", 0);
        primitivesCount.put("char", 0);
        primitivesCount.put("boolean", 0);
    }

    public void analyzeLine(String line) {
        for (String primitive : primitivesCount.keySet()) {
            Pattern pattern = Pattern.compile("\\b" + primitive + "\\b");
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                primitivesCount.put(primitive, primitivesCount.get(primitive) + 1);
            }
        }
    }

    public void displayResults() {
        for (Map.Entry<String, Integer> entry : primitivesCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
