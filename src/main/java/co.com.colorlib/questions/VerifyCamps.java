package co.com.colorlib.questions;

import co.com.colorlib.userinterface.FillOutFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyCamps implements Question<Boolean> {

    public static VerifyCamps isEmpty() {
        return new VerifyCamps();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(FillOutFormPage.INPUT_REQUIRED).viewedBy(actor).asString().isEmpty();
    }
}
