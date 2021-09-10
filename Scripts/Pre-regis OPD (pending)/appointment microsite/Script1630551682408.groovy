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

WebUI.navigateToUrl('http://10.85.139.12/appointment-microsite/')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(120, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Page_Cari Jadwal  Buat Janji dengan Dokter _791af4/input_Nama Dokter'))

WebUI.setText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Page_Cari Jadwal  Buat Janji dengan Dokter _791af4/input_Nama Dokter'), 
    NamaDokter)

WebUI.delay(2)

WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Page_Cari Jadwal  Buat Janji dengan Dokter _791af4/klik nama dokter'))

WebUI.delay(2)

WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Page_Cari Jadwal  Buat Janji dengan Dokter _791af4/button_Cari'))

WebUI.waitForElementVisible(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Page_Cari Jadwal Praktek Dr. dr. John C. P._b32dd8/button_Buat Janji Temu'), 
    120)

WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Page_Cari Jadwal Praktek Dr. dr. John C. P._b32dd8/button_Buat Janji Temu'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/pilih tanggal'), 
    30)

WebUI.scrollToElement(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/pilih tanggal'), 
    30)

'tiap bulan update'
if (TanggalJanji != '0') {
    if (TanggalJanji == '1') {
        WebUI.delay(2)

        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_1'))

        WebUI.delay(1)
    } else if (TanggalJanji == '2') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_2'))

        WebUI.delay(1)
    } else if (TanggalJanji == '3') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_3'))

        WebUI.delay(1)
    } else if (TanggalJanji == '4') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_4'))

        WebUI.delay(1)
    } else if (TanggalJanji == '5') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalJanji == '6') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_6'))

        WebUI.delay(1)
    } else if (TanggalJanji == '7') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_7'))

        WebUI.delay(1)
    } else if (TanggalJanji == '8') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_8'))

        WebUI.delay(1)
    } else if (TanggalJanji == '9') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_9'))

        WebUI.delay(1)
    } else if (TanggalJanji == '10') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_10'))

        WebUI.delay(1)
    } else if (TanggalJanji == '11') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_11'))

        WebUI.delay(1)
    } else if (TanggalJanji == '12') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalJanji == '13') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_13'))

        WebUI.delay(1)
    } else if (TanggalJanji == '14') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_14'))

        WebUI.delay(1)
    } else if (TanggalJanji == '15') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_15'))

        WebUI.delay(1)
    } else if (TanggalJanji == '16') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_16'))

        WebUI.delay(1)
    } else if (TanggalJanji == '17') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_17'))

        WebUI.delay(1)
    } else if (TanggalJanji == '18') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_18'))

        WebUI.delay(1)
    } else if (TanggalJanji == '19') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalJanji == '20') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_20'))

        WebUI.delay(1)
    } else if (TanggalJanji == '21') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_21'))

        WebUI.delay(1)
    } else if (TanggalJanji == '22') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_22'))

        WebUI.delay(1)
    } else if (TanggalJanji == '23') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_23'))

        WebUI.delay(1)
    } else if (TanggalJanji == '24') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_24'))

        WebUI.delay(1)
    } else if (TanggalJanji == '25') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_25'))

        WebUI.delay(1)
    } else if (TanggalJanji == '26') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalJanji == '27') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_27'))

        WebUI.delay(1)
    } else if (TanggalJanji == '28') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_28'))

        WebUI.delay(1)
    } else if (TanggalJanji == '29') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_29'))

        WebUI.delay(1)
    } else if (TanggalJanji == '30') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/Tanggal/button_30'))

        WebUI.delay(1)
    } else if (TanggalJanji == '31') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    }
}

WebUI.delay(1)

WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/pilih jam'))

WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/button_Lanjut'))

WebUI.delay(1)

