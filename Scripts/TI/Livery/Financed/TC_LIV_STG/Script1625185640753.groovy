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

WebUI.callTestCase(findTestCase('Login/OSN Login/Login Livery STG'), [:], FailureHandling.STOP_ON_FAILURE)

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

WebUI.click(findTestObject('Auto Liability/01Policy Data/05Policy Period/click_Policy Period Operating City State and Zip Code'))

WebUI.setText(findTestObject('Auto Liability/01Policy Data/05Policy Period/input_Policy Period Operating City State and Zip Code'), 
    Zip_Code)

WebUI.sendKeys(findTestObject('Auto Liability/01Policy Data/05Policy Period/input_Policy Period Operating City State and Zip Code'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Auto Liability/01Policy Data/05Policy Period/radio_Policy Period Camera NO'), 
    GlobalVariable.WaitElem)

WebUI.click(findTestObject('Auto Liability/01Policy Data/05Policy Period/radio_Policy Period Camera NO'))

WebUI.click(findTestObject('Auto Liability/01Policy Data Tabs/tab_Exclusions'))

WebUI.click(findTestObject('Auto Liability/01Policy Data/06Exclusions/button_Exclusions Save'))

WebUI.waitForElementPresent(findTestObject('Policy Number/text_Policy Number'), GlobalVariable.WaitElem)

String AL_PolicyNumber = WebUI.getText(findTestObject('Policy Number/text_Policy Number'))

CustomKeywords.'myKeyword.PolicyNumber_Happy_LIV.getALPolicyNumber'(AL_PolicyNumber)

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

WebUI.click(findTestObject('Auto Liability/06Premium and Limits/Financed/radioBtn_Financed'))

WebUI.waitForElementClickable(findTestObject('Auto Liability/06Premium and Limits/input_Premium Limits Deductibles Per Incident'), 
    60)

//Deductibles
WebUI.setText(findTestObject('Auto Liability/06Premium and Limits/input_Premium Limits Deductibles Per Incident'), Deductibles_Per_Incident)

WebUI.setText(findTestObject('Auto Liability/06Premium and Limits/input_Premium Limits Deductibles Aggregate'), Deductibles_Aggregate)

WebUI.setText(findTestObject('Auto Liability/06Premium and Limits/input_Premium Limits Deductibles SIR Per Accident'), Deductibles_SIR_Per_Accident)

WebUI.setText(findTestObject('Auto Liability/06Premium and Limits/input_Premium Limits PolLim CSL'), PolLimits_Combined_Single_Limit)

WebUI.setText(findTestObject('Auto Liability/06Premium and Limits/input_Premium Limits PolLim Per Person'), PolLimits_Per_Person)

WebUI.setText(findTestObject('Auto Liability/06Premium and Limits/input_Premium Limits PolLim Per Accident'), PolLimits_Per_Accident)

WebUI.setText(findTestObject('Auto Liability/06Premium and Limits/input_Premium Limits PolLim Property Damage'), PolLimits_Property_Damage)

WebUI.setText(findTestObject('Auto Liability/06Premium and Limits/input_Premium Limits UnInsMot CSL'), UnInsMotorists_Combined_Single_Limit)

WebUI.setText(findTestObject('Auto Liability/06Premium and Limits/input_Premium Limits UnInsMot Per Person'), UnInsMotorists_Per_Person)

WebUI.setText(findTestObject('Auto Liability/06Premium and Limits/input_Premium Limits UnInsMot Per Accident'), UnInsMotorists_Per_Accident)

WebUI.setText(findTestObject('Auto Liability/06Premium and Limits/input_Premium Limits UnIns Property Damage'), UnInsMotorists_Property_Damage)

WebUI.setText(findTestObject('Auto Liability/06Premium and Limits/input_Premium Limits UnDerInsMot CSL'), UnDerInsMotorists_Combined_Single_Limit)

WebUI.setText(findTestObject('Auto Liability/06Premium and Limits/input_Premium Limits UnDerInsMot Per Person'), UnDerInsMotoristsMotorists_Per_Person)

WebUI.setText(findTestObject('Auto Liability/06Premium and Limits/input_Premium Limits UnDerInsMot Per Accident'), UnDerInsMotoristsMotorists_Per_Accident)

WebUI.setText(findTestObject('Auto Liability/06Premium and Limits/input_Premium Limits UnDerInsMot Property Damage'), UnDerInsMotoristsMotorists_Property_Damage)

WebUI.setText(findTestObject('Auto Liability/06Premium and Limits/input_Premium Limits PIP Per Person'), Pip_Per_Person)

//END of Deductibles
WebUI.click(findTestObject('Auto Liability/06Premium and Limits/button_Premium Limits Save'))

//Finance
WebUI.click(findTestObject('00Menus/menu_Finance'))

//Non-Premium
WebUI.click(findTestObject('Auto Liability/07Finance/Finance Tabs/tab_Non-Premium'))

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Add Non-Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/02Non Premium/select_Non-Premium Type'), '0', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), Administrative_Fee)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Add Non-Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/02Non Premium/select_Non-Premium Type'), '1', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), Broker_Fee)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Add Non-Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/02Non Premium/select_Non-Premium Type'), '4', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), Inspection_Fee)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

