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
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import javax.swing.DefaultRowSorter.Row

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.codehaus.groovy.ast.stmt.ContinueStatement
import org.sikuli.api.API
import org.sikuli.api.APILogger

import com.kms.katalon.core.logging.KeywordLogger

'GitHub Login Data Driven Testing'
'Excel Data read' 
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://github.com/login')

FileInputStream file = new FileInputStream (new File("C:\\Users\\akash\\Katalon Studio\\GitHub\\Data Files\\LoginCredentials\\LoginCredentials.xlsx"))
XSSFWorkbook workbook = new XSSFWorkbook(file);
XSSFSheet sheet = workbook.getSheetAt(0);
int Rowcount = sheet.getLastRowNum();

for(int row=1;row<=Rowcount;row++)
{
		
		String Username = sheet.getRow(row).getCell(0).getStringCellValue().trim();
		CustomKeywords.'reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Github_Login/Page_Sign in to GitHub  GitHub/input_Username or email addres'))
		WebUI.setText(findTestObject('Object Repository/Github_Login/Page_Sign in to GitHub  GitHub/input_Username or email addres'),Username)
		WebUI.delay(3)
		
		String Password = sheet.getRow(row).getCell(1).getStringCellValue();
		CustomKeywords.'reusableComponents.RemoveHighlight.run'(findTestObject('Object Repository/Github_Login/Page_Sign in to GitHub  GitHub/input_Username or email addres'))
		CustomKeywords.'reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Github_Login/Page_Sign in to GitHub  GitHub/input_Forgot password_password'))
		WebUI.setText(findTestObject('Object Repository/Github_Login/Page_Sign in to GitHub  GitHub/input_Forgot password_password'),Password)
		WebUI.delay(3)
		
		CustomKeywords.'reusableComponents.RemoveHighlight.run'(findTestObject('Object Repository/Github_Login/Page_Sign in to GitHub  GitHub/input_Forgot password_password'))
		CustomKeywords.'reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Github_Login/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))
		WebUI.click(findTestObject('Object Repository/Github_Login/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))
		
		try
		{
			String Validation = WebUI.getText(findTestObject("Object Repository/Login_Assert/Page_Sign in to GitHub  GitHub/div_Incorrect username or pass"))
			println Validation
		}
		catch(Exception e)
		{
			WebUI.delay(4)
			WebUI.takeScreenshot()
			CustomKeywords.'reusableComponents.HighlightElement.run'(findTestObject('Object Repository/GitHub_Logout/Page_GitHub/summary_New organization_Heade'))
			WebUI.click(findTestObject('Object Repository/GitHub_Logout/Page_GitHub/summary_New organization_Heade'))
			CustomKeywords.'reusableComponents.RemoveHighlight.run'(findTestObject('Object Repository/GitHub_Logout/Page_GitHub/summary_New organization_Heade'))
			WebUI.delay(4)
			CustomKeywords.'reusableComponents.HighlightElement.run'(findTestObject('Object Repository/GitHub_Logout/Page_GitHub/button_Sign out'))
			WebUI.click(findTestObject('Object Repository/GitHub_Logout/Page_GitHub/button_Sign out'))
			WebUI.delay(4)
			CustomKeywords.'reusableComponents.HighlightElement.run'(findTestObject('Object Repository/GitHub_SignIn/Page_The worlds leading software de/a_Sign in'))
			WebUI.click(findTestObject('Object Repository/GitHub_SignIn/Page_The worlds leading software de/a_Sign in'))
			WebUI.delay(4)
		}
	}
