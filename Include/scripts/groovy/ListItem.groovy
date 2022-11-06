
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



class ListItem {

	@Given("User register account")
	def userRegisterAccount() {
		println("\n I am inside userRegisterAccount")
		WebUI.openBrowser('')

		WebUI.closeBrowser()

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://alta-shop.vercel.app/')

		WebUI.click(findTestObject('Object Repository/4_listItem/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-sign-i_3d16a9'))

		WebUI.setText(findTestObject('Object Repository/4_listItem/Page_frontend-web/input_Email_input-1004'), 'muhamadshidan@gmail.com')

		WebUI.setText(findTestObject('Object Repository/4_listItem/Page_frontend-web/input_Password_input-1007'), 'bogor12345')

		WebUI.click(findTestObject('Object Repository/4_listItem/Page_frontend-web/button_Login'))
	}

	@When("user navigate to homepage")
	def userNavigateToHomepage() {
		println("\n I am inside userNavigateToHomepage")
		WebUI.verifyElementText(findTestObject('Object Repository/4_listItem/Page_frontend-web/div_Sony PS5  play has no limits  4  Rp 299_cdc032'),
				'Sony PS5 play has no limits  4 Rp 299DetailBeli')
	}

	@Then("user can see list item")
	def userCanSeeListItem() {
		println("\n I am inside userCanSeeListItem")
		WebUI.click(findTestObject('Object Repository/4_listItem/Page_frontend-web/h3_AltaShop'))

		WebUI.verifyElementText(findTestObject('Object Repository/4_listItem/Page_frontend-web/h3_AltaShop'), 'AltaShop')
	}
}