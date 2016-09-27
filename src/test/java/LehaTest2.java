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
        driver.findElement(By.id("index_email")).sendKeys("");
        driver.findElement(By.id("index_pass")).sendKeys("");
        driver.findElement(By.xpath("//button[@id='index_login_button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='l_msg']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='nim-dialog--name-w _im_dialog_name']/span"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='im_editable0']"))).sendKeys("Леха написал автотест");
        driver.findElement(By.xpath("//button[@class='flat_button fl_r _im_send']")).click();
          }

}
