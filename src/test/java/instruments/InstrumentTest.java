package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    private Guitar guitar;
    private Piano piano;

    @Before
    public void before() {
        guitar = new Guitar(InstrumentType.STRING, "wood", "black", 6);
        piano = new Piano(InstrumentType.KEYBOARD, "wood", "black", 88);
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.STRING, guitar.getType());
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", guitar.getMaterial());
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("black", guitar.getColour());
        assertEquals("black", piano.getColour());
    }

    @Test
    public void guitarHasNumberStrings() {
        assertEquals(6, guitar.getNumberStrings());
    }

    @Test
    public void pianoHasNumberKeys() {
        assertEquals(88, piano.getNumberKeys());
    }
}
