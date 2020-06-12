package Basic;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
public class Base {
    public WebDriver driver;
    @Before
    public void setup(){

        String pathToChromeDriver = "src/test/java/driver/chromedriver";
        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);

        driver = new ChromeDriver();

    }
    @After
    public void teardown(){
        driver.close();
    }
}