/*
WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Add Non-Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/02Non Premium/select_Non-Premium Type'), '5', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), Installment_Charge)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Add Non-Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/02Non Premium/select_Non-Premium Type'), '6', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), Installment_Fee)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))
*/
WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Add Non-Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/02Non Premium/select_Non-Premium Type'), '7', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), NEMT_Inspection_Fee)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Add Non-Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/02Non Premium/select_Non-Premium Type'), '9', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), Reinstatement_Fee)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Add Non-Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/02Non Premium/select_Non-Premium Type'), '10', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), Risk_Management_Fee)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Add Non-Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/02Non Premium/select_Non-Premium Type'), '11', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), Service_Fee)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/btn_nonPremiumVoid_item1'))

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/btn_VoidYes'))

//END Non-Premium
//START Additional Premium
WebUI.click(findTestObject('Auto Liability/07Finance/Finance Tabs/tab_Additional Premium'))

WebUI.click(findTestObject('Auto Liability/07Finance/03Additional Premium/button_Add Additional Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/03Additional Premium/select_Additional Premium Amount Type'), 
    '0', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), Additional_Insured_Charge)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/03Additional Premium/button_Add Additional Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/03Additional Premium/select_Additional Premium Amount Type'), 
    '1', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), Adjustment)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/03Additional Premium/button_Add Additional Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/03Additional Premium/select_Additional Premium Amount Type'), 
    '3', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), Driver_Premium)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/03Additional Premium/button_Add Additional Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/03Additional Premium/select_Additional Premium Amount Type'), 
    '5', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), Mileage_Premium)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/03Additional Premium/button_Add Additional Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/03Additional Premium/select_Additional Premium Amount Type'), 
    '6', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), Minimum_Premium)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/03Additional Premium/button_Add Additional Premium'))

//PNC
WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/03Additional Premium/select_Additional Premium Amount Type'), 
    '9', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), Primary_NonContributory)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/03Additional Premium/button_Add Additional Premium'))

//Waiver
WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/03Additional Premium/select_Additional Premium Amount Type'), 
    '12', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), Waiver_OfSubrogation)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/03Additional Premium/btn_AddPremiumVoid_item3'))

WebUI.click(findTestObject('Auto Liability/07Finance/03Additional Premium/btn_VoidYes'))

//END Additional Premium
WebUI.click(findTestObject('00Menus/menu_Policy'))

WebUI.click(findTestObject('00Menus/subMenu_Issue Policy'))

//WebUI.waitForElementPresent(findTestObject('Auto Liability/Pop-up screen/button_Auto Liability Issue Without Payment'), GlobalVariable.WaitElem)
//WebUI.click(findTestObject('Auto Liability/Pop-up screen/button_Auto Liability Issue Without Payment'))
WebUI.waitForElementPresent(findTestObject('Auto Liability/Pop-up screen/button_Auto Liability OK'), GlobalVariable.WaitElem)

WebUI.click(findTestObject('Auto Liability/Pop-up screen/button_Auto Liability OK'))

//End AL Creation
//APD Creation
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

CustomKeywords.'myKeyword.PolicyNumber_Happy_LIV.getAPDPolicyNumber'(APD_PolicyNumber)

WebUI.click(findTestObject('Auto Liability/01Policy Data Tabs/tab_Contact'))

WebUI.click(findTestObject('Auto Liability/01Policy Data Tabs/tab_Broker'))

WebUI.click(findTestObject('Auto Liability/01Policy Data Tabs/tab_Sub-Broker'))

WebUI.click(findTestObject('Auto Liability/01Policy Data Tabs/tab_Policy Period'))

WebUI.waitForElementClickable(findTestObject('Auto Physical Damage/Policy Data/Policy Period/input_APD Policy Period Commission'), 
    GlobalVariable.WaitElem)

