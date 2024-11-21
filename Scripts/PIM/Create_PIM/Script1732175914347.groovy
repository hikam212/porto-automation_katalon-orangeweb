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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

// Menampilkan Halaman Admin

WebUI.click(findTestObject('Object Repository/PIM/Menu_PIM'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Object Repository/PIM/Validasi_Page_PIM'))

WebUI.click(findTestObject('Object Repository/PIM/button_Add'))

// Add Employee

// Mendapatkan angka acak antara 1 dan 1000
int Lastname = getRandomInt(1, 1000)

WebUI.verifyElementVisible(findTestObject('Object Repository/PIM/Validasi_Page_Add_Employee'))

WebUI.setText(findTestObject('Object Repository/PIM/Input_Firstname'), 'Automate')

WebUI.setText(findTestObject('Object Repository/PIM/Input_Middlename'), 'Testing')

WebUI.setText(findTestObject('Object Repository/PIM/Input_Lastname'), Lastname.toString())

WebUI.setText(findTestObject('Object Repository/PIM/Input_EmployeeID'), Lastname.toString())

WebUI.click(findTestObject('Object Repository/PIM/Radio_Create_Login_Details'))

WebUI.setText(findTestObject('Object Repository/PIM/Input_Username'), 'Automate Test'+ Lastname.toString())

WebUI.setText(findTestObject('Object Repository/PIM/Input_Password'), 'Automate_212')

WebUI.setText(findTestObject('Object Repository/PIM/Input_Conf_Password'), 'Automate_212')

WebUI.click(findTestObject('Object Repository/PIM/button_Save'))

// Fungsi untuk menghasilkan angka acak
def getRandomInt(int min, int max) {
	return (int)(Math.random() * (max - min + 1)) + min
}













