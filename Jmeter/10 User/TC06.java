/* Verify user is able to purchase product using registered email id(USE CHROME BROWSER)
Test Steps:
1. Go to http://live.techpanda.org/
2. Click on my account link
3. Login in application using previously created credential
4. Click on MY WISHLIST link
5. In next page, Click ADD TO CART link
6. Enter general shipping country, state/province and zip for the shipping cost estimate
7. Click Estimate
8. Verify Shipping cost generated
9. Select Shipping Cost, Update Total
10. Verify shipping cost is added to total
11. Click "Proceed to Checkout"
12a. Enter Billing Information, and click Continue
12b. Enter Shipping Information, and click Continue
13. In Shipping Method, Click Continue
14. In Payment Information select 'Check/Money Order' radio button. Click Continue
15. Click 'PLACE ORDER' button
16. Verify Oder is generated. Note the order number

NOTE: PROCEED TO CHECKOUT (step 6 ) was taken out, so as to allow the Estimate button step to get processed.
Rest of the steps renumbered accordingly.*/
package Test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

@Test
public class TC06 {
    public static void TC06() {
        WebDriver driver = driverFactory.getFirefoxDriver();
        try {

            // Bước 1: Truy cập trang web hoabanfood.com
            driver.get("https://hoabanfood.com/");

            // Bước 2: Nhấp vào ĐĂNG NHẬP
            WebElement productLink = driver.findElement(By.cssSelector("a[class='nav-top-link nav-top-not-logged-in is-small'] span"));
            productLink.click();

            // Bước 3: Chọn đăng nhập
            WebElement LoginEmail= driver.findElement(By.cssSelector("#username"));
            WebElement LoginPass= driver.findElement(By.cssSelector("#password"));
            LoginEmail.sendKeys("nhungoc123@gmail.com");
            LoginPass.sendKeys("nhungoc123");
            driver.findElement(By.cssSelector("button[value='Đăng nhập']")).click();

            // Bước 4: nhấn vào danh sách yêu thích

            // Bước 5: nhấn vào sản phẩm và thêm vào giỏ hàng
            driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div/div[1]/ul/div/ul/li[2]/a")).click();
            // Bước 6: điền thông tin thanh toán
            // Đóng trình duyệt
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
