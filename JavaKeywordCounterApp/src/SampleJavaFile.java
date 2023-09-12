public class SampleJavaFile {

    private int count;
    private static final double VALUE = 3.14;

    public SampleJavaFile() {
        this.count = 0;
    }

    public void incrementCount() {
        if (count < 10) {
            count++;
        } else {
            System.out.println("Count exceeded");
        }
    }

    public void setCount(int count) {
        if (count > 0) {
            this.count = count;
        } else {
            throw new IllegalArgumentException("Count must be positive");
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        SampleJavaFile instance = new SampleJavaFile();
        instance.incrementCount();
        System.out.println("Count value: " + instance.getCount());
    }
}
