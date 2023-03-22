package Test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class TestCase2 {
    // Khởi tạo WebDriver
    public static void TestCase2() {
        WebDriver driver = driverFactory.getFirefoxDriver();
        driver.get("https://hoabanfood.com/");
        try {

            // Nhấp vào menu SẢN PHẨM
            driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div/div[1]/ul/div/ul/li[2]/a")).click();

            // Nhấp vào sản phẩm "THỊT TRÂU GÁC BẾP"
            WebElement thitTrauGacBep = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[5]/div[1]/div/div[2]"));
            thitTrauGacBep.click();
            // đọc giá của sản phảm ở trang chi tiết
            String pricedetail =driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/p/span/bdi")).getText();
            // Nhấp chọn sp(500gram ( 1 túi)) sau đó "THÊM VÀO GIỎ HÀNG"
            driver.findElement(By.cssSelector("li[title='500gram (01 túi)']")).click();
            WebElement themVaoGioHang = driver.findElement(By.cssSelector(".single_add_to_cart_button"));
            themVaoGioHang.click();
            //vào giỏ hàng
            driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[1]/div[4]/ul/li[5]/a")).click();
            // So sánh giá của sản phẩm trong trang chi tiết và trang cart
            String pricecart =driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[1]/form/div/table/tbody/tr[1]/td[4]/span/bdi")).getText();
            assertEquals(pricecart, pricedetail);
        } catch (Exception e){
            e.printStackTrace();
            // Đóng trình duyệt sau khi hoàn thành kiểm thử
        }
    }
}