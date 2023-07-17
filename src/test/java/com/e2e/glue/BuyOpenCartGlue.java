package com.e2e.glue;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import com.e2e.tastks.*;
import com.e2e.ui.HomeForm;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

@Slf4j
public class BuyOpenCartGlue {

    @Managed
    WebDriver driver;

    private WebDriver navegador;

    private Actor guest  =Actor.named("Guest");
    private HomeForm homeForm = new HomeForm();
  //  @Before
  //  public void setupGuest() {
       // actor.can(BrowseTheWeb.with(driver));
  //  }
    
    @Given("que Guest ingresa a la home page")
    public void queGuestIngresaALaHomePage() {
        // Write code here that turns the phrase above into concrete actions
    	guest.can(BrowseTheWeb.with(navegador));
    	guest.wasAbleTo(Open.browserOn(homeForm));
    }
    
    @When("he agrega dos productos al carrito")
    public void heAgregaDosProductosAlCarrito() throws InterruptedException {
     //  	Thread.sleep(1000);
    	guest.attemptsTo(
                DoCompra.withActor()
        );

    }
    @And("he visualiza carrito")
    public void heVisualizaCarrito(){
    	guest.attemptsTo(
                DoCarrito.withActor()
        );
    	guest.attemptsTo(
                DoCarritoOk.withActor()
        );
    }

    @Then("he llena el Checkout como invitado Guest")
    public void heLlenaElCheckoutComoInvitadoGuest() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    	Thread.sleep(1000);
    	guest.attemptsTo(
                DoFormStep1.withActor(),
                DoFormStep2.withoptions(),
                DoFormStep4.withActor(),
                DoFormStep5.withActor()
        );
    }
    @And("he finaliza la compra")
    public void heFinalizaLaCompra() {
    	guest.attemptsTo(
                DoFinaliza.withoptions()
        );
    }

}
