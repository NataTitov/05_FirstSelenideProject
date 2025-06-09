package de.sconto.stepDefinitions;

import de.sconto.pages.HomePage;
import de.sconto.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class HomePageSteps {

    HomePage home;


    @Given("User is on HomePage")
    public void isOnHomePage() {
        System.err.close();
        home = open("https://www.sconto.de/", HomePage.class);
        getWebDriver().manage().window().maximize();
        home.acceptCookies();
    }

    @When("User clicks on Login icon")
    public void clicksOnLoginIcon() {
        home.clickLoginIcon();

    }

}


