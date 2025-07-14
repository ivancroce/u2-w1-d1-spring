package ictech.u2_w1_d1_spring.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Drink extends MenuItem {
    private String name;

    public Drink(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }
}
