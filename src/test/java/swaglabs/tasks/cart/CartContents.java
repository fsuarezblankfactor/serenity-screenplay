package swaglabs.tasks.cart;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Collection;

public class CartContents {
    public static Question<Collection<String>> currentDisplayed() {
        return Text.ofEach(".inventory_item_name");
    }

}
