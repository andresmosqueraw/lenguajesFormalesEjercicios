public class SampleJavaFile {

    private byte sampleByte;
    private short sampleShort;
    private int sampleInt;
    private long sampleLong;
    private float sampleFloat;
    private double sampleDouble;
    private char sampleChar;
    private boolean sampleBoolean;

    public SampleJavaFile(byte sampleByte, short sampleShort, int sampleInt,
                          long sampleLong, float sampleFloat, double sampleDouble,
                          char sampleChar, boolean sampleBoolean) {
        this.sampleByte = sampleByte;
        this.sampleShort = sampleShort;
        this.sampleInt = sampleInt;
        this.sampleLong = sampleLong;
        this.sampleFloat = sampleFloat;
        this.sampleDouble = sampleDouble;
        this.sampleChar = sampleChar;
        this.sampleBoolean = sampleBoolean;
    }

    public void displayInfo() {
        System.out.println("Byte: " + sampleByte);
        System.out.println("Short: " + sampleShort);
        System.out.println("Int: " + sampleInt);
        System.out.println("Long: " + sampleLong);
        System.out.println("Float: " + sampleFloat);
        System.out.println("Double: " + sampleDouble);
        System.out.println("Char: " + sampleChar);
        System.out.println("Boolean: " + sampleBoolean);
    }

    public static void main(String[] args) {
        SampleJavaFile sample = new SampleJavaFile((byte) 10, (short) 20, 30,
                40L, 50.0f, 60.0, 'A', true);
        sample.displayInfo();
    }
}
