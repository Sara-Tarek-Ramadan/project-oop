package javaapplication260;

public class HElthyBurger extends NormalBUrger {

    public HElthyBurger(String typeOfMeat, double price) {
        super("HElthyBurger", typeOfMeat, "brown", price);
    }

    public void addSpices() {
        super.setPrice(getPrice() + 4);
        System.out.println("extra Spices  (4 LE )");
    }

    public void addWater() {
        super.setPrice(getPrice() + 6);
        System.out.println("extra Watrer  (6 LE) ");
    }
}
