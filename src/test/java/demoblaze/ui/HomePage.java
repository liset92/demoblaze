package demoblaze.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target SLIDER = Target.the("slider carousel").located(By.id("carouselExampleIndicators"));

    public static final Target SIGNUP_MENU = Target.the("Sign Up menu").located(By.id("signin2"));
    public static final Target USERNAME =  Target.the("username text").located(By.id("sign-username"));
    public static final Target PASSWORD =  Target.the("password text").located(By.id("sign-password"));
    public static final Target SIGNUP_BUTTON =  Target.the("signup button").locatedBy("#signInModal > div > div > div.modal-footer > button.btn.btn-primary");

    public static final Target LOGIN_MENU = Target.the("Log In menu").located(By.id("login2"));
    public static final Target USERNAME_LOGIN =  Target.the("username login text").located(By.id("loginusername"));
    public static final Target PASSWORD_LOGIN =  Target.the("password login text").located(By.id("loginpassword"));
    public static final Target LOGIN_BUTTON =  Target.the("login button").locatedBy("#logInModal > div > div > div.modal-footer > button.btn.btn-primary");

    public static final Target NAME_USER =  Target.the("name user text").locatedBy("#nameofuser");


}