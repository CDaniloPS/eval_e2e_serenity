package com.e2e.tastks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.ui.Select;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.e2e.ui.FormularioForm;

public class DoFormStep2 implements Task {
    
	public String firstname;
	public String lastname;
	public String email;
	public String phone;
	public String address;
	public String city;
	public String postalcode;
	public String country;
	public String countryvalue;
	public String state;
	public String statevalue;    

    public DoFormStep2() {

		this.firstname = "Guest";
		this.lastname = "Test Name";
		this.email = "Guest@g.com";
		this.phone = "0123456789";
		this.address = "GuestHouse";
		this.city = "Quito";
		this.postalcode = "74593E";
		this.country = "Ecuador";
		this.state = "Pichincha";
   
    }

    public static Performable withoptions(){
        return instrumented(DoFormStep2.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor)  {
        actor.attemptsTo(
                 Enter.theValue(firstname).into(FormularioForm.FIRSTNAME_FIELD),
                 Enter.theValue(lastname).into(FormularioForm.LASTNAME_FIELD),
                 Enter.theValue(email).into(FormularioForm.EMAIL_FIELD),
                 Enter.theValue(phone).into(FormularioForm.PHONE_FIELD),
                 Enter.theValue(address).into(FormularioForm.ADDRESS_FIELD),
                 Enter.theValue(city).into(FormularioForm.CITY_FIELD),
                 Enter.theValue(postalcode).into(FormularioForm.POSTCODE_FIELD),
            	//SelectFromOptions.byValue(country).from(FormularioForm.SELECT_COUNTRY),
            	//SelectFromOptions.byValue(country).from(FormularioForm.SELECT_COUNTRY),
            	 Click.on(FormularioForm.SELECT_COUNTRY),  
            	 Click.on(FormularioForm.SELECT_CITY) 
            	          		
        );

        actor.attemptsTo(              
        	 WaitUntil.the(FormularioForm.SELECT_PICHINCHA, WebElementStateMatchers.isVisible()),
           	 Click.on(FormularioForm.SELECT_STATE),  
           	 Click.on(FormularioForm.SELECT_PICHINCHA), 
           	//SelectFromOptions.byValue(state).from(FormularioForm.SELECT_STATE),

                Click.on(FormularioForm.SUBMIT_STEP2_BUTTON)           		
       );
    }
}