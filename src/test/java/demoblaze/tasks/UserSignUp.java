package demoblaze.tasks;

import demoblaze.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class UserSignUp implements Task {
    private final String username;
    private final String password;

    public UserSignUp(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Performable signUp(String username, String password) {
        return Tasks.instrumented(UserSignUp.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.SIGNUP_MENU),
                Enter.theValue(username).into(HomePage.USERNAME),
                Enter.theValue(password).into(HomePage.PASSWORD),
                Click.on(HomePage.SIGNUP_BUTTON)
        );
    }
}