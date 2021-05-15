package javaapplication260;

public class NormalBUrger {

    private String name;
    private String typeOfMeat;
    private String typeOfRollBread;
    private double price;

    public NormalBUrger(String name, String typeOfMeat, String typeOfRollBread, double price) {
        this.name = name;
        this.typeOfMeat = typeOfMeat;
        this.typeOfRollBread = typeOfRollBread;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTypeOfMeat(String typeOfMeat) {
        this.typeOfMeat = typeOfMeat;
    }

    public String getTypeOfMeat() {
        return typeOfMeat;
    }

    public void setTypeOfRollBread(String typeOfRollBread) {
        this.typeOfRollBread = typeOfRollBread;
    }

    public String getTypeOfRollBread() {
        return typeOfRollBread;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void addTommato() {
        price += 5;
        System.out.println("extra tommato (10 LE) ");
    }

    public void addCheese() {
        price += 10;
        System.out.println("extra cheese (5 LE)");
    }

    public void addDrink() {
        price += 15;
        System.out.println("Drink (15 LE) ");
    }

    public void addChips() {
        price += 20;
        System.out.println("Chips (20 LE) ");
    }

    @Override
    public String toString() {
        return "Burger{" + "name=" + name + ", typeOfMeat=" + typeOfMeat + ", typeOfRollBread=" + typeOfRollBread + ", price=" + price + '}';
    }
}
