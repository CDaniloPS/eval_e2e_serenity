package com.e2e.tastks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.By;

import com.e2e.ui.CarritoForm;

public class DoCarrito  implements Task {
    public static Performable withActor(){
        return instrumented(DoCarrito.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
    	actor.attemptsTo(
                Click.on(CarritoForm.CHECKUOT_PAGE_BUTTON)
		);    	
    }
}
