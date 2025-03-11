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

WebUI.navigateToUrl('https://rotimatic.com/collections/accessories')

WebUI.click(findTestObject('Object Repository/RotiPlusAccessoriesTest/Page_Rotimatic Plus Accessories  Official Store/span_Rotimatic Plus'))

WebUI.scrollToElement(findTestObject('RotiPlusAccessoriesTest/Page_Rotimatic Plus Accessories  Official Store/span_Find the accessories youre looking for'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/RotiPlusAccessoriesTest/Page_Rotimatic Plus Accessories  Official Store/span_Find the accessories youre looking for'))

not_run: WebUI.click(findTestObject('Object Repository/RotiPlusAccessoriesTest/Page_Rotimatic Plus Accessories  Official Store/div_Find the accessories youre looking for _6947bd'))

WebUI.scrollToElement(findTestObject('RotiPlusAccessoriesTest/Page_Rotimatic Plus Accessories  Official Store/a_Rotimatic Apron                          _ceda2f'), 
    0)

WebUI.click(findTestObject('Object Repository/RotiPlusAccessoriesTest/Page_Rotimatic Plus Accessories  Official Store/a_Rotimatic Apron                          _ceda2f'))

WebUI.click(findTestObject('Object Repository/RotiPlusAccessoriesTest/Page_Rotimatic Apron - Rotimatic/span_USD 39'))

WebUI.click(findTestObject('Object Repository/RotiPlusAccessoriesTest/Page_Rotimatic Apron - Rotimatic/span_Rotimatic Apron'))

WebUI.click(findTestObject('Object Repository/RotiPlusAccessoriesTest/Page_Rotimatic Apron - Rotimatic/button_Quantity_prod-access-hero-details-fo_1f3444'))

WebUI.click(findTestObject('Object Repository/RotiPlusAccessoriesTest/Page_Rotimatic Apron - Rotimatic/button_Quantity_prod-access-hero-details-fo_431935'))

WebUI.click(findTestObject('Object Repository/RotiPlusAccessoriesTest/Page_Rotimatic Apron - Rotimatic/div_Add to cart_prod-access-hero-gallery-th_0a6ca3'))

WebUI.click(findTestObject('Object Repository/RotiPlusAccessoriesTest/Page_Rotimatic Apron - Rotimatic/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/RotiPlusAccessoriesTest/Page_Your Shopping Cart - Rotimatic/dd_USD 39'))

WebUI.click(findTestObject('Object Repository/RotiPlusAccessoriesTest/Page_Your Shopping Cart - Rotimatic/span_1 item'))

WebUI.click(findTestObject('Object Repository/RotiPlusAccessoriesTest/Page_Your Shopping Cart - Rotimatic/div_Remove_cart__qty'))

WebUI.click(findTestObject('Object Repository/RotiPlusAccessoriesTest/Page_Your Shopping Cart - Rotimatic/button_Remove_cart__qty-plus-btn'))

WebUI.click(findTestObject('Object Repository/RotiPlusAccessoriesTest/Page_Your Shopping Cart - Rotimatic/button_Remove_cart__qty-minus-btn'))

WebUI.closeBrowser()

