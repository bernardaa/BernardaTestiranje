//FirstTest.java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*****************************************************************************
 * Author: Andrej skeledzija
 * Description: This is the first Selenium TestNG test.
 * It opens automationpractice homepage, login and check is it Sign out btn visible.
 *******************************************************************************/
public class FirstTest {
    //-----------------------------------Global Variables-----------------------------------
    //Declare a Webdriver variable
    public WebDriver driver;
    //Declare a test URL variable
    public String testURL = "https://www.pinkpanda.hr/";

    //-----------------------------------Test Setup-----------------------------------
    @BeforeMethod
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kovac_000\\Downloads\\chromedriver.exe");
        //Create a new ChromeDriver
        driver = new ChromeDriver();
        //Go to www.swtestacademy.com
        driver.navigate().to(testURL);
    }

    @Test
    public void demoPage() throws InterruptedException {
// driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys("pink panda");
        searchTextBox.submit();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3")).click();
        driver.quit();
    }

    @Test
    public void Searching() throws  InterruptedException {
        // driver.manage().window().maximize();
        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys("ruz");
        searchTextBox.submit();
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void AddToCart() throws InterruptedException {
        // driver.manage().window().maximize();
        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys("paleta");
        searchTextBox.submit();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[5]/div[1]/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"product-details\"]/div[2]/div[2]/div/div[2]/div[1]/div[2]/a/span")).click();
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void login () throws InterruptedException {
        driver.findElement(By.xpath("/html/body/header/div[2]/div/div[1]/div[2]/div/ul/li[1]/div[1]")).click();
        WebElement email = driver.findElement(By.xpath("//*[@id=\"login-overlay\"]/div[2]/div/div/div/div[2]/div[1]/form/div/div/div/div[1]/input"));
        email.sendKeys("ime@email.com");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//*[@id=\"login-overlay\"]/div[2]/div/div/div/div[2]/div[1]/form/div/div/div/div[2]/input"));
        password.sendKeys("sifra");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"login-overlay\"]/div[2]/div/div/div/div[2]/div[1]/form/div/div/div/div[3]/div[2]/div[1]/button")).click();
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
        public void kategorija () throws InterruptedException{
        driver.findElement(By.xpath("/html/body/header/div[2]/div/div[2]/div[1]/div/nav/li[1]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/header/div[2]/div/div[2]/div[1]/div/nav/li[2]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/header/div[2]/div/div[2]/div[1]/div/nav/li[3]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/header/div[2]/div/div[2]/div[1]/div/nav/li[4]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/header/div[2]/div/div[2]/div[1]/div/nav/li[5]/a/span")).click();
        Thread.sleep(2000);
     //  driver.quit();
    }
}