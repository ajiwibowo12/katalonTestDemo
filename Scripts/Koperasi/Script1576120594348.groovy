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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8080/login')

WebUI.setText(findTestObject('Object Repository/TestKoperasi212/Page_Koperasi Syariah 212  Login/input_Koperasi_username'), 
    'admin.212@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/TestKoperasi212/Page_Koperasi Syariah 212  Login/input_Koperasi_password'), 
    'RAIVpflpDOg=')

WebUI.sendKeys(findTestObject('Object Repository/TestKoperasi212/Page_Koperasi Syariah 212  Login/input_Koperasi_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TestKoperasi212/Page_Koperasi Syariah/a_Master'))

WebUI.click(findTestObject('Object Repository/TestKoperasi212/Page_Koperasi Syariah/a_City'))

WebUI.click(findTestObject('Object Repository/TestKoperasi212/Page_Koperasi Syariah/i_City_fa fa-plus'))

WebUI.click(findTestObject('Object Repository/TestKoperasi212/Page_Koperasi Syariah/span_Pilih Provinsi'))

WebUI.setText(findTestObject('Object Repository/TestKoperasi212/Page_Koperasi Syariah/input_Code_code'), 'Papspua')

WebUI.click(findTestObject('Object Repository/TestKoperasi212/Page_Koperasi Syariah/input_Name_name'))

WebUI.setText(findTestObject('Object Repository/TestKoperasi212/Page_Koperasi Syariah/input_Code_code'), '99002')

WebUI.setText(findTestObject('Object Repository/TestKoperasi212/Page_Koperasi Syariah/input_Name_name'), 'Papspua')

WebUI.click(findTestObject('Object Repository/TestKoperasi212/Page_Koperasi Syariah/button_Save'))

WebUI.click(findTestObject('Object Repository/TestKoperasi212/Page_Koperasi Syariah/a_City'))

WebUI.click(findTestObject('Object Repository/TestKoperasi212/Page_Koperasi Syariah/span_Administrator'))

WebUI.click(findTestObject('Object Repository/TestKoperasi212/Page_Koperasi Syariah/a_Logout'))

WebUI.click(findTestObject('Object Repository/TestKoperasi212/Page_Koperasi Syariah 212  Login/input_Koperasi_username'))

WebUI.closeBrowser()

