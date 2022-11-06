import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://alta-shop.vercel.app/')

WebUI.click(findTestObject('Object Repository/8_RatingItem/i_AltaShop_v-icon notranslate fas fa-sign-i_3d16a9'))

WebUI.setText(findTestObject('Object Repository/8_RatingItem/input_Email_input-1010'), 'muhamadshidan@gmail.com')

WebUI.setText(findTestObject('Object Repository/8_RatingItem/input_Password_input-1013'), 'bogor12345')

WebUI.click(findTestObject('Object Repository/8_RatingItem/button_Login'))

WebUI.click(findTestObject('Object Repository/8_RatingItem/i_play has no limits_v-icon notranslate fas_c5a26b'))

WebUI.click(findTestObject('Object Repository/8_RatingItem/button_Detail'))

WebUI.verifyElementText(findTestObject('Object Repository/8_RatingItem/button_gaming_v-icon notranslate v-icon--li_4f0478'), 
    '')