WebUI.sendKeys(findTestObject('Auto Physical Damage/Policy Data/Policy Period/00_txt_Commission'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.setText(findTestObject('Auto Physical Damage/Policy Data/Policy Period/00_txt_Commission'), Period_Commission)

WebUI.setText(findTestObject('Auto Physical Damage/Policy Data/Policy Period/input_APD Policy Period Covered Autos'), Covered_Autos)

WebUI.setText(findTestObject('Auto Physical Damage/Policy Data/Policy Period/input_APD Policy Period Proposal Date'), Proposal_Date)

WebUI.sendKeys(findTestObject('Auto Physical Damage/Policy Data/Policy Period/input_APD Policy Period Proposal Date'), Keys.chord(
        Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, '2021'))

WebUI.click(findTestObject('Auto Physical Damage/Policy Data/Policy Period/button_APD Policy Period Update'))

WebUI.click(findTestObject('00Menus/menu_Premium Limits'))

WebUI.setText(findTestObject('Auto Physical Damage/Premium and LImits/input_APD Premium and Limits Percent of TIV'), TIV_Percentage)

WebUI.click(findTestObject('Auto Liability/06Premium and Limits/Financed/radioBtn_Financed'))

//WebUI.selectOptionByValue(findTestObject('Auto Physical Damage/Premium and LImits/select_APD Premium and Limits Installments'), APD_Installment, false)
WebUI.click(findTestObject('Auto Physical Damage/Premium and LImits/button_APD Premium and Limits Save'))

WebUI.click(findTestObject('00Menus/menu_Finance'))

//START Adding Non-Premium
WebUI.click(findTestObject('Auto Liability/07Finance/Finance Tabs/tab_Non-Premium'))

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Add Non-Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/02Non Premium/select_Non-Premium Type'), '0', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), APD_Administrative_Fee)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Add Non-Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/02Non Premium/select_Non-Premium Type'), '1', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), APD_Broker_Fee)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Add Non-Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/02Non Premium/select_Non-Premium Type'), '4', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), APD_Inspection_Fee)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

/*
WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Add Non-Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/02Non Premium/select_Non-Premium Type'), '5', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), APD_Installment_Charge)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Add Non-Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/02Non Premium/select_Non-Premium Type'), '6', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), APD_Installment_Fee)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))
*/
WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Add Non-Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/02Non Premium/select_Non-Premium Type'), '7', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), APD_NEMT_Inspection_Fee)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Add Non-Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/02Non Premium/select_Non-Premium Type'), '9', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), APD_Reinstatement_Fee)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Add Non-Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/02Non Premium/select_Non-Premium Type'), '10', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), APD_Risk_Management_Fee)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Add Non-Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/02Non Premium/select_Non-Premium Type'), '11', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), APD_Service_Fee)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/btn_nonPremiumVoid_item1'))

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/btn_VoidYes'))

//END Non-Premium
//START ADD Additional Premium
WebUI.click(findTestObject('Auto Liability/07Finance/Finance Tabs/tab_Additional Premium'))

WebUI.click(findTestObject('Auto Liability/07Finance/03Additional Premium/button_Add Additional Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/03Additional Premium/select_Additional Premium Amount Type'), 
    '0', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), APD_Additional_Insured_Charge)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/03Additional Premium/button_Add Additional Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/03Additional Premium/select_Additional Premium Amount Type'), 
    '1', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), APD_Adjustment)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/03Additional Premium/button_Add Additional Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/03Additional Premium/select_Additional Premium Amount Type'), 
    '3', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), APD_Driver_Premium)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/03Additional Premium/button_Add Additional Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/03Additional Premium/select_Additional Premium Amount Type'), 
    '5', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), APD_Mileage_Premium)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/03Additional Premium/button_Add Additional Premium'))

WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/03Additional Premium/select_Additional Premium Amount Type'), 
    '6', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), APD_Minimum_Premium)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/03Additional Premium/button_Add Additional Premium'))

//PNC
WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/03Additional Premium/select_Additional Premium Amount Type'), 
    '9', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), APD_Primary_NonContributory)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/03Additional Premium/button_Add Additional Premium'))

//Waiver
WebUI.selectOptionByValue(findTestObject('Auto Liability/07Finance/03Additional Premium/select_Additional Premium Amount Type'), 
    '12', false)

WebUI.setText(findTestObject('Auto Liability/07Finance/02Non Premium/input_Non-Premium and Premium Amount'), APD_Waiver_OfSubrogation)

WebUI.click(findTestObject('Auto Liability/07Finance/02Non Premium/button_Submit'))

WebUI.click(findTestObject('Auto Liability/07Finance/03Additional Premium/btn_AddPremiumVoid_item3'))

WebUI.click(findTestObject('Auto Liability/07Finance/03Additional Premium/btn_VoidYes'))

//END Additional Premium
WebUI.waitForElementPresent(findTestObject('00Menus/menu_Policy'), GlobalVariable.WaitElem)

WebUI.click(findTestObject('00Menus/menu_Policy'))

WebUI.click(findTestObject('00Menus/subMenu_Issue Policy'))

//WebUI.waitForElementPresent(findTestObject('Auto Liability/Pop-up screen/button_Auto Liability Issue Without Payment'), GlobalVariable.WaitElem)
//WebUI.click(findTestObject('Auto Liability/Pop-up screen/button_Auto Liability Issue Without Payment'))
WebUI.waitForElementPresent(findTestObject('Auto Liability/Pop-up screen/button_Auto Liability OK'), GlobalVariable.WaitElem)

WebUI.click(findTestObject('Auto Liability/Pop-up screen/button_Auto Liability OK'))

