package Test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static driver.driverFactory.getFirefoxDriver;

@Test
public class TestCase1 {
    public static void TestCase1() {
        WebDriver driver = driverFactory.getFirefoxDriver();
        try {

            // Bước 1: Truy cập trang web hoabanfood.com
            driver.get("https://hoabanfood.com/");

            // Bước 2: Nhấp vào SẢN PHẨM
            WebElement productMenu = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div/div[1]/ul/div/ul/li[2]/a"));
            productMenu.click();


            // Bước 3: Chọn vào sortby và sắp xếp theo "Mới nhất"
            WebElement dropdown = driver.findElement(By.cssSelector("#wrapper > div > div > div:nth-child(2) > form > select"));
            Select select= new Select(dropdown);
            select.selectByVisibleText("Mới nhất");


            // Đóng trình duyệt
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}