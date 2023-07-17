package com.e2e.tastks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.By;

import com.e2e.ui.CarritoForm;
import com.e2e.ui.FormularioForm;

public class DoCarritoOk  implements Task {
    public static Performable withActor(){
        return instrumented(DoCarritoOk.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
    	actor.attemptsTo(
                Click.on(CarritoForm.CHECKUOTCHECK_PAGE_BUTTON)
		);    	
    }
}
