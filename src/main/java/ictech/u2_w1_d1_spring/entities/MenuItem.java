package ictech.u2_w1_d1_spring.entities;


public abstract class MenuItem {
    protected int calories;
    protected double price;

    public MenuItem(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }
}
