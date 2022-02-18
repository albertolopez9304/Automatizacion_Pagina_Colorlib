package co.com.colorlib.stepdefinitions;

import co.com.colorlib.questions.CheckError;
import co.com.colorlib.questions.VerifyCamps;
import co.com.colorlib.tasks.FillOutForm;
import co.com.colorlib.tasks.Login;
import co.com.colorlib.tasks.OpenUp;
import co.com.colorlib.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ColorlibStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that a user enters the colorlib page to verify the completion of the validation block$")
    public void thatAUserEntersTheColorlibPageToVerifyTheCompletionOfTheValidationBlock() {
        OnStage.theActorCalled("Luis").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @When("^the user fills in the fields of the validation block form$")
    public void theUserFillsInTheFieldsOfTheValidationBlockForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.theMenu(), FillOutForm.withData()) ;
    }

    @Then("^verifies the success or failure of the response whit (.*)$")
    public void verifiesTheSuccessOrFailureOfTheResponse(String message) {
        OnStage.theActorInTheSpotlight().should(seeThat("El mensaje esperado es This field is required.", CheckError.ofTheCamps(), equalTo(message)));
    }

    @Then("^verifies the success or failure of the response whit$")
    public void verifiesTheSuccessOrFailureOfThe() {
        OnStage.theActorInTheSpotlight().should(seeThat(VerifyCamps.isEmpty(), equalTo(true)));
    }
}