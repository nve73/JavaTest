package com.geekbrains.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalTomatoCard extends BaseView {
    public PersonalTomatoCard(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@class='btn full-width to-cart-btn']")
    private WebElement addInCartButton;

    public PersonalTomatoCard clickAddInCartButton() {
        addInCartButton.click();
        return this;
    }

}
