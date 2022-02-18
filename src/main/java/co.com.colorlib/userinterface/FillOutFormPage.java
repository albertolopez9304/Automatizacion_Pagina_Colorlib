package co.com.colorlib.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillOutFormPage {
    public static final Target INPUT_REQUIRED = Target.the("Que se requiere").located(By.id("required2"));
    public static final Target INPUT_EMAIL = Target.the("Email").located(By.id("email2"));
    public static final Target INPUT_PASSWORD = Target.the("Password").located(By.id("password2"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Confirmar Password").located(By.id("confirm_password2"));
    public static final Target INPUT_DATE = Target.the("Ingresar Fecha").located(By.id("date2"));
    public static final Target INPUT_URL = Target.the("Ingresar Url").located(By.id("url2"));
    public static final Target INPUT_DIGITS = Target.the("Ingresar Digitos").located(By.id("digits"));
    public static final Target INPUT_RANGE = Target.the("Colocar Rangos entre 6 y 16").located(By.id("range"));
    public static final Target INPUT_POLICY = Target.the("Aceptar Politica").located(By.id("agree2"));
    public static final Target BUTTON_VALIDATE = Target.the("Click boton Validate").located(By.xpath("//*[@id=\"block-validate\"]/div[10]/input"));
    public static final Target ERROR_VALIDATE_RANGE = Target.the("Click boton Validate").located(By.xpath("//*[@id=\"range-error\"]"));
}
