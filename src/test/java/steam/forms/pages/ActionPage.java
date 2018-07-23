package steam.forms.pages;

import org.openqa.selenium.By;
import framework.elements.Button;
import framework.BasePage;

public class ActionPage extends BasePage {

    private Button btnSpecials = new Button(By.xpath(String.format("//div[contains(@class,'specials_see_more')]//span[contains(text(), '%s')]", languageProperties.getProperty("moreSpecials"))));

    public ActionPage() {
        super(By.xpath(String.format("//h2[@class='pageheader'][contains(text(), '%s')]",languageProperties.getProperty("browsingAction"))),"Action Page");
    }

    public void getSpecials(){
        btnSpecials.click();
    }

}
