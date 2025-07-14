package ictech.u2_w1_d1_spring;

import ictech.u2_w1_d1_spring.entities.Menu;
import ictech.u2_w1_d1_spring.entities.Pizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U2W1D1SpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(U2W1D1SpringApplication.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigClass.class);

        System.out.println();
        System.out.println("********** Pizzeria by Aldo Baglio **********");
        System.out.println();
        Menu menu = ctx.getBean("menu", Menu.class);

        System.out.println("********** MENU **********");
        System.out.println("----- Pizza -----");
        for (Pizza pizza : menu.getPizzas()) {
            System.out.println(pizza.getName() + " - Calories: " + pizza.getCalories() + " - Price: " + pizza.getPrice());
        }
        // to continue toppings and drinks
        ctx.close();
    }

}
