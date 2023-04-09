package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";

        // 1. Lunch/Set the Chrome Browser
        WebDriver driver = new ChromeDriver();

        // 2. Open URL
        driver.get(baseUrl);

        // Maximise the Browser
        driver.manage().window().maximize();

        // We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3.Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // 4. Print the current URL
        System.out.println("Current URL :" + driver.getCurrentUrl());

        // 5. Print the page source
        System.out.println("Page Source: " + driver.getPageSource());

        // 6. Enter the email to email field
        driver.findElement(By.id("Email")).sendKeys("prime123@gmail.com");

        // 7. Enter the password to password field
        driver.findElement(By.name("Password")).sendKeys("Prime123");

        // 8. Close the browser
        driver.close();


    }


}
