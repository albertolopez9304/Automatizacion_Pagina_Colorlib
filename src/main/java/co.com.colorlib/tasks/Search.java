package co.com.colorlib.tasks;

import co.com.colorlib.userinterface.SearchMenuPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Search implements Task {
    public static Search theMenu() { return Tasks.instrumented(Search.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchMenuPage.OPTION_FORMS),
                        Click.on(SearchMenuPage.OPTION_VALIDATIONS));

    }
}
