package co.com.colorlib.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchMenuPage {
    public static final Target OPTION_FORMS = Target.the("Para Dar Click en opcion Forms").located(By.xpath("//*[@id=\"menu\"]/li[6]/a/span[1]"));
    public static final Target OPTION_VALIDATIONS = Target.the("Para Dar Click en opcion Forms Validations").located(By.xpath("//*[@id=\"menu\"]/li[6]/ul/li[2]/a"));

}
