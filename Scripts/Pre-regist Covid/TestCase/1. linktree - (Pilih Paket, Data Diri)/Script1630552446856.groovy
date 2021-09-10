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

WebUI.navigateToUrl('https://mysiloam-api-staging.siloamhospitals.com/linktree/')

WebUI.waitForElementVisible(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/div_Select'), 
    120)

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/div_Select'))

WebUI.delay(2)

WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Select_react-select-2-input'), 
    NamaRS)

WebUI.delay(2)

WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Pilih RS'))

WebUI.delay(2)

if (Kendaraan == 'nonDT') {
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Pilih NonDT'))

    WebUI.delay(1)
} else {
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Pilih DT'))

    WebUI.delay(1)
}

WebUI.waitForElementVisible(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Rapid Test Serology'), 
    30)

WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Rapid Test Serology'))

WebUI.delay(2)

WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/button_Pilih'))

WebUI.waitForElementVisible(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Nama Lengkap(Sesuai ID)_name'), 
    30)

WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Nama Lengkap(Sesuai ID)_name'), 
    NamaSID)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Tanggal Kunjungan_appointment_date'), 
    30)

WebUI.delay(2)

WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Nomor Handphone_form-control'))

WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Nomor Handphone_form-control'), 
    NoHP)

WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Alamat Email_email'))

WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Alamat Email_email'), 
    Email)

WebUI.delay(1)

WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Tanggal Kunjungan_appointment_date'))

'update per bulan\r\n'
if (TanggalKunjungan != '0') {
    if (TanggalKunjungan == '1') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '2') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '3') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Tanggal September/button_3'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '4') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Tanggal September/button_4'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '5') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Tanggal September/button_5'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '6') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Tanggal September/button_6'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '7') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Tanggal September/button_7'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '8') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Tanggal September/button_8'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '9') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Tanggal September/button_9'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '10') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Tanggal September/button_10'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '11') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '12') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Tanggal September/button_12'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '13') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Tanggal September/button_13'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '14') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Tanggal September/button_14'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '15') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Tanggal September/button_15'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '16') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Tanggal September/button_16'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '17') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '18') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '19') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '20') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '21') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '22') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '23') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '24') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '25') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '26') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '27') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '28') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '29') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '30') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    } else if (TanggalKunjungan == '31') {
        WebUI.click(findTestObject('null'))

        WebUI.delay(1)
    }
}

WebUI.delay(1)

WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/span_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/WaktuKunjungan'))

WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/sementara'))

WebUI.delay(1)

if (CaraPembayaran == 'Jaminan') {
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Cara Pembayaran'))

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Jaminan'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Nama PenjaminPerusahaan_payer'))

    WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Nama PenjaminPerusahaan_payer'), 
        NamaPenjamin)

    WebUI.delay(2)

    WebUI.uploadFile(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Upload surat jaminan'), 
        'D:\\MySiloam\\Upload foto\\download.jpg')

    WebUI.delay(2)
}

if (PernahBerobat == 'Tidak') {
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/TidakpernahBerobat'))

    WebUI.delay(1)
} else {
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Pernahberobat'))

    WebUI.delay(1)
}

WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/span_Data pasien sama dengan data pemesan'))

WebUI.delay(2)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Nomor Kartu Identitas_identity_number'), 
    30)

WebUI.delay(1)

WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Kartu identitas'))

if (Identitas == 'KTP') {
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/identitas_KTP'))

    WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Nomor Kartu Identitas_identity_number'), 
        NoIdentitas)
} else if (Identitas == 'KITAP') {
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/identitas_KITAP'))

    WebUI.setText(findTestObject('Object Repository/Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Nomor Kartu Identitas_identity_number'), 
        NoIdentitas)
} else if (Identitas == 'KITAS') {
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/identitas_KITAS'))

    WebUI.setText(findTestObject('Object Repository/Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Nomor Kartu Identitas_identity_number'), 
        NoIdentitas)
} else {
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/identitas_Passport'))

    WebUI.setText(findTestObject('Object Repository/Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Nomor Kartu Identitas_identity_number'), 
        NoIdentitas)
}

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/upload foto katru identitas'), 
    'D:\\MySiloam\\Upload foto\\download.jpg')

WebUI.delay(2)

