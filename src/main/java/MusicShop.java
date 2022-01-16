import behaviours.ISell;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ISell> stock;

    public MusicShop(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public void addItem(ISell item) {
        this.stock.add(item);
    }

    public void removeItem(ISell item) {
        this.stock.remove(item);
    }
}
