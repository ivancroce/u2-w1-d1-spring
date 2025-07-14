package ictech.u2_w1_d1_spring.entities;

import lombok.Getter;


import java.util.ArrayList;
import java.util.List;

@Getter
public class Pizza extends MenuItem {
    private String name;
    private List<Topping> toppings;

    // Constructor for pizza base (tomato and mozzarella)
    public Pizza() {
        super(1104, 4.99);
        this.name = "Pizza Margherita";
        this.toppings = new ArrayList<>();
    }

    public Pizza addTopping(Topping topping) {
        this.toppings.add(topping);
        this.setCa
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", toppings=" + toppings +
                "} " + super.toString();
    }
}
