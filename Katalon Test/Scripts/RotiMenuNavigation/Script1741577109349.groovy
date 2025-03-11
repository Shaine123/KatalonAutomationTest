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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://rotimatic.com/')

WebUI.click(findTestObject('Object Repository/RotiMenuNavigation/Page_Rotimatic Fully Automatic Roti Maker  _722ede/span_Accessories'))

WebUI.click(findTestObject('Object Repository/RotiMenuNavigation/Page_Rotimatic Fully Automatic Roti Maker  _722ede/span_Rotimatic NEXT'))

WebUI.click(findTestObject('Object Repository/RotiMenuNavigation/Page_Rotimatic Accessories Next - Rotimatic/span_Rotimatic NEXT'))

WebUI.scrollToElement(findTestObject('RotiMenuNavigation/Page_Rotimatic Accessories Next - Rotimatic/div_Find the accessories youre looking for _6947bd'), 
    0)

WebUI.click(findTestObject('Object Repository/RotiMenuNavigation/Page_Rotimatic Accessories Next - Rotimatic/div_Find the accessories youre looking for _6947bd'))

WebUI.click(findTestObject('Object Repository/RotiMenuNavigation/Page_Rotimatic Accessories Next - Rotimatic/div_Featured_acc-product-item-img'))

WebUI.closeBrowser()

