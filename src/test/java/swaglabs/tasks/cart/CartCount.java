package swaglabs.tasks.cart;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CartCount {

    public static Question<Integer> currentlyDisplayed(){
        return Text.of(".shopping_cart_badge").asInteger();
    }
}
