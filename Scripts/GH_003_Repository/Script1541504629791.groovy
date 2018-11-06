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
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('GH_002_Login'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'reusableComponents.HighlightBorder.run'(findTestObject('Object Repository/GitHub_CreateRepository/Page_GitHub/a_New repository'))
WebUI.click(findTestObject('Object Repository/GitHub_CreateRepository/Page_GitHub/a_New repository'))
WebUI.delay(2)

CustomKeywords.'reusableComponents.HighlightElement.run'(findTestObject('Object Repository/GitHub_CreateRepository/Page_Create a New Repository/input_Repository name_reposito'))
WebUI.setText(findTestObject('Object Repository/GitHub_CreateRepository/Page_Create a New Repository/input_Repository name_reposito'),'TestProjectRepository')
WebUI.delay(2)

CustomKeywords.'reusableComponents.RemoveHighlight.run'(findTestObject('Object Repository/GitHub_CreateRepository/Page_Create a New Repository/input_Repository name_reposito'))
CustomKeywords.'reusableComponents.HighlightElement.run'(findTestObject('Object Repository/GitHub_CreateRepository/Page_Create a New Repository/input_(optional)_repositorydes'))
WebUI.setText(findTestObject('Object Repository/GitHub_CreateRepository/Page_Create a New Repository/input_(optional)_repositorydes'),'This is a TestProjectRepository.')
WebUI.delay(1)

CustomKeywords.'reusableComponents.HighlightBorder.run'(findTestObject('Object Repository/GitHub_CreateRepository/Page_Create a New Repository/button_Create repository'))
WebUI.click(findTestObject('Object Repository/GitHub_CreateRepository/Page_Create a New Repository/button_Create repository'))
WebUI.delay(1)

CustomKeywords.'reusableComponents.HighlightBorder.run'(findTestObject('Object Repository/GitHub_CreateRepository/Page_akashshah001TestProjectReposit/a_Projects      0'))
WebUI.click(findTestObject('Object Repository/GitHub_CreateRepository/Page_akashshah001TestProjectReposit/a_Projects      0'))
WebUI.delay(1)

CustomKeywords.'reusableComponents.HighlightBorder.run'(findTestObject('Object Repository/GitHub_CreateRepository/Page_Projects  akashshah001TestProj/a_Create a project'))
WebUI.click(findTestObject('Object Repository/GitHub_CreateRepository/Page_Projects  akashshah001TestProj/a_Create a project'))
WebUI.delay(1)

CustomKeywords.'reusableComponents.HighlightElement.run'(findTestObject('Object Repository/GitHub_CreateRepository/Page_New Project/input_Project board name_proje'))
WebUI.setText(findTestObject('Object Repository/GitHub_CreateRepository/Page_New Project/input_Project board name_proje'),'TestProject')
WebUI.delay(1)

CustomKeywords.'reusableComponents.HighlightElement.run'(findTestObject('Object Repository/GitHub_CreateRepository/Page_New Project/textarea_(optional)_projectbod'))
WebUI.setText(findTestObject('Object Repository/GitHub_CreateRepository/Page_New Project/textarea_(optional)_projectbod'),'This is a TestProject')
WebUI.delay(1)

CustomKeywords.'reusableComponents.HighlightBorder.run'(findTestObject('Object Repository/GitHub_CreateRepository/Page_New Project/button_Create project'))
WebUI.click(findTestObject('Object Repository/GitHub_CreateRepository/Page_New Project/button_Create project'))
WebUI.delay(1)

CustomKeywords.'reusableComponents.HighlightBorder.run'(findTestObject('Object Repository/GitHub_CreateRepository/Page_TestProject/button_Add a column'))
WebUI.click(findTestObject('Object Repository/GitHub_CreateRepository/Page_TestProject/button_Add a column'))
WebUI.delay(1)

CustomKeywords.'reusableComponents.HighlightBorder.run'(findTestObject('Object Repository/GitHub_CreateRepository/Page_TestProject/input_Column name_project_colu'))
WebUI.setText(findTestObject('Object Repository/GitHub_CreateRepository/Page_TestProject/input_Column name_project_colu'),'New Column')
WebUI.delay(1)

CustomKeywords.'reusableComponents.HighlightBorder.run'(findTestObject('Object Repository/GitHub_CreateRepository/Page_TestProject/button_Create column'))
WebUI.click(findTestObject('Object Repository/GitHub_CreateRepository/Page_TestProject/button_Create column'))
WebUI.delay(1)

CustomKeywords.'reusableComponents.HighlightBorder.run'(findTestObject('Object Repository/GitHub_CreateRepository/Page_TestProject/a_Wiki'))
WebUI.click(findTestObject('Object Repository/GitHub_CreateRepository/Page_TestProject/a_Wiki'))
WebUI.delay(1)

CustomKeywords.'reusableComponents.HighlightBorder.run'(findTestObject('Object Repository/GitHub_CreateRepository/Page_GitHub  Where software is buil/a_Create the first page'))
WebUI.click(findTestObject('Object Repository/GitHub_CreateRepository/Page_GitHub  Where software is buil/a_Create the first page'))
WebUI.delay(1)

CustomKeywords.'reusableComponents.HighlightBorder.run'(findTestObject('Object Repository/GitHub_CreateRepository/Page_Create New Page  akashshah001T/input_Create new page_wikiname'))
WebUI.setText(findTestObject('Object Repository/GitHub_CreateRepository/Page_Create New Page  akashshah001T/input_Create new page_wikiname'),'Test Page')
WebUI.delay(1)

CustomKeywords.'reusableComponents.HighlightBorder.run'(findTestObject('Object Repository/GitHub_CreateRepository/Page_Create New Page  akashshah001T/textarea_Welcome to the TestPr'))
WebUI.setText(findTestObject('Object Repository/GitHub_CreateRepository/Page_Create New Page  akashshah001T/textarea_Welcome to the TestPr'),'This is a Test Page.\n')
WebUI.delay(1)

CustomKeywords.'reusableComponents.HighlightBorder.run'(findTestObject('Object Repository/GitHub_CreateRepository/Page_Create New Page  akashshah001T/input_Edit message_wikicommit'))
WebUI.setText(findTestObject('Object Repository/GitHub_CreateRepository/Page_Create New Page  akashshah001T/input_Edit message_wikicommit'),'Initial Test page')
WebUI.delay(1)

CustomKeywords.'reusableComponents.HighlightBorder.run'(findTestObject('Object Repository/GitHub_CreateRepository/Page_Create New Page  akashshah001T/button_Save Page'))
WebUI.click(findTestObject('Object Repository/GitHub_CreateRepository/Page_Create New Page  akashshah001T/button_Save Page'))
WebUI.delay(1)
