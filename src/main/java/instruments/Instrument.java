package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private InstrumentType type;
    private String material;
    private String colour;

    public Instrument(InstrumentType type, String material, String colour) {
        this.type = type;
        this.material = material;
        this.colour = colour;
    }

    public InstrumentType getType() {
        return this.type;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getColour() {
        return this.colour;
    }
}
