package com.qa.stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.qa.base.TestBaseClass;
import com.qa.pages.AjaxFormPage;
import com.qa.pages.HomePage;
import com.qa.utilities.ExcelDataReaderForBDD;

import io.cucumber.java.en.*;

public class StepDefForAjaxFormSubmit extends TestBaseClass{

	
	WebDriver driver;
	
	public HomePage HMPGE;
	public AjaxFormPage AJAXFROMPGE;
	public ExcelDataReaderForBDD ExcelApp;
	
	@Given("User is on the Base Page")
	public void user_is_on_the_base_page() {
	   
		driver = initialization();
				
	}

	@When("User navigets to Ajax form submission")
	public void user_navigets_to_ajax_form_submission() {
	    
		
		HMPGE =new HomePage(driver);
		HMPGE.NavigateToAjaxFormSubmitPage();
		
	}

	@When("checks that the Ajax Form Submit with Loading icon heading is getting displayed")
	public void checks_that_the_ajax_form_submit_with_loading_icon_heading_is_getting_displayed() {
	   
		AJAXFROMPGE = new AjaxFormPage(driver);
		
		Assert.assertTrue(AJAXFROMPGE.SubmitButtonExistanceCheck());
		
	}

	@When("^User provides the (.*) and (.*) field values$")
	public void user_provides_the_name_and_comment_field_values(String Name,String Comment) {
	  
		AJAXFROMPGE.EnterDataintoInputBoxes(Name,Comment);
	}

	@When("Clicks on the Sumbit button")
	public void clicks_on_the_sumbit_button() {
		AJAXFROMPGE.ClickOnSubmitButton();
	}

	@Then("Form submited Successfully message should be visible")
	public void form_submited_successfully_message_should_be_visible() {
		AJAXFROMPGE.ConfirmSubmissionExist();
		driver.quit();		
	}
	
	@When("User provides the Form Data from Sheet {string} and RowNumber {int}")
	public void user_provides_the_form_data_from_sheet_and_row_number(String SheetName, Integer RowNo) {
	   
		ExcelApp = new ExcelDataReaderForBDD();
		
		String Name,Comment;
		Object[][] DataReturn = ExcelApp.ExcelDataReader(SheetName,RowNo);
		
		Name = DataReturn[0][0].toString();
		Comment=DataReturn[0][1].toString();
		
		AJAXFROMPGE.EnterDataintoInputBoxes(Name,Comment);
		
			
	}
	
	
}
