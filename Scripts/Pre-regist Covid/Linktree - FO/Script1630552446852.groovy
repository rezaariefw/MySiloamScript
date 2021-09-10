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

WebUI.callTestCase(findTestCase('Pre-regist Covid/TestCase/1. linktree - (Pilih Paket, Data Diri)'), [('NamaRS') : NamaRS
        , ('NamaSID') : NamaSID, ('NoHP') : NoHP, ('Email') : Email, ('TanggalKunjungan') : TanggalKunjungan, ('WaktuKunjungan') : WaktuKunjungan
        , ('CaraPembayaran') : CaraPembayaran, ('NamaPenjamin') : NamaPenjamin, ('PernahBerobat') : PernahBerobat, ('Identitas') : Identitas
        , ('NoIdentitas') : NoIdentitas, ('JenisKelamin') : JenisKelamin, ('TanggalLahir') : TanggalLahir, ('Status') : Status
        , ('Agama') : Agama, ('Alamat') : Alamat, ('Kota') : Kota, ('Kecamatan') : Kecamatan, ('Kelurahan') : Kelurahan, ('KeluargaDarurat') : KeluargaDarurat
        , ('NoDarurat') : NoDarurat, ('Kendaraan') : Kendaraan], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Pre-regist Covid/TestCase/2. linktree - (PE Form, pembayaran)'), [('PernahBerobat') : PernahBerobat
        , ('TujuanPemeriksaan') : TujuanPemeriksaan, ('Pekerjaan') : Pekerjaan, ('Namaortu') : Namaortu, ('Provinsi') : Provinsi
        , ('RT') : RT, ('RW') : RW, ('KodeBooking') : '', ('TanggalFO') : TanggalFO, ('Username') : Username, ('Password') : Password
        , ('CaraPembayaran') : CaraPembayaran, ('JenisKelamin') : JenisKelamin, ('PembayaranVIA') : PembayaranVIA, ('OrderID') : ''
        , ('ATM') : ATM], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

