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
import java.io.FileInputStream as FileInputStream
import java.io.FileNotFoundException as FileNotFoundException
import java.io.IOException as IOException
import java.util.Date as Date
import javax.swing.DefaultRowSorter.Row as Row
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.codehaus.groovy.ast.stmt.ContinueStatement as ContinueStatement
import org.sikuli.api.API as API
import org.sikuli.api.APILogger as APILogger
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import internal.GlobalVariable as GlobalVariable

'Manual Login'
WebUI.openBrowser('')
WebUI.maximizeWindow()

WebUI.navigateToUrl('https://github.com/login')
CustomKeywords.'reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Github_Login/Page_Sign in to GitHub  GitHub/input_Username or email addres'))
WebUI.setText(findTestObject('Object Repository/Github_Login/Page_Sign in to GitHub  GitHub/input_Username or email addres'), 'akashshah001')
WebUI.delay(3)

CustomKeywords.'reusableComponents.RemoveHighlight.run'(findTestObject('Object Repository/Github_Login/Page_Sign in to GitHub  GitHub/input_Username or email addres'))
CustomKeywords.'reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Github_Login/Page_Sign in to GitHub  GitHub/input_Forgot password_password'))
WebUI.setText(findTestObject('Object Repository/Github_Login/Page_Sign in to GitHub  GitHub/input_Forgot password_password'), 'Github@123')
WebUI.delay(3)

CustomKeywords.'reusableComponents.RemoveHighlight.run'(findTestObject('Object Repository/Github_Login/Page_Sign in to GitHub  GitHub/input_Forgot password_password'))
CustomKeywords.'reusableComponents.HighlightBorder.run'(findTestObject('Object Repository/Github_Login/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))
WebUI.click(findTestObject('Object Repository/Github_Login/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))
WebUI.delay(3)
WebUI.takeScreenshot()
