/*
Test Steps:
1. Go to https://hoabanfood.com/
2. Click on �SẢN PHẨM� menu
3. In mobile products list , click on �Add To Compare� for 2 mobiles (Sony Xperia & Iphone)
4. Click on �COMPARE� button. A popup window opens
5. Verify the pop-up window and check that the products are reflected in it
Heading "COMPARE PRODUCTS" with selected products in it.
6. Close the Popup Windows
*/

package test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

@Test

public class TC04 {
    public static void TC04() {
        WebDriver driver = driverFactory.getEdgeDriver();
        try {

            // Bước 1: Truy cập trang web hoabanfood.com
            driver.get("https://hoabanfood.com/");

            // Bước 2: Nhấp vào SẢN PHẨM
            WebElement productLink = driver.findElement(By.linkText("SẢN PHẨM"));
            productLink.click();

            // Bước 3: Chọn sản phẩm
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")).click();


            // Đóng trình duyệt
            driver.quit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
