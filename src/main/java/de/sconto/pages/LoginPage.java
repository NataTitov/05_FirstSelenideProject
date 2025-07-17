package de.sconto.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import de.sconto.utils.PropertiesLoader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public static final String validEmail = PropertiesLoader.loadProperty("valid.email");
    public static final String validPassword = PropertiesLoader.loadProperty("valid.password");
    public static final String userName = PropertiesLoader.loadProperty("user.name");


    @FindBy(id = "loginEmail")
    WebElement emailInput;

    @FindBy(id = "loginPassword")
    WebElement passwordInput;

    public LoginPage enterData() {
        $(emailInput).val(validEmail);
        $(passwordInput).val(validPassword);
        return Selenide.page(this);
    }

    @FindBy(id = "login-submit")
    WebElement anmelden;

    public HomePage clickOnAnmelden() {
        $(anmelden).click();
        return Selenide.page(HomePage.class);
    }

    @FindBy(css = ".titleHeadline")
    WebElement userNameTitle;

    public SelenideElement verifyName() {
        return $(userNameTitle).shouldHave(text(userName));
    }
}
