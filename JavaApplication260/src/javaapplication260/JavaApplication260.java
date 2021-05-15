package javaapplication260;

public class JavaApplication260 {

    public static void main(String[] args) {

        NormalBUrger b1 = new NormalBUrger("NormalBUrger", "Beef", "Brown", 20);
        System.out.println(b1);
        b1.addCheese();
        b1.addTommato();
        System.out.println("Total Price = " + b1.getPrice());
        System.out.println();

        HElthyBurger b2 = new HElthyBurger("Checken", 15);
        System.out.println(b2);
        b2.addWater();
        b2.addSpices();
        System.out.println("Total Price = " + b2.getPrice());
        System.out.println("Type Of Roll Bread : " + b2.getTypeOfRollBread());

        System.out.println();
        DEluxBurger b3 = new DEluxBurger();
        System.out.println(b3);
        b3.addChips();
        b3.addDrink();
        System.out.println("Total Price = " + b3.getPrice());
        System.out.println("Type of meat : " + b3.getTypeOfMeat());

    }
}
