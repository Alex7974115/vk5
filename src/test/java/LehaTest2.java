import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

/**
 * Created by kocksoccer on 19.09.2016.
 */
public class LehaTest2 {

    WebDriver driver = new ChromeDriver();

    @Test

    public void test1() throws Exception {

        driver.get("https://vk.com/");
        driver.findElement(By.xpath("//input[@id='index_email']")).sendKeys("");
        driver.findElement(By.xpath("//input[@id='index_pass']")).sendKeys("");
        driver.findElement(By.xpath("//button[@id='index_login_button']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//li[@id='l_msg']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@data-peer='6897955']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@id='im_editable0']")).sendKeys("Леха написал автотест");
        driver.findElement(By.xpath("//button[@class='flat_button fl_r _im_send']")).click();
          }

}