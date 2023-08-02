import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page_docs_for-oss-contributors_how-to%20contribute-to-daily-dev'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/docs/for-oss-contributors/how-to%20contribute-to-daily-dev')

'step 2: Add visual checkpoint at Page_docs_for-oss-contributors_how-to%20contribute-to-daily-dev'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00015_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
