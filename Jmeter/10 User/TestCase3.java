package Test;
import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class TestCase3 {
    // Khởi tạo WebDriver
    public static void TestCase3(){
        WebDriver driver = driverFactory.getFirefoxDriver();
        try {

            // Mở trang web HoaBanFood
            driver.get("https://hoabanfood.com/");

            // Nhấp vào "SẢN PHẨM"
            WebElement sanPhamLink = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div/div[1]/ul/div/ul/li[2]/a"));
            sanPhamLink.click();

            // Nhấp vào sản phẩm "THỊT TRÂU GÁC BẾP"
            WebElement thitTrauGacBep = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[5]/div[1]/div/div[2]"));
            thitTrauGacBep.click();

            // Nhấp chọn sp(500gram ( 1 túi)) sau đó "THÊM VÀO GIỎ HÀNG"
            driver.findElement(By.cssSelector("li[title='500gram (01 túi)']")).click();
            WebElement themVaoGioHang = driver.findElement(By.cssSelector(".single_add_to_cart_button"));
            themVaoGioHang.click();

            //Nhấp vào giỏ hàng và Thay đổi số lượng sản phẩm thành 1000
            driver.findElement(By.cssSelector("a[class='header-cart-link is-small'] span[class='header-cart-title']")).click();
            WebElement soLuong = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/input[2]"));
            soLuong.clear();
            soLuong.sendKeys("1000");

            // Đợi cho trang web cập nhật giỏ hàng
            Thread.sleep(2000);

            // Đóng trình duyệt
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }}
