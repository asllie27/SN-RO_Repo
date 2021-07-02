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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.callTestCase(findTestCase('Login/RO Login/Login RO_TST'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00Menus/menu_Policy'))

WebUI.click(findTestObject('00Menus/subMenu_Policy Add New'))

WebUI.click(findTestObject('Auto Liability/01Policy Data Tabs/tab_Insured'))

WebUI.setText(findTestObject('Auto Liability/01Policy Data/01Insured/input_Insured Company Name'), Company_Name)

WebUI.setText(findTestObject('Auto Liability/01Policy Data/05Policy Period/txtbox_FEIN'), FEIN)

WebUI.setText(findTestObject('Auto Liability/01Policy Data/01Insured/input_Insured Address 1'), Address_1)

WebUI.click(findTestObject('Auto Liability/01Policy Data/01Insured/click_Insured City State and Zip Code'))

WebUI.setText(findTestObject('Auto Liability/01Policy Data/01Insured/input_Insured City State and Zip Code'), Zip_Code)

WebUI.sendKeys(findTestObject('Auto Liability/01Policy Data/01Insured/input_Insured City State and Zip Code'), Keys.chord(
        Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Auto Liability/01Policy Data/01Insured/input_Insured Business Phone'), GlobalVariable.WaitElem)

WebUI.setText(findTestObject('Auto Liability/01Policy Data/01Insured/input_Insured Business Phone'), Business_Phone)

WebUI.setText(findTestObject('Auto Liability/01Policy Data/01Insured/input_Insured Email'), Email)

WebUI.click(findTestObject('Auto Liability/01Policy Data Tabs/tab_Contact'))

WebUI.click(findTestObject('Auto Liability/01Policy Data/02Contact/button_Contact Add New Contact'))

WebUI.setText(findTestObject('Auto Liability/01Policy Data/02Contact/input_Contact First Name'), First_Name)

WebUI.setText(findTestObject('Auto Liability/01Policy Data/02Contact/input_Contact Last Name'), Last_Name)

WebUI.selectOptionByValue(findTestObject('Auto Liability/01Policy Data/02Contact/select_Contact Contact Type'), Contact_Type, 
    false)

WebUI.setText(findTestObject('Auto Liability/01Policy Data/02Contact/input_Contact Address 1'), Address_1)

WebUI.click(findTestObject('Auto Liability/01Policy Data/02Contact/click_Contact City State and Zip Code'))

WebUI.setText(findTestObject('Auto Liability/01Policy Data/02Contact/input_Contact City State and Zip Code'), Zip_Code)

WebUI.sendKeys(findTestObject('Auto Liability/01Policy Data/02Contact/input_Contact City State and Zip Code'), Keys.chord(
        Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Auto Liability/01Policy Data/02Contact/input_Contact Business Phone'), GlobalVariable.WaitElem)

WebUI.setText(findTestObject('Auto Liability/01Policy Data/02Contact/input_Contact Business Phone'), Business_Phone)

WebUI.setText(findTestObject('Auto Liability/01Policy Data/02Contact/input_Email_contactEmail'), Email)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Auto Liability/01Policy Data/02Contact/button_Contact Submit'))

WebUI.click(findTestObject('Auto Liability/01Policy Data Tabs/tab_Broker'))

WebUI.setText(findTestObject('Auto Liability/01Policy Data/03Broker/input_Broker Search box'), Broker)

WebUI.click(findTestObject('Auto Liability/01Policy Data/03Broker/click_Broker Search Result'))

WebUI.click(findTestObject('Auto Liability/01Policy Data Tabs/tab_Sub-Broker'))

WebUI.click(findTestObject('Auto Liability/01Policy Data Tabs/tab_Policy Period'))

WebUI.setText(findTestObject('Auto Liability/01Policy Data/05Policy Period/input_Policy Period Inception Date'), Inception_Date)

WebUI.sendKeys(findTestObject('Auto Liability/01Policy Data/05Policy Period/input_Policy Period Inception Date'), Keys.chord(
        Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, '2021'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/01Policy Data/05Policy Period/select_Policy Period State'), State, 
    false)

WebUI.selectOptionByValue(findTestObject('Auto Liability/01Policy Data/05Policy Period/select_Policy Period Business Type'), 
    Business_Type, false)

WebUI.selectOptionByValue(findTestObject('Auto Liability/01Policy Data/05Policy Period/select_Policy Period Credited Office'), 
    Credited_Office, false)

WebUI.click(findTestObject('Auto Liability/01Policy Data/05Policy Period/click_Policy Period Operating City State and Zip Code - For RO 2'))

WebUI.setText(findTestObject('Auto Liability/01Policy Data/05Policy Period/input_Policy Period Operating City State and Zip Code - For RO 2'), 
    Zip_Code)

WebUI.sendKeys(findTestObject('Auto Liability/01Policy Data/05Policy Period/input_Policy Period Operating City State and Zip Code - For RO 2'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Auto Liability/01Policy Data/05Policy Period/radio_Policy Period Camera NO'), 
    GlobalVariable.WaitElem)

WebUI.click(findTestObject('Auto Liability/01Policy Data/05Policy Period/radio_Policy Period Camera NO'))

WebUI.click(findTestObject('Auto Liability/01Policy Data Tabs/tab_Exclusions'))

WebUI.click(findTestObject('Auto Liability/01Policy Data/06Exclusions/button_Exclusions Save'))

WebUI.waitForElementPresent(findTestObject('Policy Number/text_Policy Number'), GlobalVariable.WaitElem)

String AL_PolicyNumber = WebUI.getText(findTestObject('Policy Number/text_Policy Number'))

CustomKeywords.'myKeyword.PolicyNumber_Happy_RO.getALPolicyNumber'(AL_PolicyNumber)

//Vehicle
WebUI.click(findTestObject('00Menus/menu_Vehicle'))

//Vehicle 1
WebUI.click(findTestObject('Auto Liability/03Vehicle/button_Vehicle Add New Vehicle'))

WebUI.setText(findTestObject('Auto Liability/03Vehicle/input_Vehicle VIN'), VIN)

WebUI.selectOptionByValue(findTestObject('Auto Liability/03Vehicle/select_Vehicle Year'), Year, false)

WebUI.setText(findTestObject('Auto Liability/03Vehicle/input_Vehicle Make'), Make)

WebUI.setText(findTestObject('Auto Liability/03Vehicle/input_Vehicle Model'), Model)

WebUI.setText(findTestObject('Auto Liability/03Vehicle/input_Vehicle Color'), Color)

WebUI.selectOptionByValue(findTestObject('Auto Liability/03Vehicle/select_VIN_States'), VIN_State, false)

WebUI.setText(findTestObject('Auto Liability/03Vehicle/input_Vehicle TIV'), TIV)

WebUI.waitForElementClickable(findTestObject('Auto Liability/03Vehicle/button_Vehicle Submit'), GlobalVariable.WaitElem)

WebUI.click(findTestObject('Auto Liability/03Vehicle/button_Vehicle Submit'))

//Premium and Limits
WebUI.click(findTestObject('00Menus/menu_Premium Limits'))

WebUI.waitForElementClickable(findTestObject('Auto Liability/06Premium and Limits/input_Premium Per Insured Unit'), 60)

WebUI.setText(findTestObject('Auto Liability/06Premium and Limits/input_Premium Per Insured Unit'), Premium_Per_Insured_Unit)

WebUI.waitForElementClickable(findTestObject('Auto Liability/06Premium and Limits/input_Premium Limits Deductibles Per Incident'), 
    60)


WebUI.click(findTestObject('Auto Liability/06Premium and Limits/button_Premium Limits Save'))

//Finance
WebUI.click(findTestObject('00Menus/menu_Finance'))

WebUI.click(findTestObject('00Menus/menu_Policy'))

WebUI.click(findTestObject('00Menus/subMenu_Issue Policy'))

WebUI.waitForElementPresent(findTestObject('Auto Liability/Pop-up screen/button_Auto Liability Issue Without Payment'), 
    GlobalVariable.WaitElem)

WebUI.click(findTestObject('Auto Liability/Pop-up screen/button_Auto Liability Issue Without Payment'))

WebUI.waitForElementPresent(findTestObject('Auto Liability/Pop-up screen/button_Auto Liability OK'), GlobalVariable.WaitElem)

WebUI.click(findTestObject('Auto Liability/Pop-up screen/button_Auto Liability OK'))
//END of AL

//START APD
WebUI.selectOptionByValue(findTestObject('00Menus/select_Transaction Auto Liability or Auto Physical Damage'), Transaction,
	false)

WebUI.click(findTestObject('00Menus/button_Change of Policy Line YES'))

WebUI.click(findTestObject('00Menus/menu_Policy'))

WebUI.click(findTestObject('00Menus/subMenu_Policy Add New'))

WebUI.setText(findTestObject('Auto Physical Damage/New Auto Physical Damage Policy/input_APD Related Liability Policy Number'),
	AL_PolicyNumber)

WebUI.setText(findTestObject('Auto Physical Damage/New Auto Physical Damage Policy/input_APD Inception Date'), APD_Inception_Date)

WebUI.sendKeys(findTestObject('Auto Physical Damage/New Auto Physical Damage Policy/input_APD Inception Date'), Keys.chord(
		Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, '2021'))

WebUI.click(findTestObject('Auto Physical Damage/New Auto Physical Damage Policy/button_APD Proceed'))

String APD_PolicyNumber = WebUI.getText(findTestObject('Policy Number/text_Policy Number'))

CustomKeywords.'myKeyword.PolicyNumber_Happy_RO.getAPDPolicyNumber'(APD_PolicyNumber)

WebUI.click(findTestObject('Auto Liability/01Policy Data Tabs/tab_Contact'))

WebUI.click(findTestObject('Auto Liability/01Policy Data Tabs/tab_Broker'))

WebUI.click(findTestObject('Auto Liability/01Policy Data Tabs/tab_Sub-Broker'))

WebUI.click(findTestObject('Auto Liability/01Policy Data Tabs/tab_Policy Period'))

WebUI.sendKeys(findTestObject('Auto Physical Damage/Policy Data/Policy Period/00_txt_Commission'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.setText(findTestObject('Auto Physical Damage/Policy Data/Policy Period/00_txt_Commission'), Period_Commission)

WebUI.setText(findTestObject('Auto Physical Damage/Policy Data/Policy Period/input_APD Policy Period Covered Autos'), Covered_Autos)

WebUI.setText(findTestObject('Auto Physical Damage/Policy Data/Policy Period/input_APD Policy Period Proposal Date'), Proposal_Date)

WebUI.sendKeys(findTestObject('Auto Physical Damage/Policy Data/Policy Period/input_APD Policy Period Proposal Date'), Keys.chord(
		Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, '2021'))

WebUI.click(findTestObject('Auto Physical Damage/Policy Data/Policy Period/button_APD Policy Period Update'))

WebUI.click(findTestObject('00Menus/menu_Premium Limits'))

WebUI.setText(findTestObject('Auto Physical Damage/Premium and LImits/input_APD Premium and Limits Percent of TIV'), TIV_Percentage)

WebUI.selectOptionByValue(findTestObject('Auto Physical Damage/Premium and LImits/select_APD Premium and Limits Installments'),
	APD_Installment, false)

WebUI.click(findTestObject('Auto Physical Damage/Premium and LImits/button_APD Premium and Limits Save'))

WebUI.click(findTestObject('00Menus/menu_Finance'))

WebUI.waitForElementPresent(findTestObject('00Menus/menu_Policy'), GlobalVariable.WaitElem)

WebUI.click(findTestObject('00Menus/menu_Policy'))

WebUI.click(findTestObject('00Menus/subMenu_Issue Policy'))

WebUI.waitForElementPresent(findTestObject('Auto Liability/Pop-up screen/button_Auto Liability Issue Without Payment'),
	GlobalVariable.WaitElem)

WebUI.click(findTestObject('Auto Liability/Pop-up screen/button_Auto Liability Issue Without Payment'))

WebUI.waitForElementPresent(findTestObject('Auto Liability/Pop-up screen/button_Auto Liability OK'), GlobalVariable.WaitElem)

WebUI.click(findTestObject('Auto Liability/Pop-up screen/button_Auto Liability OK'))
//END APD
