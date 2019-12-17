package org.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {

    @Given("^I have \"([^\"]*)\" cukes in my belly cukes in my belly$")
    public void iHaveCukesInMyBellyCukesInMyBelly(int cukes) throws PendingException {
        Belly belly = new Belly();
        belly.eat(cukes);// Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I wait \"([^\"]*)\" hour$")
    public void iWaitHour(int hour) throws PendingException  {
        System.out.println("It takes us: " + hour + " hours to did something with the cukes in our belly");
        //throw new PendingException();
    }

    @Then("^my belly should growl$")
    public void myBellyShouldGrowl() throws PendingException  {
        System.out.println("Our belly returns Grrrrrr");
        //throw new PendingException();
    }

    @Then("^I have to visit \"([^\"]*)\" asap$")
    public void iHaveToVisitWCAsap(String where_to_go) throws PendingException  {
        if (where_to_go.equals("Kitchen")) {
            System.out.println("Our belly feels very bad after visit: " + where_to_go);
            FunnyPics.bad();
            System.out.println("=================================");
        } else {
            System.out.println("Our belly feels very much better after visit: " + where_to_go);
            FunnyPics.good();
            System.out.println("=================================");
        }
        //throw new PendingException();
    }
}