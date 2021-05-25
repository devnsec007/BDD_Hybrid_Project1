package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AjaxFormPage {

protected WebDriver driver;
	
	public AjaxFormPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//input[@id='btn-submit']")
	WebElement SubmitButton;
	
	@FindBy(xpath="//input[@id='title']")
	WebElement NameInputBox;
	
	@FindBy(xpath="//div[@class='form-group']//textarea")
	WebElement CommentInputBox;
	
	
	@FindBy(xpath="//div[@id='submit-control']")
	WebElement ConfirmSubmission;
	
	
	public boolean SubmitButtonExistanceCheck() {
		
		
		return SubmitButton.isDisplayed();
		
		
	}
	
	public void EnterDataintoInputBoxes(String Name,String comment) {
		
		NameInputBox.sendKeys(Name);
		CommentInputBox.sendKeys(comment);
		
	}
	
	public void ClickOnSubmitButton() {
		
		SubmitButton.click();
		
		
	}
	
	public boolean ConfirmSubmissionExist() {
		
		return ConfirmSubmission.isDisplayed();
		
	}
	
	
	
	
	
	
	
}
