import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by kocksoccer on 19.09.2016.
 */

public class LehaTest2 {

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);
    Properties p = new Properties();

    @Test

    public void test1() throws Exception {
        FileInputStream input = new FileInputStream("C:\\config.propirties");
        p.load(input);
        driver.get("https://vk.com/");
        driver.findElement(By.id("index_email")).sendKeys(p.getProperty("email"));
        driver.findElement(By.id("index_pass")).sendKeys(p.getProperty("password"));
        driver.findElement(By.id("index_login_button")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("l_fr"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("s_search"))).sendKeys("Фролов Владимир");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/vf_adc']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("profile_message_send"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("mail_box_editable"))).sendKeys("Леха пишет автотест с использованием properties");
        driver.findElement(By.id("mail_box_send")).click();
          }

}
