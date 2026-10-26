package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SignUpTest {



    //4 Убедиться что отображается title SignUp

    @Test
    public void checkZipCodeInputWithValidData() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("11111");
        WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();
        WebElement signUpForm = driver.findElement(By.cssSelector(".yellow_bg"));


        assertTrue(signUpForm.isDisplayed());

        driver.quit();
    }

    @Test
    public void checkSigUpFormWithValidData() {

        WebDriver driver = new ChromeDriver();

        driver.findElement(By.name("")).sendKeys("");
        driver.findElement(By.name("")).sendKeys("");
        driver.findElement(By.name("")).sendKeys("");
        driver.findElement(By.name("")).sendKeys("");
        driver.findElement(By.name("")).sendKeys("");
        driver.findElement(By.name("")).sendKeys("");
        driver.findElement(By.xpath("")).click();

        assertEquals("" , "");

        driver.quit();
    }


}
