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
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import java.sql.ResultSet as ResultSet

WebUI.openBrowser('')

'Link URL'
WebUI.navigateToUrl('http://10.85.139.100:8484/checkup')

WebUI.waitForElementVisible(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/button_Login'), 120)

WebUI.maximizeWindow()

WebUI.delay(2)

'Username\r\n'
WebUI.setText(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/input_Username_username'), Username)

WebUI.delay(2)

'Password\r\n'
WebUI.setText(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/input_Password_password'), Password)

WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/button_Login'))

WebUI.delay(2)

WebUI.waitForPageLoad(30, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/button_Add New Group'), 
    10)

WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/button_Add New Group'))

'group name'
WebUI.setText(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/group-name'), GroupName)

WebUI.selectOptionByValue(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/select_group type'), GroupType, 
    true)

WebUI.delay(2)

//services = WebUI.getUrl()
if (Services == 'DT') {
    'drive true'
    WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/input_Services_drive-thru'))
} else {
    WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/input_Services_non-drive-thru'))
}

WebUI.delay(2)

WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/dropdown'))

WebUI.delay(2)

if (Paket == 'Rapid Test') {
    WebUI.scrollToElement(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/paket/Rapid Test'), 120)

    WebUI.delay(2)

    WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/paket/Rapid Test'))
} else if (Paket == 'C19 Molecular Isothermal Test- Untuk 10 orang') {
    WebUI.scrollToElement(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/paket/C19 Molecular Isothermal Test- Untuk 10 orang'), 
        120)

    WebUI.delay(2)

    WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/paket/C19 Molecular Isothermal Test- Untuk 10 orang'))
} else if (Paket == 'Holiday 360 Antigen Antibody') {
    WebUI.scrollToElement(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/paket/Holiday 360 Antigen Antibody'), 
        120)

    WebUI.delay(2)

    WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/paket/Holiday 360 Antigen Antibody'))
} else if (Paket == 'Rapid Test dan Konsultasi Dokter') {
    WebUI.scrollToElement(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/paket/Rapid Test dan Konsultasi Dokter'), 
        120)

    WebUI.delay(2)

    WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/paket/Rapid Test dan Konsultasi Dokter'))
}

WebUI.delay(2)

WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/Body URL'))

WebUI.delay(1)

WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/button_Save'))

WebUI.waitForElementVisible(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/div_OKCancel'), 5)

WebUI.delay(3)

WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/button_Add Schedule'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/select_Hari'), Hari, true)

WebUI.setText(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/input_Quota Appointment'), Appointment)

WebUI.setText(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/input_Quota Non Appointment'), NonAppointment)

WebUI.delay(1)

println(Services)

if (Services == 'nonDT') {
    WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/dropdown_Room'))

    WebUI.waitForElementVisible(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/div_Floor 1 - Bedah - Room 3'), 
        30)

    WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/Input_room'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/Input_room'), Ruangan, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/pilih ruangan'))

    WebUI.delay(1)

    WebUI.selectOptionByValue(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/select_jam mulai'), JamMulai, 
        true)

    WebUI.selectOptionByValue(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/select_menit mulai'), 
        MenitMulai, true)

    WebUI.selectOptionByValue(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/select_jam selesai'), 
        JamSelesai, true)

    WebUI.selectOptionByValue(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/select_menit selesai'), 
        MenitSelesai, true)

    WebUI.delay(3)

    WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/Input_Effective from'))

    WebUI.setText(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/Input_Effective from'), DariTanggal)

    WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/Input_Effective to'))

    WebUI.setText(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/Input_Effective to'), KeTanggal)

    WebUI.delay(3)

    /*'Insert tanggal aplikasi'
CustomKeywords.'connection.data_table.connectDB'('10.85.139.12', '5432', 'MySiloam - DEV/UAT', 'postgres', 'p455*w0rd')

ResultSet getDateDual = CustomKeywords.'connection.data_table.GetSysdateReceive'()

while (getDateDual.next()) {
    tgl = getDateDual.getDate('SYSDATE')

    DateFormat date = new SimpleDateFormat('YYYY-MMM-dd')

    sysdate = date.format(tgl)

    waktu = getDateDual.getTime('SYSDATE')

    tgl_kedatangan = ((sysdate + ' ') + waktu)

    System.out.println('Tanggal Aplikasi adalah ' + tgl_kedatangan)

    WebUI.sendKeys(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/Input_Effective from'), Keys.chord(
            Keys.DELETE))

    WebUI.sendKeys(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/Input_Effective to'), Keys.chord(
            Keys.DELETE))
}*/
    WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/button_save modal' /*'Insert tanggal aplikasi'
CustomKeywords.'connection.data_table.connectDB'('10.85.139.12', '5432', 'MySiloam - DEV/UAT', 'postgres', 'p455*w0rd')

ResultSet getDateDual = CustomKeywords.'connection.data_table.GetSysdateReceive'()

while (getDateDual.next()) {
    tgl = getDateDual.getDate('SYSDATE')

    DateFormat date = new SimpleDateFormat('YYYY-MMM-dd')

    sysdate = date.format(tgl)

    waktu = getDateDual.getTime('SYSDATE')

    tgl_kedatangan = ((sysdate + ' ') + waktu)

    System.out.println('Tanggal Aplikasi adalah ' + tgl_kedatangan)

    WebUI.sendKeys(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/Input_Effective from'), Keys.chord(
            Keys.DELETE))

    WebUI.sendKeys(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/Input_Effective to'), Keys.chord(
            Keys.DELETE))
}*/ ))
} else {
    WebUI.delay(1)

    WebUI.selectOptionByValue(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/select_jam mulai'), JamMulai, 
        true)

    WebUI.selectOptionByValue(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/select_menit mulai'), 
        MenitMulai, true)

    WebUI.selectOptionByValue(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/select_jam selesai'), 
        JamSelesai, true)

    WebUI.selectOptionByValue(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/select_menit selesai'), 
        MenitSelesai, true)

    WebUI.delay(3)

    WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/Input_Effective from'))

    WebUI.setText(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/Input_Effective from'), DariTanggal)

    WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/Input_Effective to'))

    WebUI.setText(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/Input_Effective to'), KeTanggal)

    WebUI.delay(3)

    WebUI.click(findTestObject('Pre-regist Covid/OP Admin/MySiloam OPD Administrator/button_save modal'))
}

WebUI.delay(20)

