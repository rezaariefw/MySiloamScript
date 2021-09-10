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

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/tujuan pemeriksaan'), 
    30)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/tujuan pemeriksaan'), 
    20)

if (TujuanPemeriksaan == 'Rencana tindakan') {
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/tujuan pemeriksaan'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Tujuanpemeriksaan/li_Rencana Tindakan  Rawat Inap'))

    WebUI.delay(1)
} else if (TujuanPemeriksaan == 'Rencana bepergian') {
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/tujuan pemeriksaan'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Tujuanpemeriksaan/li_Rencana Bepergian'))

    WebUI.delay(1)
} else if (TujuanPemeriksaan == 'Follow up post covid') {
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/tujuan pemeriksaan'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Tujuanpemeriksaan/li_Follow up post covid'))

    WebUI.delay(2)
} else {
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/tujuan pemeriksaan'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Tujuanpemeriksaan/li_Pemeriksaan Rutin  Atas Permintaan Sendiri'))

    WebUI.delay(1)
}

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Pekerjaan_occupation'), 
    30)

WebUI.waitForElementVisible(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Pekerjaan_occupation'), 
    30)

if (PernahBerobat == 'Pernah') {
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/kelamin PE'))

    if (JenisKelamin == 'Pria') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/PriaPE'))

        WebUI.delay(1)
    } else {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/wanitaPE'))

        WebUI.delay(1)
    }
}

WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Pekerjaan_occupation'), 
    Pekerjaan)

WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Nama Orang Tua_parent_name'), 
    Namaortu)

WebUI.delay(1)

if (PernahBerobat == 'Pernah') {
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/klik provinsi pernah'))

    WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input provinsi pernah'), 
        Provinsi)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Pilih provinsi'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input rt pernah'), RT)

    WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input rw pernah'), RW)
} else {
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Klik provinsi'))

    WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Provinsi_state_id'), 
        Provinsi)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Pilih provinsi'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_RT_rt_number'), 
        RT)

    WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_RW_rw_number'), 
        RW)
}

WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Pertanyaan pemeriksaan/Pertanyaan 1 Tidak'))

WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Pertanyaan pemeriksaan/Pertanyaan 2 Tidak'))

WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Pertanyaan pemeriksaan/Pertanyaan 3 Tidak'))

WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Pertanyaan pemeriksaan/Pertanyaan 4 Tidak'))

WebUI.scrollToPosition(9999999, 9999999)

WebUI.delay(2)

WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/button_lanjut PE form'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/header pembayaran'), 
    120)

WebUI.scrollToPosition(9999999, 9999999)

WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/isAgree'))

WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/isConsent'))

WebUI.delay(1)

if (CaraPembayaran == 'Pribadi') {
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/button bayar'))

    WebUI.delay(1)

    WebUI.waitForElementVisible(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/order id'), 
        30)

    OrderID = WebUI.getText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/order id'))

    println('No Order Id : ' + OrderID)

    if (PembayaranVIA == 'ATM') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/pilih via atm'))

        WebUI.delay(1)

        if (ATM == 'Mandiri') {
            WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/ATM mandiri'))

            WebUI.delay(1)
        } else if (ATM == 'BCA') {
            WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/ATM BCA'))

            WebUI.delay(1)
        }
        
        WebUI.scrollToPosition(0, 9999999)

        WebUI.delay(1)

        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/lihat no rekening'))

        WebUI.delay(1)

        WebUI.scrollToPosition(0, 9999999)

        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/selesaikan pembayaran'))
    }
} else {
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/button_Kirim'))
}

WebUI.waitForElementVisible(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/terima kasih'), 
    120)

WebUI.delay(3)

KodeBooking = WebUI.getText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/kode booking'))

println('Kode Booking : ' + KodeBooking)

WebUI.delay(5)

WebUI.navigateToUrl('http://10.85.139.100:5678/pre-registration')

WebUI.waitForElementVisible(findTestObject('Pre-regist Covid/Front Office OPD/Button login FO'), 30)

WebUI.delay(2)

'Username\r\n'
WebUI.setText(findTestObject('Pre-regist Covid/Front Office OPD/input username FO'), Username)

'Password\r\n'
WebUI.setText(findTestObject('Pre-regist Covid/Front Office OPD/input password FO'), Password)

WebUI.click(findTestObject('Pre-regist Covid/Front Office OPD/Button login FO'))

WebUI.delay(2)

WebUI.waitForPageLoad(30, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Pre-regist Covid/Front Office OPD/delete tanggal'), 120)

WebUI.click(findTestObject('Pre-regist Covid/Front Office OPD/delete tanggal'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Pre-regist Covid/Front Office OPD/input tanggak'), TanggalFO)

WebUI.delay(2)

WebUI.setText(findTestObject('Pre-regist Covid/Front Office OPD/input kode booking'), KodeBooking)

WebUI.delay(1)

WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/confrim kode booking'))

WebUI.delay(5)

WebUI.closeBrowser()

