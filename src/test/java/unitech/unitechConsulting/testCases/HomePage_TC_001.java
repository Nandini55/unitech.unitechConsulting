package unitech.unitechConsulting.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import unitech.unitechConsulting.baseClass.BaseClass;
import unitech.unitechConsulting.browserFactory.BrowserFactory;
import unitech.unitechConsulting.pages.HomePage;
import unitech.unitechConsulting.utilities.CommonMethod;
  
public class HomePage_TC_001 extends BaseClass{

	public HomePage_TC_001() {
		super(driver);
	}
 HomePage homepage;
 
 @BeforeTest
 public void setup() {
       driver= BrowserFactory.initiateBrowser();
       logger.info("Browser is getting Initialized in Before Test");
       homepage = PageFactory.initElements(driver, HomePage.class);
       CommonMethod.maximizeBrowser();
       }
 
 @Test
 public void TC_001_clickOnHomeButton_HomePage() {
	logger.info("PSP Tech HomePage Name is Displayed"); 
	CommonMethod.getTitle(driver, "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
	CommonMethod.click(homepage.clickHomePage_1, driver);
 }
 
 @Test
 public void TC_002_discoverMore5_HomePage() {
	 logger.info("Homepage DiscoverMore5 clicked");
	 CommonMethod.click(homepage.clickDiscoverMore_5, driver);
	 CommonMethod.getTitle(driver, "Software Development - PSPTech");
	 CommonMethod.click(homepage.clickHomePage_1, driver);
	 logger.info("Returned to HomePage");	 
 }
 @Test
 public void TC_003_discoverMore1_HomePage() {
    logger.info("Homepage DiscoverMore1 clicked");	 
    CommonMethod.click(homepage.clickDiscoverMore_1, driver);
    CommonMethod.getTitle(driver, "Software Development - PSPTech");
    CommonMethod.click(homepage.clickHomePage_1, driver);
 logger.info("Returned to HomePage");
 }
 @Test
  public void TC_004_appDevelopment_HomePage() {
   logger.info("HomePage AppDevelopment4 clicked");
   CommonMethod.click(homepage.appDevelopment_4, driver);
   CommonMethod.getTitle(driver, "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
 }
@Test
  public void TC_005_websiteDevelopement_HomePage () {
	logger.info("HomePage websiteDevelopment5 clicked");
	CommonMethod.click(homepage.websiteDevelopment_5, driver);
	CommonMethod.getTitle(driver, "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
}
@Test
   public void TC_006_APIIntegreationDevelopment_HomePage() {
	logger.info("HomePage APIIntegrationDevelopment_6 clicked");
	CommonMethod.click(homepage.apiIntegrationDevelopement_6, driver);
	CommonMethod.getTitle(driver, "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
}
@Test
   public void TC_007_webMobileApplication_HomePage() {
	logger.info("HomePage WebApplication_7 clicked");
	CommonMethod.click(homepage.webMobileApplication_7, driver);
	CommonMethod.getTitle(driver, "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
}
@Test
   public void TC_008_SpeedOptimization_HomePage() {
	logger.info("HomePage SpeedOptimization_9 clicked");
	CommonMethod.click(homepage.SpeedOptimization_9, driver);
	CommonMethod.getTitle(driver, "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
}
@Test
   public void TC_009_middleAboutUS_HomePage() {
	logger.info("HomePage middleAboutUs clicked");
	CommonMethod.click(homepage.middleAboutUS, driver);
	CommonMethod.getTitle(driver, "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
}
@Test
   public void TC_010_footerContactUs_HomePage() {
	logger.info("HomePage footerContactUs clicked");
	CommonMethod.click(homepage.footerContactUs_4, driver);
	CommonMethod.getTitle(driver, "Contact Us - PSPTech");
	CommonMethod.click(homepage.clickHomePage_1, driver);
	logger.info("Returned to HomePage");
}




}

