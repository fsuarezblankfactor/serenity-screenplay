package swaglabs.tasks.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    public static Performable toTheLoginPage() {
        return Task.where(
                Open.url("https://www.saucedemo.com/")
        );
    }

    public static Performable toTheCatalogPage() {
        return Task.where(
                Open.url("https://www.saucedemo.com/inventory.html")
        );

    }

    public static Performable toTheShoppingCart() {
        return Click.on(".shopping_cart_link");
    }
}
