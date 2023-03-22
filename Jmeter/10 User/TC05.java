/* Verify can create an account in e-Commerce site and can share wishlist to other poeple using email.
Test Steps:
1. Go to https://hoabanfood.com/
2. Click on my account link
3. Click Create an Account link and fill New User information except Email ID
4. Click Register
5. Verify Registration is done. Expected account registration done.
6. Go to TV menu
7. Add product in your wish list - use product - LG LCD
8. Click SHARE WISHLIST
9. In next page enter Email and a message and click SHARE WISHLIST
10.Check wishlist is shared. Expected wishlist shared successfully.
*/



package Test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

@Test
public class TC05 {
    public static void TC05() {
        WebDriver driver = driverFactory.getFirefoxDriver();
        try {

            // Bước 1: Truy cập trang web hoabanfood.com
            driver.get("https://hoabanfood.com/");

            // Bước 2: Nhấp vào ĐĂNG KÝ
            WebElement loginLink = driver.findElement(By.cssSelector("a[class='nav-top-link nav-top-not-logged-in is-small'] span"));
            loginLink.click();

            // Bước 3: Chọn đăng kí bằng email
            WebElement email = driver.findElement(By.cssSelector("#reg_email"));
            email.sendKeys("nhungoc123@gmail.com");
            driver.findElement(By.cssSelector("button[value='Đăng ký']")).click();

            // Bước 4: tới trang sản phẩm
            WebElement productLink = driver.findElement(By.cssSelector("#mega-menu-item-71542 > a"));
            productLink.click();

            // Bước 5: Thêm sản phẩm vào danh sách yêu thích


            // Đóng trình duyệt
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
