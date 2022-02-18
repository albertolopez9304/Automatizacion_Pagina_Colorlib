package co.com.colorlib.tasks;

import co.com.colorlib.userinterface.FillOutFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillOutForm implements Task {
    public static FillOutForm withData() {
        return Tasks.instrumented(FillOutForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Hacer Prueba").into(FillOutFormPage.INPUT_REQUIRED),
                Enter.theValue("llopezc@choucairtesting.com").into(FillOutFormPage.INPUT_EMAIL),
                Enter.theValue("Choucair2022*").into(FillOutFormPage.INPUT_PASSWORD),
                Enter.theValue("Choucair2022*").into(FillOutFormPage.INPUT_CONFIRM_PASSWORD),
                Enter.theValue("05/05/1993").into(FillOutFormPage.INPUT_DATE),
                Enter.theValue("https://outlook.office.com/").into(FillOutFormPage.INPUT_URL),
                Enter.theValue("123456789").into(FillOutFormPage.INPUT_DIGITS),
                Enter.theValue("8").into(FillOutFormPage.INPUT_RANGE),
                Click.on(FillOutFormPage.INPUT_POLICY),
                Click.on(FillOutFormPage.BUTTON_VALIDATE)
        );

    }
}
