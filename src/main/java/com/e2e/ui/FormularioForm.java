package com.e2e.ui;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FormularioForm  extends PageObject {
	//STEP1
	public static By GUEST_CHECKUOT_BUTTON= By.xpath("//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[2]/label/input");
	public static By GUEST_CONTINUE_BUTTON= By.id("button-account");
	//STEP2
    public static By SELECT_COUNTRY= By.id("input-payment-country");
    public static By SELECT_CITY= By.xpath("//*[@id=\"input-payment-country\"]/option[69]");
  
    public static By SELECT_STATE= By.id("input-payment-zone");
    public static By SELECT_PICHINCHA= By.xpath("//*[@id=\"input-payment-zone\"]/option[20]");
    
  
    
    public static By FIRSTNAME_FIELD= By.id("input-payment-firstname");
    public static By LASTNAME_FIELD= By.id("input-payment-lastname");
    public static By EMAIL_FIELD= By.id("input-payment-email");
    public static By PHONE_FIELD= By.id("input-payment-telephone");
    public static By ADDRESS_FIELD= By.id("input-payment-address-1");
    public static By CITY_FIELD= By.id("input-payment-city");
    public static By POSTCODE_FIELD= By.id("input-payment-postcode");
	public static By SUBMIT_STEP2_BUTTON= By.id("button-guest");   
    //STEP4
	public static By SUBMIT_STEP4_BUTTON= By.id("button-shipping-method"); 
	//STEP5
	public static By SUBMIT_AGREE= By.name("agree"); 
	public static By SUBMIT_STEP5_BUTTON= By.id("button-payment-method"); 	

}
