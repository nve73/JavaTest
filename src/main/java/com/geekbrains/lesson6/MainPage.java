package com.geekbrains.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BaseView {
    @FindBy(xpath = "//a[contains(@href, 'catalog')]//span[.='Семена']")
    public WebElement semenaButton;

    @FindBy(xpath = "//a[@class='cookie-msg__button']")
    public WebElement cookieAgreeButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage clickCookieAgreeButton(){
        cookieAgreeButton.click();
        return this;
    }

    public CatalogSemenaPage clickSemenaButton(){
        semenaButton.click();
        return new CatalogSemenaPage(driver);
    }

    //    @Step("Клик на кнопку авторизации")
//    public void clickSemenaButton() {
//        semenaInButton.click();
//        //assertThat(driver.findElement(By.xpath("//span[@class='ajax_block_products_total']")), hasText("16$"));
//        //return new LoginPage(driver);
//    }
//
//    public MainPage(WebDriver driver) {
//        super(driver);
//    }
    }

