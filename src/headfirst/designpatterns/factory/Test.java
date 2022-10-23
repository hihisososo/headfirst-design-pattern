package headfirst.designpatterns.factory;

import headfirst.designpatterns.factory.pizzafm.ChicagoPizzaStore;
import headfirst.designpatterns.factory.pizzafm.NYPizzaStore;
import headfirst.designpatterns.factory.pizzafm.Pizza;
import headfirst.designpatterns.factory.pizzafm.PizzaStore;

public class Test {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza =nyStore.orderPizza("cheese");
        System.out.println("에단이 주문안 " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("조엘이 주문안 " + pizza.getName() + "\n");
    }
}
