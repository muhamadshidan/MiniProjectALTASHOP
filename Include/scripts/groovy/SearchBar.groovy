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



class SearchBar {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User Login account")
	def userLogin() {
		println("\n I am inside userLogin")
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://alta-shop.vercel.app/')

	}

	@When("User click Search Bar")
	def userClickSearchBar() {
		println("\n I am inside userClickSearchBar")
		WebUI.navigateToUrl('https://alta-shop.vercel.app/')

		WebUI.click(findTestObject('Object Repository/5_SearchBar/Page_frontend-web/div_AltaShop_v-select__selections'))
	}


	@And("User click item name")
	def userClickItemName() {
		println("\n I am inside userClickItemName")
		WebUI.click(findTestObject('Object Repository/5_SearchBar/Page_frontend-web/div_gaming'))
	}

	@Then("User navigate to item page")
	def userNavigateToItemPage() {
		println("\n I am inside userNavigateToItemPage")
		WebUI.verifyElementText(findTestObject('Object Repository/5_SearchBar/Page_frontend-web/div_gaming Products is empty'),
			'gaming Products is empty!')
		
		WebUI.verifyElementText(findTestObject('Object Repository/5_SearchBar/Page_frontend-web/div_Products is empty'), 'Products is empty!')

	}
}