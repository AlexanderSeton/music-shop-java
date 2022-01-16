import instruments.Guitar;
import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopItemTest {

    private ShopItem shopItem;
    private Piano piano;

    @Before
    public void before() {
        piano = new Piano(InstrumentType.KEYBOARD, "wood", "black", 88);
        shopItem = new ShopItem(piano, 2000, 3000);
    }

    @Test
    public void hasType() {
        assertEquals(piano, shopItem.getType());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(2000, shopItem.getBoughtPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(3000, shopItem.getSellingPrice(), 0.0);
    }

    @Test
    public void hasMarkup() {
        assertEquals(50.0, shopItem.calculateMarkup(), 0.0);
    }
}
