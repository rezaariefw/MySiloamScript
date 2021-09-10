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

WebUI.navigateToUrl('http://10.85.139.13:1252/pre-registration')

not_run: WebUI.maximizeWindow()

WebUI.waitForPageLoad(120)

WebUI.delay(1)

WebUI.setText(findTestObject('Pre-regist OPD/FO/input_Username_username FO OPD'), Username)

WebUI.delay(1)

WebUI.setText(findTestObject('Pre-regist OPD/FO/input_Password_password FO OPD'), Password)

WebUI.delay(1)

WebUI.click(findTestObject('Pre-regist OPD/FO/button_Sign In FO OPD'))

WebUI.waitForElementVisible(findTestObject('Pre-regist OPD/FO/input name FO'), 120)

WebUI.click(findTestObject('Pre-regist OPD/FO/delete tanggal FO'))

WebUI.delay(1)

WebUI.setText(findTestObject('Pre-regist OPD/FO/input tanggal FO'), TanggalFO)

WebUI.delay(1)

WebUI.setText(findTestObject('Pre-regist OPD/FO/input name FO'), NamaLengkap)

WebUI.delay(1)

WebUI.click(findTestObject('Pre-regist OPD/FO/klik update FO'))

WebUI.delay(2)

WebUI.click(findTestObject('Pre-regist OPD/FO/Pilih data FO'))

WebUI.delay(1)

WebUI.waitForElementNotVisible(findTestObject('Pre-regist OPD/FO/modal compare patient data'), 5)

WebUI.callTestCase(findTestCase('Pre-regis OPD (pending)/FO/FO - patient data'), [('NamaLengkap') : NamaLengkap, ('TanggalFO') : TanggalFO
        , ('Username') : Username, ('Password') : Password, ('TglLahirFO') : TglLahirFO, ('NamaPasanganFO') : NamaPasanganFO
        , ('NamaAyahFO') : NamaAyahFO, ('NamaIbuFO') : NamaIbuFO, ('TittleFO') : TittleFO, ('StatusFO') : StatusFO, ('JenisKelaminFO') : JenisKelaminFO
        , ('TmptLahirKotaFO') : TmptLahirKotaFO, ('GolDarahFO') : GolDarahFO, ('AgamaFO') : AgamaFO, ('NoteFO') : NoteFO
        , ('AlamatFO') : AlamatFO, ('NoHP1FO') : NoHP1FO, ('NoHP2FO') : NoHP2FO, ('AlergiFO') : AlergiFO, ('KodeposFO') : KodeposFO
        , ('IdentitasFO') : IdentitasFO, ('NoIdentitasFO') : NoIdentitasFO, ('AlamatPermanenFO') : AlamatPermanenFO, ('NamaDaruratFO') : NamaDaruratFO
        , ('Email') : Email, ('ReservasiFO') : ReservasiFO, ('PernahBerobatFO') : PernahBerobatFO], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(15)

