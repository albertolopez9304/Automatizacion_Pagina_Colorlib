package co.com.colorlib.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ColorlibLoginPage extends PageObject {
    public static final Target INPUT_USER = Target.the("Username").located(By.xpath("//*[@id=\"login\"]/form/input[1]"));
    public static final Target INPUT_PASSWORD = Target.the("Password").located(By.xpath("//*[@id=\"login\"]/form/input[2]"));
    public static final Target BUTTON_SIGN_IN= Target.the("Sign in").located(By.xpath("//*[@id=\"login\"]/form/button"));
}
