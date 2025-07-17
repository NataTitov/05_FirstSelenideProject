package de.sconto.stepDefinitions;

import com.codeborne.selenide.Selenide;
import de.sconto.pages.HomePage;
import de.sconto.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginSteps {

    private static final Logger log = LoggerFactory.getLogger(LoginSteps.class);
    LoginPage login;
    HomePage home;

    @And("User enters correct data")
    public void entersData() {
        login = Selenide.page(LoginPage.class);
        login.enterData();
    }

    @And("User clicks on Anmelden button")
    public void clicksOnAnmeldenButton() {
        login.clickOnAnmelden();
    }

    @And("User clicks on User status")
    public void clicksOnUserStatus() {
        home = Selenide.page(HomePage.class);
        home.clickOnStatusLogin();
    }

    @Then("User verifies his name")
    public void verifiesName() {
        login.verifyName();
    }
}
