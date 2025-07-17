package de.sconto.pages;

import com.codeborne.selenide.Selenide;
import de.sconto.utils.PropertiesLoader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public static final String baseURL = PropertiesLoader.loadProperty("url");

    @FindBy(css = ".consentForm__acceptButton:nth-child(2)")
    WebElement acceptAll;

    public HomePage acceptCookies() {
        if ($(acceptAll).exists()) {
            $(acceptAll).click();
        }
        return Selenide.page(this);
    }

    @FindBy(css =".headerElement__icon--login")
    WebElement loginIcon;

    public LoginPage clickLoginIcon() {
        $(loginIcon).click();
        return Selenide.page(LoginPage.class);
    }

    @FindBy(css =".headerElement__status--login")
    WebElement statusLogin;

    public LoginPage clickOnStatusLogin() {
        $(statusLogin).click();
        return Selenide.page(LoginPage.class);
    }
}
