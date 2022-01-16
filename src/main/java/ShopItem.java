import behaviours.ISell;
import instruments.Instrument;

public class ShopItem implements ISell {

    private Instrument type;
    private double boughtPrice;
    private double sellingPrice;

    public ShopItem(Instrument type, double boughtPrice, double sellingPrice) {
        this.type = type;
        this.boughtPrice = boughtPrice;
        this.sellingPrice = sellingPrice;
    }

    public Instrument getType() {
        return this.type;
    }

    public double getBoughtPrice() {
        return this.boughtPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public double calculateMarkup() {
        double profit = this.sellingPrice - this.boughtPrice;
        double markup = (profit / this.sellingPrice) * 100;
        return markup;
    }
}
