package instruments;

public class Guitar extends Instrument{

    private int numberStrings;

    public Guitar(InstrumentType type, String material, String colour, int numberStrings) {
        super(type, material, colour);
        this.numberStrings = numberStrings;
    }

    public int getNumberStrings() {
        return this.numberStrings;
    }

    public String play() {
        return "Strum";
    }
}
