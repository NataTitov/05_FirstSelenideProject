package de.sconto.stepDefinitions;

import de.sconto.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static de.sconto.pages.HomePage.baseURL;

public class HomePageSteps {

    HomePage home;


    @Given("User is on HomePage")
    public void isOnHomePage() {
        System.err.close();
        home = open(baseURL, HomePage.class);
        getWebDriver().manage().window().maximize();
        home.acceptCookies();
    }

    @When("User clicks on Login icon")
    public void clicksOnLoginIcon() {
        home.clickLoginIcon();

    }

}


