package Common_method;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class Baseclass {
    public static WebDriver driver;
    String Browser_name;
    public Properties Prop_file;

    public WebDriver Driver_IntializationBack() throws Throwable {
        Prop_file = new Properties();
        FileInputStream FIS = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\smsapptest\\src\\main\\resources\\getdata.properties");

        Prop_file.load(FIS);

        Browser_name = Prop_file.getProperty("Browsername");

        System.out.println(Browser_name);

        if (Browser_name.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
            ChromeOptions co = new ChromeOptions();
            co.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
            driver = new ChromeDriver(co);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } else if (Browser_name.equalsIgnoreCase("IE")) {
            // System.setProperty("webdriver.edge.driver",
            // "C:\\\\edgedriver_win64\\\\msedgedriver.exe");
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }

        return driver;
    }

    public String getscreenshot(String testCaseName, WebDriver driver) throws IOException {
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String filePath = System.getProperty("user.dir") + File.separator + "reports" + File.separator + testCaseName + ".png";
        File file = new File(filePath);
        FileUtils.copyFile(source, file);
        return filePath;
    }
    
    @AfterMethod(alwaysRun=true)
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            try {
                String testCaseName = result.getName();
                String screenshotPath = getscreenshot(testCaseName, driver);
                System.out.println("Screenshot captured for test case: " + testCaseName);
            } catch (Exception e) {
                System.out.println("Exception while taking screenshot: " + e.getMessage());
            }
        }
    }

    public void onTestskipped(ITestResult result) {
       
    }

    public void onTestfailedbutwithsuccesspercentage(ITestResult result) {
        
    }

    public void onstart(ITestResult result) {
        
    }
}

