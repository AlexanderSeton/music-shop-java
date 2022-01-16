import behaviours.ISell;
import instruments.Guitar;
import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    private MusicShop musicShop;
    private ShopItem shopItem;
    private ShopItem shopItem2;
    private Piano piano;
    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(InstrumentType.STRING, "wood", "black", 6);
        piano = new Piano(InstrumentType.KEYBOARD, "wood", "black", 88);
        shopItem = new ShopItem(piano, 2000, 3000);
        shopItem2 = new ShopItem(guitar, 10000, 50000);
        ArrayList<ISell> stock = new ArrayList<>(Arrays.asList(shopItem));
        musicShop = new MusicShop(stock);
    }

    @Test
    public void hasStock() {
        assertEquals(1, musicShop.getStock().size());
    }

    @Test
    public void canAddItemToStock() {
        musicShop.addItem(shopItem2);
        assertEquals(2, musicShop.getStock().size());
    }

    @Test
    public void canRemoveItemFromStock() {
        musicShop.removeItem(shopItem);
        assertEquals(0, musicShop.getStock().size());
    }

    @Test
    public void canCalculateTotalPotentialAverageMarkup() {
        musicShop.addItem(shopItem2);
        assertEquals(225, musicShop.totalPotentialAverageMarkup(), 0.0);
    }
}
