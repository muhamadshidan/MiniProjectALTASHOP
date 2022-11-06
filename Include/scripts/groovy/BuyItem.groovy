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



class BuyItem {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User login account ")
	def userLoginAccount() {
		println("\n I am inside userLoginAccount")
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
		
		WebUI.click(findTestObject('Object Repository/7_BuyItem/i_AltaShop_v-icon notranslate fas fa-sign-i_3d16a9'))
		
		WebUI.setText(findTestObject('Object Repository/7_BuyItem/input_Email_input-1010'), 'muhamadshidan@gmail.com')
		
		WebUI.setText(findTestObject('Object Repository/7_BuyItem/input_Password_input-1013'), 'bogor12345')
		
		WebUI.click(findTestObject('Object Repository/7_BuyItem/button_Login'))
	}

	@When("User click buy button")
	def userClickBuyButton() {
		println("\n I am inside userClickBuyButton")
		WebUI.click(findTestObject('Object Repository/7_BuyItem/button_Beli'))
		
		WebUI.click(findTestObject('Object Repository/7_BuyItem/span_1'))
		
	}

	@Then("User navigate to buy page")
	def userNavigateToBuyPage() {
		println("\n I am inside userNavigateToBuyPage")
		WebUI.click(findTestObject('Object Repository/7_BuyItem/span_1'))
		
		WebUI.verifyElementText(findTestObject('Object Repository/7_BuyItem/div_Sony PS5Rp 299-1Total Qty1Total Bayar299 Bayar'),
			'Sony PS5Rp 299-1+Total Qty1Total Bayar299 Bayar')
		
		
	}
}