if (PernahBerobat == 'Tidak') {
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Jenis kelamin'))

    if (JenisKelamin == 'Pria') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Pria'))

        WebUI.delay(1)
    } else {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/wanita'))

        WebUI.delay(1)
    }
    
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Tanggal Lahir'))

    WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Tanggal Lahir'), 
        TanggalLahir)

    WebUI.delay(1)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/status'))

    if (Status == 'Lajang') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Statuskwn/LAJANG'))

        WebUI.delay(1)
    } else if (Status == 'Duda') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Statuskwn/DUDA'))

        WebUI.delay(1)
    } else if (Status == 'Janda') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Statuskwn/JANDA'))

        WebUI.delay(1)
    } else {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Statuskwn/KAWIN'))

        WebUI.delay(1)
    }
    
    WebUI.delay(2)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/agama'))

    if (Agama == 'Budha') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/AgamaFR/li_BUDHA'))

        WebUI.delay(1)
    } else if (Agama == 'Hindu') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/AgamaFR/li_HINDU'))

        WebUI.delay(1)
    } else if (Agama == 'Islam') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/AgamaFR/li_ISLAM'))

        WebUI.delay(1)
    } else if (Agama == 'Katolik') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/AgamaFR/li_KATOLIK'))

        WebUI.delay(1)
    } else if (Agama == 'Kristen') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/AgamaFR/li_KRISTEN'))

        WebUI.delay(1)
    } else if (Agama == 'Konghucu') {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/AgamaFR/li_KONGHUCU'))

        WebUI.delay(1)
    } else {
        WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/AgamaFR/li_LAIN-LAIN'))

        WebUI.delay(1)
    }
    
    WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/textarea_alamat'), Alamat)

    WebUI.delay(1)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/klik kota'))

    WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input kota'), Kota)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/pilih Kota'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/klik kecamatan'))

    WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Kecamatan'), Kecamatan, 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/pilih kecamatan'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/klik kelurahan'))

    WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Kelurahan_sub'), 
        Kelurahan)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/pilih kelurahan'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Nama Keluarga_emergency'), 
        KeluargaDarurat)

    WebUI.delay(1)

    WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Nama Keluarga_form-control'), 
        NoDarurat)

    WebUI.delay(1)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Nama Keluarga_agreeToTerms'))

    WebUI.scrollToPosition(9999999, 9999999)

    WebUI.delay(1)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/button_Lanjut data diri'))
} else {
    WebUI.delay(1)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Tanggal Lahir'))

    WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Tanggal Lahir'), 
        TanggalLahir)

    WebUI.delay(1)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Nama Keluarga_agreeToTerms'))

    WebUI.scrollToPosition(9999999, 9999999)

    WebUI.delay(1)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/button_Lanjut data diri'))
}

not_run: WebUI.delay(2)

not_run: WebUI.waitForElementVisible(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/tujuan pemeriksaan'), 
    30)

not_run: WebUI.delay(1)

not_run: WebUI.scrollToElement(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/tujuan pemeriksaan'), 
    20)

not_run: if (TujuanPemeriksaan == 'Rencana tindakan') {
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

not_run: WebUI.delay(1)

not_run: WebUI.scrollToElement(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Pekerjaan_occupation'), 
    30)

not_run: WebUI.waitForElementVisible(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Pekerjaan_occupation'), 
    30)

not_run: WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Pekerjaan_occupation'), 
    Pekerjaan)

not_run: WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Nama Orang Tua_parent_name'), 
    Namaortu)

not_run: WebUI.delay(1)

not_run: if (PernahBerobat == 'Pernah') {
    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/klik provinsi pernah'))

    WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input provinsi pernah'), 
        Provinsi)

    WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Pilih provinsi'))

    WebUI.delay(1)
}

not_run: WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Klik provinsi'))

not_run: WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_Provinsi_state_id'), 
    Provinsi)

not_run: WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Pilih provinsi'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_RT_rt_number'), 
    RT)

not_run: WebUI.setText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/input_RW_rw_number'), 
    RW)

not_run: WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Pertanyaan pemeriksaan/Pertanyaan 1 Tidak'))

not_run: WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Pertanyaan pemeriksaan/Pertanyaan 2 Tidak'))

not_run: WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Pertanyaan pemeriksaan/Pertanyaan 3 Tidak'))

not_run: WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/Pertanyaan pemeriksaan/Pertanyaan 4 Tidak'))

not_run: WebUI.scrollToPosition(9999999, 9999999)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/button_lanjut PE form'))

not_run: WebUI.delay(1)

not_run: WebUI.waitForElementVisible(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/header pembayaran'), 
    120)

not_run: WebUI.scrollToPosition(9999999, 9999999)

not_run: WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/isAgree'))

not_run: WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/isConsent'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/button_Kirim'))

not_run: WebUI.waitForElementVisible(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/terima kasih'), 
    120)

not_run: WebUI.delay(3)

not_run: KodeBooking = WebUI.getText(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/kode booking'))

not_run: println('Kode Booking : ' + KodeBooking)

not_run: WebUI.delay(5)

not_run: WebUI.navigateToUrl('http://10.85.139.100:5678/pre-registration')

not_run: WebUI.waitForElementVisible(findTestObject('Pre-regist Covid/Front Office OPD/Button login FO'), 30)

not_run: WebUI.delay(2)

'Username\r\n'
not_run: WebUI.setText(findTestObject('Pre-regist Covid/Front Office OPD/input username FO'), Username)

'Password\r\n'
not_run: WebUI.setText(findTestObject('Pre-regist Covid/Front Office OPD/input password FO'), Password)

not_run: WebUI.click(findTestObject('Pre-regist Covid/Front Office OPD/Button login FO'))

not_run: WebUI.delay(2)

not_run: WebUI.waitForPageLoad(30, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.waitForElementVisible(findTestObject('Pre-regist Covid/Front Office OPD/delete tanggal'), 120)

not_run: WebUI.click(findTestObject('Pre-regist Covid/Front Office OPD/delete tanggal'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Pre-regist Covid/Front Office OPD/input tanggak'), TanggalFO)

not_run: WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Pre-regist Covid/Front Office OPD/input kode booking'), KodeBooking)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Pre-regist Covid/linktree/Page_Siloam Hospitals Registration Form/confrim kode booking'))

not_run: WebUI.delay(5)

