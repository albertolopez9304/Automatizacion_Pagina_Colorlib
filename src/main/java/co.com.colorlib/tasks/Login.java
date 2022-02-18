package co.com.colorlib.tasks;

import co.com.colorlib.userinterface.ColorlibLoginPage;
import co.com.colorlib.userinterface.ColorlibPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {
    public static Login onThePage() { return Tasks.instrumented(Login.class); }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("demo").into(ColorlibLoginPage.INPUT_USER),
                Enter.theValue("demo").into(ColorlibLoginPage.INPUT_PASSWORD),
                Click.on(ColorlibLoginPage.BUTTON_SIGN_IN),
                Check.whether(WebElementQuestion.the(ColorlibLoginPage.BUTTON_SIGN_IN), isVisible()).andIfSo(Click.on(ColorlibLoginPage.BUTTON_SIGN_IN)).otherwise()
                );

    }
}
