package ictech.u2_w1_d1_spring.entities;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Topping extends MenuItem {
    private String name;

    public Topping(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }
}