if (Reservasi == 'Orang lain') {
    WebUI.delay(1)

    WebUI.setText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input_nama lengkap'), 
        NamaLengkap)

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input__date'))

    WebUI.setText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input tanggal lahir'), 
        TanggalLahir)

    WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/klik tanggal lahir'))

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input__month'))

    WebUI.setText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input bulan lahir'), 
        BulanLahir)

    WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/pilih bulan lahir'))

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input__year'))

    WebUI.setText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input_tahun lahir'), 
        TahunLahir)

    WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/pilih tahun lahir'))

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input__email'), 
        Email)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input_land Islands_telephone'), 
        NoHP)

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/button_Lanjut_1'))

    WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/saya menyatakan'))

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/button_Konfirmasi'))

    WebUI.waitForElementNotVisible(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/modal/modal popup'), 
        5)

    WebUI.scrollToPosition(0, 999999)

    CekEmailSMS = WebUI.getText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/cek email-sms'))

    println('Silahkan : ' + CekEmailSMS)

    not_run: WebUI.callTestCase(findTestCase('Pre-regis OPD (pending)/Call Center OPD'), [('Username') : Username, ('Password') : Password
            , ('NamaRSCC') : NamaRSCC, ('TanggalCC') : TanggalCC, ('NamaLengkap') : NamaLengkap, ('NamaDokter') : NamaDokter
            , ('Reservasi') : Reservasi, ('PernahBerobat') : PernahBerobat], FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(3)
} else if (Reservasi == 'Diri Sendiri') {
    WebUI.delay(1)

    WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/reservasi diri sendiri'))

    WebUI.delay(1)

    if (PernahBerobat == 'Pernah') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/pernah berobat'))

        WebUI.delay(1)

        WebUI.scrollToElement(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/pernah berobat'), 
            30)

        WebUI.delay(1)

        WebUI.setText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input_nama lengkap'), 
            NamaLengkap)

        WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input__date'))

        WebUI.setText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input tanggal lahir'), 
            TanggalLahir)

        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/klik tanggal lahir sendiri-pernah'))

        WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input__month'))

        WebUI.setText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input bulan lahir'), 
            BulanLahir)

        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/klik bulan lahir sendiri-pernah'))

        WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input__year'))

        WebUI.setText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input_tahun lahir'), 
            TahunLahir)

        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/klik tahun lahir sendiri-pernah'))

        WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input__email'), 
            Email)

        WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input_land Islands_telephone'), 
            NoHP)

        WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/button_Lanjut_1'))

        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/saya menyatakan'))

        WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/button_Konfirmasi'))

        WebUI.waitForElementNotVisible(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/modal/modal popup'), 
            15)

        WebUI.scrollToPosition(0, 999999)

        CekEmailSMS = WebUI.getText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/cek email-sms'))

        println('Silahkan : ' + CekEmailSMS)

        not_run: WebUI.callTestCase(findTestCase('Pre-regis OPD (pending)/Call Center OPD'), [('Username') : Username, ('Password') : Password
                , ('NamaRSCC') : NamaRSCC, ('TanggalCC') : TanggalCC, ('NamaLengkap') : NamaLengkap, ('NamaDokter') : NamaDokter
                , ('Reservasi') : Reservasi, ('PernahBerobat') : PernahBerobat], FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(3)

        WebUI.closeBrowser()
    }
    
    WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/identitas/klik kartu identitas'))

    WebUI.delay(1)

    if (Identitas == 'KTP') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/identitas/KTP'))

        WebUI.delay(1)
    } else if (Identitas == 'KITAP') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/identitas/KITAP'))

        WebUI.delay(1)
    } else if (Identitas == 'KITAS') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/identitas/KITAS'))

        WebUI.delay(1)
    } else if (Identitas == 'SIM') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/identitas/SIM'))

        WebUI.delay(1)
    }
    
    WebUI.setText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/identitas/input__identitas'), 
        NoIdentitas)

    WebUI.delay(1)

    WebUI.uploadFile(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/identitas/button_unggah kartu identitas'), 
        'D:\\MySiloam\\Upload foto\\download.jpg')

    WebUI.delay(1)

    WebUI.scrollToElement(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/identitas/button_unggah kartu identitas'), 
        30)

    WebUI.setText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input_nama lengkap'), 
        NamaLengkap)

    WebUI.delay(1)

    WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/pilih jenis kelamin'))

    if (JenisKelamin == 'Pria') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/pria'))

        WebUI.delay(1)
    } else {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/wanita'))

        WebUI.delay(1)
    }
    
    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input__date'))

    WebUI.setText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input tanggal pernah'), 
        TanggalLahir)

    WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/klik tanggal sendiri-tidak'))

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input__month'))

    WebUI.setText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input bulan lahir'), 
        BulanLahir)

    WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/pilih bulan sendiri-tidak'))

    WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input__year'))

    WebUI.setText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input_tahun lahir'), 
        TahunLahir)

    WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/pilih tahun sendiri-tidak'))

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input__email'), 
        Email)

    WebUI.delay(1)

    WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input_land Islands_telephone'), 
        NoHP)

    WebUI.delay(1)

    WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/button_Lanjut dirisendiri'))

    WebUI.waitForElementVisible(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/modal/modal popup'), 
        30)

    WebUI.scrollToElement(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/modal/saya menyatakan dirisendiri-tidak pernah'), 
        30)

    WebUI.delay(1)

    WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/modal/saya menyatakan dirisendiri-tidak pernah'))

    WebUI.delay(1)

    if (KonfirmasiData == 'Konfirmasi') {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/modal/button_Konfirmasi'))

        WebUI.delay(3)
    } else {
        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/modal/button_Konfirmasi  isi form pasien baru'))

        WebUI.delay(3)

        WebUI.waitForElementVisible(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input_Status Pernikahan_marital_status'), 
            30)

        WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input_Status Pernikahan_marital_status'))

        if (StatusPernikahanKF == 'DUDA') {
            WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/div_DUDA'))

            WebUI.delay(1)
        } else if (StatusPernikahanKF == 'JANDA') {
            WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/div_JANDA'))

            WebUI.delay(1)
        } else if (StatusPernikahanKF == 'KAWIN') {
            WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/div_KAWIN'))

            WebUI.delay(1)
        } else if (StatusPernikahanKF == 'LAJANG') {
            WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/div_LAJANG'))

            WebUI.delay(1)
        }
        
        WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input_Agama_rel'))

        if (AgamaKF == 'Budha') {
            WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/div_BUDHA'))

            WebUI.delay(1)
        } else if (AgamaKF == 'Hindu') {
            WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/div_HINDU'))

            WebUI.delay(1)
        } else if (AgamaKF == 'Islam') {
            WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/div_ISLAM'))

            WebUI.delay(1)
        } else if (AgamaKF == 'Katolik') {
            WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/div_KATOLIK'))

            WebUI.delay(1)
        } else if (AgamaKF == 'Kristen') {
            WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/div_KRISTEN'))

            WebUI.delay(1)
        } else if (AgamaKF == 'Konghucu') {
            WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/div_KONGHUCU'))

            WebUI.delay(1)
        } else {
            WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/div_LAIN-LAIN'))

            WebUI.delay(1)
        }
        
        WebUI.delay(2)

        WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input_Alamat_address'), 
            AlamatKF)

        WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input_KabupatenKota_city'))

        WebUI.setText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input kabupatenKF'), 
            KabupatenKF)

        WebUI.delay(3)

        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/kabupatenkf'))

        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input_Kecamatan_district'))

        WebUI.setText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input kecamatankf'), 
            KecamatanKF)

        WebUI.delay(3)

        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/kecamatankf'))

        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input_Kelurahan_sub_district'))

        WebUI.setText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input kelurahankf'), 
            KelurahanKF)

        WebUI.delay(3)

        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/kelurahankf'))

        WebUI.click(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input__emergency_contact_name'))

        WebUI.setText(findTestObject('Object Repository/Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/input__emergency_contact_name'), 
            KeluargaDaruratKF)

        WebUI.setText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/no hp kerabatkf'), 
            NoDaruratKF)

        WebUI.delay(2)

        WebUI.click(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/button savekf'))

        WebUI.waitForElementVisible(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/popup modalkf'), 
            30)

        DataBerhasilKF = WebUI.getText(findTestObject('Pre-regist OPD/Page_Buat Janji Dengan Dr. dr. John C. P. B_f26caf/terimakasihkf'))

        println('Silahkan : ' + DataBerhasilKF)

        WebUI.delay(5)

        not_run: WebUI.callTestCase(findTestCase('Pre-regis OPD (pending)/FO OPD'), [('NamaLengkap') : NamaLengkap, ('TanggalFO') : TanggalFO
                , ('Username') : Username, ('Password') : Password, ('TglLahirFO') : TglLahirFO, ('NamaPasanganFO') : NamaPasanganFO
                , ('NamaAyahFO') : NamaAyahFO, ('NamaIbuFO') : NamaIbuFO, ('TittleFO') : TittleFO, ('StatusFO') : StatusFO
                , ('JenisKelaminFO') : JenisKelaminFO, ('TmptLahirKotaFO') : TmptLahirKotaFO, ('GolDarahFO') : GolDarahFO
                , ('AgamaFO') : AgamaFO, ('NoteFO') : NoteFO, ('AlamatFO') : AlamatFO, ('NoHP1FO') : NoHP1FO, ('NoHP2FO') : NoHP2FO
                , ('AlergiFO') : AlergiFO, ('KodeposFO') : KodeposFO, ('IdentitasFO') : IdentitasFO, ('NoIdentitasFO') : NoIdentitasFO
                , ('AlamatPermanenFO') : AlamatPermanenFO, ('NamaDaruratFO') : NamaDaruratFO, ('Email') : Email, ('ReservasiFO') : ReservasiFO
                , ('PernahBerobatFO') : PernahBerobatFO], FailureHandling.STOP_ON_FAILURE)
    }
    
    WebUI.delay(5)
}

