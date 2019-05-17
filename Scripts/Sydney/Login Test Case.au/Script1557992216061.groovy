import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementVisible(findTestObject('Sydney/Page_Log in/Page_Login - SiteMinder/img')
, GlobalVariable.element_timeout)

WebUI.setText(findTestObject('Sydney/Page_Log in/Page_Login - SiteMinder/input_E-mail address_email')
,GlobalVariable.username)

WebUI.click(findTestObject('Sydney/Page_Log in/Page_Login - SiteMinder/button_Next'))

WebUI.waitForElementVisible(findTestObject('Sydney/Page_Log in/Page_password - SiteMinder/input_Forgot password_password'), GlobalVariable.element_timeout)

WebUI.setText(findTestObject('Sydney/Page_Log in/Page_password - SiteMinder/input_Forgot password_password'), GlobalVariable.password)

WebUI.click(findTestObject('Sydney/Page_Log in/Page_password - SiteMinder/button_Log in'))

WebUI.waitForElementVisible(findTestObject('Sydney/Page_Log in/Page_password - SiteMinder/button_Log out'), GlobalVariable.element_timeout)


