import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.Assert as Assert
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.callTestCase(findTestCase('Test Cases/Sydney/Login Test Case.au'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Sydney/Waiting/Page_Authenticating - SiteMinder/svg_Capture object_circular'), 
    GlobalVariable.waiting_timeouot)

WebUI.waitForElementVisible(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Properties/a_Salesforce'), 
    GlobalVariable.element_timeout)

WebUI.waitForElementClickable(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Properties/a_Salesforce'), 
    GlobalVariable.element_timeout)

WebUI.click(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Properties/a_Salesforce'))

WebUI.verifyElementText(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/span_Salesforce'), 
    'Salesforce')

/*Search base on Name*/

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Sydney/Waiting/Page_Authenticating - SiteMinder/svg_Capture object_circular'),
	GlobalVariable.waiting_timeouot)

WebUI.waitForElementVisible(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/button_Filters'), 
    GlobalVariable.element_timeout)

WebUI.waitForElementClickable(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/button_Filters'),
	GlobalVariable.element_timeout)

WebUI.click(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/button_Filters'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/h3_Filters'), 
    GlobalVariable.waiting_timeouot)

WebUI.verifyElementText(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/h3_Filters'), 
    'Filters')

WebUI.setText(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/input_Name_el-input__inner'), 
    '\'Love\' Hanmer Couples Retreat')

WebUI.click(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/button_Search'))

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Sydney/Waiting/Page_Authenticating - SiteMinder/svg_Capture object_circular'), 
    GlobalVariable.waiting_timeouot)

String str = CustomKeywords.'com.au.siteminder.tableminder.getElementOfTable'(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/div_Salesforce'), 
    '1', '1', '1')

Assert.assertEquals(str, '\'Love\' Hanmer Couples Retreat')

/*Search base on id*/
WebUI.waitForElementVisible(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/button_Filters'), 
    GlobalVariable.element_timeout)

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Sydney/Waiting/Page_Authenticating - SiteMinder/svg_Capture object_circular'), 
    GlobalVariable.waiting_timeouot)

WebUI.click(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/button_Filters'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/h3_Filters'), 
    GlobalVariable.waiting_timeouot)

WebUI.verifyElementText(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/h3_Filters'), 
    'Filters')

WebUI.click(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/button_Clear'))

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Sydney/Waiting/Page_Authenticating - SiteMinder/svg_Capture object_circular'), 
    GlobalVariable.waiting_timeouot)

WebUI.waitForElementVisible(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/input_Salesforce id_el-input__inner'), 
    GlobalVariable.waiting_timeouot)

WebUI.setText(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/input_Salesforce id_el-input__inner'), 
    '0010D000007MyRsQAK')

WebUI.waitForElementClickable(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/button_Search'), 
    GlobalVariable.waiting_timeouot)

WebUI.click(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/button_Search'))

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Sydney/Waiting/Page_Authenticating - SiteMinder/svg_Capture object_circular'), 
    GlobalVariable.waiting_timeouot)

String str2 = CustomKeywords.'com.au.siteminder.tableminder.getElementOfTable'(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/div_Salesforce'), 
    '1', '1', '1')

Assert.assertEquals(str2, '(Cairn Hotel Group) Angel Hotel')

/*Search base on Address*/
//for see Error in test case Uncomment this -->

/*WebUI.waitForElementVisible(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/button_Filters'), 
    GlobalVariable.element_timeout)

WebUI.click(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/button_Filters'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/h3_Filters'), 
    GlobalVariable.waiting_timeouot)

WebUI.verifyElementText(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/h3_Filters'), 
    'Filters')

WebUI.click(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/button_Clear'))

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Sydney/Waiting/Page_Authenticating - SiteMinder/svg_Capture object_circular'),
	GlobalVariable.waiting_timeouot)

WebUI.waitForElementVisible(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/input_Salesforce id_el-input__inner'),
	GlobalVariable.waiting_timeouot)

WebUI.setText(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/input_Address_el-input__inner'), 
    'Castle St,Cardiff,Wales,United Kingdom,GB,CF10 1QZ')

WebUI.waitForElementClickable(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/button_Search'),
	GlobalVariable.waiting_timeouot)

WebUI.click(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/button_Search'))

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Sydney/Waiting/Page_Authenticating - SiteMinder/svg_Capture object_circular'), 
    GlobalVariable.waiting_timeouot)

String str3 = CustomKeywords.'com.au.siteminder.tableminder.getElementOfTable'(findTestObject('Object Repository/Sydney/Page_Salesforce/Page_Filter/Page_Nexus Admin - Salesforce/div_Salesforce'), 
    '1', '1', '1')

Assert.assertEquals(str3, '(Cairn Hotel Group) Angel Hotel')*/

/*********************/
WebUI.closeBrowser()

