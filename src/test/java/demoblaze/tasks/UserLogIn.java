package demoblaze.tasks;

import demoblaze.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class UserLogIn implements Task {
    private final String username;
    private final String password;

    public UserLogIn(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Performable logIn(String username, String password) {
        return Tasks.instrumented(UserLogIn.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.LOGIN_MENU),
                Enter.theValue(username).into(HomePage.USERNAME_LOGIN),
                Enter.theValue(password).into(HomePage.PASSWORD_LOGIN),
                Click.on(HomePage.LOGIN_BUTTON)
        );
    }
}