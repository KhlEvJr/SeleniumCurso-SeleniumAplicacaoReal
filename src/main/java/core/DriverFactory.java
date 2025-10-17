package core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DriverFactory {

    private static WebDriver driver;

    private DriverFactory() {}

    public static WebDriver getDriver() {
        if (driver == null) {

            switch (Propriedades.browser) {
                case Propriedades.Browsers.FIREFOX: // CORRIGIDO
                    driver = new FirefoxDriver();
                    break;
                case Propriedades.Browsers.CHROME: // CORRIGIDO
                    driver = new ChromeDriver();
                    break;

            }
            driver.manage().window().setSize(new Dimension(1920, 1080));
        }
        return driver;
    }

    public static void killDriver(){
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}