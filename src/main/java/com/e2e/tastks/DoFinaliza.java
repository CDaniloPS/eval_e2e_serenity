package com.e2e.tastks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ensure.web.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.e2e.ui.FinalizaForm;

public class DoFinaliza implements Task {
    public static Performable withoptions(){
        return instrumented(DoFinaliza.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
    	String mensaje = "Your order has been placed!";
    	actor.attemptsTo(
                  Click.on(FinalizaForm.CONFIRM_BUTTON),
         			Ensure.that(FinalizaForm.CONFIRM_TEXT).text().isEqualTo("Your order has been placed!") 
        ); 	

    //	if(confirm.getText().equals("Your order has been placed!")) {
    //		System.out.println("Confirmacion Correcta: Your order has been placed! ");	
    //	}else {
    //		System.out.println(confirm.getText());	
    //	}
    }
    
}