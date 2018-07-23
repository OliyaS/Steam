package steam.forms.pages;

import framework.BasePage;
import framework.elements.Button;
import framework.elements.Combobox;
import org.openqa.selenium.By;

public class AgeInputPage extends BasePage {
    private Combobox cmbAgeYear=new Combobox(By.xpath("//select[@id='ageYear']//option[@value='2000']"));
    private Button btnEnter=new Button(By.xpath(String.format("//span[contains(text(),'%s')]",languageProperties.getProperty("enter"))));

    public AgeInputPage() {
        super( By.xpath("//form[@id='agecheck_form']"),"Age Input Page");
    }

    public GamePage fillAgeForm(){
        cmbAgeYear.click();
        btnEnter.click();
        return new GamePage();
    }

}
