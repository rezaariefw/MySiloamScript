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

not_run: WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.85.139.13:4304/appointment-list')

not_run: WebUI.maximizeWindow()

WebUI.waitForPageLoad(120, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input_Username_username FO OPD'), Username)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input_Password_password FO OPD'), Password)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Pre-regist OPD/CC/button_Sign InCC'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Object Repository/Pre-regist OPD/CC/input_Hospital_ng-untouched ng-pristine ng-valid'), 
    120)

not_run: WebUI.click(findTestObject('Object Repository/Pre-regist OPD/CC/button_Appointment List'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/Pre-regist OPD/CC/input_Hospital_ng-untouched ng-pristine ng-valid'))

not_run: WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/CC/input_Hospital_ng-untouched ng-pristine ng-valid'), 
    NamaRSCC)

not_run: WebUI.click(findTestObject('Object Repository/Pre-regist OPD/CC/pilih RS'))

not_run: WebUI.click(findTestObject('Object Repository/Pre-regist OPD/CC/hapus tanggal appointment list'))

not_run: WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/CC/input_Appointment date_selection ng-untouch_b13c69'), 
    TanggalCC)

not_run: WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/CC/input_Action_filter-by-name-appointment-list'), 
    NamaLengkap)

not_run: WebUI.click(findTestObject('Object Repository/Pre-regist OPD/CC/td konfirmasi'))

not_run: WebUI.delay(15)

if ((Reservasi == 'Orang lain') || ((Reservasi == 'Diri Sendiri') && (PernahBerobat == 'Pernah'))) {
    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/CC/div_Appointment Verification'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/CC/input_Hospital_ng-untouched ng-pristine ng-valid'))

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/CC/input_Hospital_ng-untouched ng-pristine ng-valid'), 
        NamaRSCC)

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/CC/pilih RS'))

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/CC/hapus tanggal appointment list'))

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/CC/input_Appointment date_selection ng-untouch_b13c69'), 
        TanggalCC)

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/CC/input nama pasien'))

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/CC/input nama pasien'), NamaLengkap)

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/CC/input_Verify_ng-untouched ng-pristine ng-valid'))

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/CC/input_Verify_ng-untouched ng-pristine ng-valid'), 
        NamaDokter)

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/CC/i_close hapus dokter'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/CC/th konfirmasi av'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/CC/button_Check verify'))

    WebUI.waitForElementVisible(findTestObject('Pre-regist OPD/CC/app-modal-patient-verification_Search Patie_9e0d5a'), 
        120)

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/CC/div_Create'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/CC/button_Confirm'))

    WebUI.delay(5)
}

