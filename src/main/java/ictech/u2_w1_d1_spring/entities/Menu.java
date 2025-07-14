package ictech.u2_w1_d1_spring.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Menu {
    private List<Pizza> pizzas;
    private List<Drink> drinks;
    private List<Topping> toppings;
}
