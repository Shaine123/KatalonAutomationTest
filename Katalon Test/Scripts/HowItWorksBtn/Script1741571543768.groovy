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

WebUI.click(findTestObject('Object Repository/HowItWorks/Page_Rotimatic Fully Automatic Roti Maker  _722ede/button_'))

WebUI.click(findTestObject('Object Repository/HowItWorks/Page_Rotimatic NEXT The Future of Roti-Maki_3d4686/div_Rotimatic NEXT uses cutting edge Vision_eec3aa'))

WebUI.click(findTestObject('Object Repository/HowItWorks/Page_Rotimatic NEXT The Future of Roti-Maki_3d4686/span_NEXT level roti  technology'))

WebUI.click(findTestObject('Object Repository/HowItWorks/Page_Rotimatic NEXT The Future of Roti-Maki_3d4686/div_INDIA WINS YOU WIN                     _db35a7'))

WebUI.click(findTestObject('Object Repository/HowItWorks/Page_Rotimatic NEXT The Future of Roti-Maki_3d4686/a_Buy Rotimatic today'))

WebUI.verifyElementPresent(findTestObject('Object Repository/HowItWorks/Page_Buy Rotimatic Next - Rotimatic/span_Buy                   Rotimatic Next'), 
    0)

WebUI.closeBrowser()

