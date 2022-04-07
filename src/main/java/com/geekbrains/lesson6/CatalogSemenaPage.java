package com.geekbrains.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogSemenaPage extends BaseView {

    public CatalogSemenaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='panel-title']//a[.='Овощи']")
    private WebElement ovochiText;

    public OvochiBlock clickOvochiText() {
        ovochiText.click();
        return new OvochiBlock(driver);
    }
}
