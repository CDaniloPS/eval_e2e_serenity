package com.e2e.ui;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoForm extends PageObject {
	public static By CHECKUOT_PAGE_BUTTON= By.xpath("//nav/div/div[2]/ul/li[4]/a/i");
	public static By CHECKUOTCHECK_PAGE_BUTTON= By.xpath("//nav/div/div[2]/ul/li[5]/a/i");
}
