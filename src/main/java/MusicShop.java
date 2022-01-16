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

    public double totalPotentialAverageMarkup() {
        double sum = 0;
        ArrayList<Double> totalMarkups = new ArrayList<Double>();
        for (int i=0; i<this.stock.size(); i++) {
            double itemMarkup = this.stock.get(i).calculateMarkup();
            totalMarkups.add(itemMarkup);
            sum += itemMarkup;
        }
        double totalMarkup = sum / totalMarkups.size();
        return totalMarkup;
    }
}
