package instruments;

public class Piano extends Instrument{

    private int numberKeys;

    public Piano(InstrumentType type, String material, String colour, int numberKeys) {
        super(type, material, colour);
        this.numberKeys = numberKeys;
    }

    public int getNumberKeys() {
        return this.numberKeys;
    }

    public String play() {
        return "Piano noise";
    }
}
