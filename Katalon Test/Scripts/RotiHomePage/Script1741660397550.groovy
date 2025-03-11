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

WebUI.navigateToUrl('https://rotimatic.com/')

WebUI.click(findTestObject('Object Repository/RotiHomePage/Page_Rotimatic Fully Automatic Roti Maker  _722ede/span_Fresh Rotis  at home, every day. Rotim_48a8df'))

WebUI.click(findTestObject('Object Repository/RotiHomePage/Page_Rotimatic Fully Automatic Roti Maker  _722ede/div_A must-have for the modern kitchen     _29eebe'))

WebUI.click(findTestObject('Object Repository/RotiHomePage/Page_Rotimatic Fully Automatic Roti Maker  _722ede/span_Real-time IoT enabled intelligence for_a8c857'))

WebUI.click(findTestObject('Object Repository/RotiHomePage/Page_Rotimatic Fully Automatic Roti Maker  _722ede/span_Happy ratings that customers have given us'))

WebUI.click(findTestObject('Object Repository/RotiHomePage/Page_Rotimatic Fully Automatic Roti Maker  _722ede/div_001                                    _2e78a5'))

WebUI.click(findTestObject('Object Repository/RotiHomePage/Page_Rotimatic Fully Automatic Roti Maker  _722ede/div_002                                    _8fa55c'))

WebUI.click(findTestObject('Object Repository/RotiHomePage/Page_Rotimatic Fully Automatic Roti Maker  _722ede/div_003                                    _3bfc37'))

WebUI.click(findTestObject('Object Repository/RotiHomePage/Page_Rotimatic Fully Automatic Roti Maker  _722ede/div_004                                    _0e0d72'))

WebUI.click(findTestObject('Object Repository/RotiHomePage/Page_Rotimatic Fully Automatic Roti Maker  _722ede/div_005                                    _a98d76'))

WebUI.click(findTestObject('Object Repository/RotiHomePage/Page_Rotimatic Fully Automatic Roti Maker  _722ede/div_006                                    _45ec25'))

WebUI.closeBrowser()

