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

WebUI.openBrowser(GlobalVariable.G_URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Login/input_username'), 'standard_user')

WebUI.setText(findTestObject('Login/input_password'), 'secret_sauce')

WebUI.click(findTestObject('Login/btn_Login'))

WebUI.comment('Move to inventory page')

WebUI.verifyElementPresent(findTestObject('Checkout/btn_filter'), 0)

WebUI.click(findTestObject('Checkout/btn_Add to cart'))

WebUI.click(findTestObject('Checkout/btn_cart'))

WebUI.verifyElementPresent(findTestObject('Checkout/description'), 0)

WebUI.comment('Move to cart')

WebUI.click(findTestObject('Checkout/btn_Checkout'))

WebUI.verifyElementPresent(findTestObject('Checkout/information'), 0)

WebUI.setText(findTestObject('Checkout/input_firstName'), firstname)

WebUI.setText(findTestObject('Checkout/input_lastName'), lastname)

WebUI.setText(findTestObject('Checkout/input_postalCode'), zipcode)

WebUI.click(findTestObject('Checkout/btn_Continue'))

WebUI.click(findTestObject('Checkout/btn_Finish'))

