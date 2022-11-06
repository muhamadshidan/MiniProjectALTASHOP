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

int x = findTestData('ADMIN/login').getRowNumbers()

for (i = 1; i <= x; i++) {
    WebUI.openBrowser('https://alta-shop.vercel.app//admin/')

    WebUI.maximizeWindow()

    WebUI.verifyElementPresent(findTestObject('Login/verify login page'), 0)

    WebUI.click(findTestObject('Login/username'))

    WebUI.setText(findTestObject('Login/username'), findTestData('ALogin').getValue(1, i))

    WebUI.click(findTestObject('Login/password'))

    WebUI.setText(findTestObject('Login/password'), findTestData('Login').getValue(2, i))

    WebUI.click(findTestObject('Login/eye'))

    WebUI.click(findTestObject('Login/btn login'))

    if ((i == 1) | (i == 2)) {
        WebUI.verifyElementText(findTestObject('Login/alert-message'), 'Username atau Password Salah')
    } else {
        WebUI.verifyTextPresent('Dashboard', true)
    }
    
    WebUI.closeBrowser()
}