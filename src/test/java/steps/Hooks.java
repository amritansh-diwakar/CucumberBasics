package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends BaseUtil {
    private BaseUtil base;

    public Hooks(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void initialize(Scenario scenario) {
        System.out.println("Open Browser");
//        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Webdrivers\\chromedriver.exe");
//        base.driver =  new ChromeDriver();
        System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\Webdrivers\\geckodriver.exe");
//        FirefoxOptions firefoxOptions = new FirefoxOptions();
//        firefoxOptions.setCapability("marionette", true);
        base.driver = new FirefoxDriver();
        base.driver.manage().window().maximize();
        base.driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        System.out.println("Scneario :" + scenario.getName() + " starting");
    }

    @After
    public void teardown() {
        System.out.println("Close Browser");
    }
}