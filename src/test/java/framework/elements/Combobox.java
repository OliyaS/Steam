package framework.elements;

import org.openqa.selenium.By;


public class Combobox extends BaseElement {

    private String type;

    public Combobox(By locator) {
        super(locator);
        type="combobox";
    }

    public String getType(){
        return this.type;
    }

}
