package commonfunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import utils.Screenshotlistener;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Screenshotlistener.class)
public class CommonFunctions {
	public static	Properties properties;
	public static WebDriver driver;
	public static Logger log;
	public Properties loadPropertyFile()  { 
		try {
			FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
			properties = new Properties();
			properties.load(fis);
		} 
		catch (IOException e) {
			log.info("Unable to load properties file");
		}
		return properties;
	}

	public void browserSetup(String browser) {

		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}

	@BeforeSuite
	public void setUp()  {

		loadPropertyFile();
		log = LogManager.getLogger(CommonFunctions.class);
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		log.info("Initiating the Browser");
		browserSetup(browser);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


	}
	@AfterSuite
	public void tearDown() {
		log.info("Quiting the Browser");
		driver.quit();

	}


}
