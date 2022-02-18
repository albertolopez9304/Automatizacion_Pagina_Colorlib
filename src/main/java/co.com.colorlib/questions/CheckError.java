package co.com.colorlib.questions;

import co.com.colorlib.userinterface.FillOutFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CheckError implements Question<String> {

    public static CheckError ofTheCamps() {
        return new CheckError();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(FillOutFormPage.ERROR_VALIDATE_RANGE).viewedBy(actor).asString();
    }
}
