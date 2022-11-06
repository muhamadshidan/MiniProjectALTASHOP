import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class CartItem {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User Redirected to login account")
	for(def row=1; row<=findTestData(‘SystemLogin’).getRowNumbers();row++) {

		WebUI.openBrowser(’’)

		WebUI.navigateToUrl(‘https://alta-shop.vercel.app/’)

		WebUI.maximizeWindow()

		WebUI.click(findTestObject(‘Object Repository/Add Listing/ALtashop/a_Log In’))

		WebUI.setText(findTestObject(‘Object Repository/Add Listing/Altashop/input_email_address’), findTestData(‘SystemLogin’).getValue(

		"Email", row), FailureHandling.STOP\_ON\_FAILURE)
		WebUI.setText(findTestObject(‘Object Repository/Add Listing/Altashop/input_password’), findTestData(‘SystemLogin’).getValue(
		
			"Password", row), FailureHandling.STOP\_ON\_FAILURE)
		WebUI.click(findTestObject(‘Object Repository/Add Listing/AltaShop/input_button’))
		
		}
	}

	@When("User go to homepage")
	def userGoToHomepage() {
		println("\n I am inside userGoToHomepage")
	}

	@And("User click Cart button")
	def userClickCartButton() {
		println("\n I am inside userClickCartButton")
		WebUI.click(findTestObject('Object Repository/9_CartItem/i_AltaShop_v-icon notranslate fas fa-shoppi_c66ce9'))
		
	}

	@Then("User navigate to cart page")
	def userNavigateToCartPage() {
		println("\n I am inside userNavigateToCartPage")
		WebUI.verifyElementText(findTestObject('Object Repository/9_CartItem/button_0'), '0')
		
	}
}