package demoblaze.stepdefinitions;

import demoblaze.tasks.OpenTheApplication;
import demoblaze.tasks.UserLogIn;
import demoblaze.tasks.UserSignUp;
import demoblaze.ui.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

public class UserSteps {

    @Given("que ingresamos a la url demoblaze")
    @Given("que contamos con una cuenta")
    @Given("que hicimos login")
    public void ingresamosALaUrlDemoblaze() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario").wasAbleTo(OpenTheApplication.open());
    }

    @When("se nos muestra la pantalla inicial")
    public void seNosMuestraLaPantallaInicial() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(HomePage.SLIDER).isDisplayed()
        );
    }

    @Then("hacemos clic en Sign UP para crear una cuenta con user: {string}, pass: {string}")
    public void hacemosClicEnParaCrearUnaCuenta(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(UserSignUp.signUp(username, password));
    }

    @Then("hacemos clic en Log in para ingresar con user: {string}, pass: {string}")
    public void hacemosClicEnParaIngresar(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(UserLogIn.logIn(username, password));
    }

    @Then("nos debe aparecer nuestro nombre de usuario {string} en la esquina superior derecha")
    public void nosDebeAparecerNuestroNombreDeUsuarioEnLaEsquinaSuperiorDerecha(String username) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(HomePage.NAME_USER).text().contains("Welcome " + username)
        );
    }
}
