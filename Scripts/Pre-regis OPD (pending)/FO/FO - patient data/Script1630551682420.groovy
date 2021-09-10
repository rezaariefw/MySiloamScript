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

not_run: WebUI.navigateToUrl('http://10.85.139.13:1252/pre-registration')

not_run: WebUI.maximizeWindow()

not_run: WebUI.waitForElementVisible(findTestObject('Pre-regist OPD/FO/button_Sign In FO OPD'), 5)

not_run: WebUI.setText(findTestObject('Pre-regist OPD/FO/input_Username_username FO OPD'), Username)

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Pre-regist OPD/FO/input_Password_password FO OPD'), Password)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Pre-regist OPD/FO/button_Sign In FO OPD'))

not_run: WebUI.waitForElementVisible(findTestObject('Pre-regist OPD/FO/input name FO'), 120)

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/Pre-regist OPD/FO/div_Patient Data'))

not_run: WebUI.waitForElementVisible(findTestObject('Pre-regist OPD/FO/input_nama pasien'), 30)

not_run: WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input_nama pasien'), NamaLengkap)

not_run: WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input_tanggal lahir'), TglLahirFO)

not_run: WebUI.click(findTestObject('Object Repository/Pre-regist OPD/FO/search'))

if ((ReservasiFO == 'Diri Sendiri') && (PernahBerobatFO == 'Tidak')) {
    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/FO/button_bikin pasien baru'))

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input_nama pasangan'), NamaPasanganFO)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input_nama ayah'), NamaAyahFO)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input_nama ibu'), NamaIbuFO)

    WebUI.delay(1)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Pre-regist OPD/FO/select_title'), TittleFO, true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Pre-regist OPD/FO/select_jenis kelamin'), JenisKelaminFO, 
        true)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input_tempat lahir'), TmptLahirKotaFO)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Pre-regist OPD/FO/select_golongan darah'), GolDarahFO, true)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/isi note'), NoteFO)

    WebUI.delay(1)

    WebUI.scrollToPosition(0, 99999)

    WebUI.delay(1)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input no hp 2'), NoHP2FO)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input_alergi'), AlergiFO)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input_kodepos'), KodeposFO)

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/FO/tab Permanent Address'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/alamat permanen'), AlamatPermanenFO)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/kota permanen'), TmptLahirKotaFO)

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/FO/tab_Emergency Contact Detail'))

    WebUI.delay(2)

    not_run: WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/nama darurat'), NamaDaruratFO)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/no hp 2'), NoHP2FO)

    WebUI.delay(1)

    WebUI.scrollToPosition(0, 99999)

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/FO/button_Save'))

    WebUI.scrollToPosition(0, 99999)

    WebUI.delay(15)
} else {
    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/FO/button_bikin pasien baru'))

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input_nama pasangan'), NamaPasanganFO)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input_nama ayah'), NamaAyahFO)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input_nama ibu'), NamaIbuFO)

    WebUI.delay(1)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Pre-regist OPD/FO/select_title'), TittleFO, true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Pre-regist OPD/FO/select_status'), StatusFO, true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Pre-regist OPD/FO/select_jenis kelamin'), JenisKelaminFO, 
        true)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input_tempat lahir'), TmptLahirKotaFO)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Pre-regist OPD/FO/select_golongan darah'), GolDarahFO, true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Pre-regist OPD/FO/select_agama'), AgamaFO, true)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/isi note'), NoteFO)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/alamat'), AlamatFO)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input_kota'), TmptLahirKotaFO)

    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input_no hp 1'), NoHP1FO)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input no hp 2'), NoHP2FO)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input_Email'), Email)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input_alergi'), AlergiFO)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input_kodepos'), KodeposFO)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Pre-regist OPD/FO/select_ identitas'), IdentitasFO, true)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/input_no identitas'), NoIdentitasFO)

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/FO/tab Permanent Address'))

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/alamat permanen'), AlamatPermanenFO)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/kota permanen'), TmptLahirKotaFO)

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/FO/tab_Emergency Contact Detail'))

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/nama darurat'), NamaDaruratFO)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/no hp 1'), NoHP1FO)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/FO/no hp 2'), NoHP2FO)

    WebUI.delay(1)

    WebUI.scrollToPosition(0, 99999)

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/FO/button_Save'))

    WebUI.scrollToPosition(0, 99999)

    WebUI.delay(15)
}

