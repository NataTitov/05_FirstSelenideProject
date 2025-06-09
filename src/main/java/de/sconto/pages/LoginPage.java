package de.sconto.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    @FindBy(id = "loginEmail")
    WebElement emailInput;

    @FindBy(id = "loginPassword")
    WebElement passwordInput;

    public LoginPage enterData(String email, String password) {
        $(emailInput).val(email);
        $(passwordInput).val(password);
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
    public SelenideElement verifyName(String name) {
        return $(userNameTitle).shouldHave(text(name));
    }
}
