import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

/**
 * Created by kocksoccer on 19.09.2016.
 */
public class LehaTest2 {

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);


    @Test

    public void test1() throws Exception {

        driver.get("https://vk.com/");
        driver.findElement(By.id("index_email")).sendKeys("electroalex2009@yandex.ru");
        driver.findElement(By.id("index_pass")).sendKeys("19911991010679");
        driver.findElement(By.id("index_login_button")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("l_fr"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("s_search"))).sendKeys("Фролов Владимир");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/vf_adc']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("profile_message_send"))).click();
        driver.findElement(By.id("mail_box_editable")).sendKeys("Леха пишет новый автотест");
        driver.findElement(By.id("mail_box_send")).click();
          }

}