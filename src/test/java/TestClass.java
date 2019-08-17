import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
public static void main(String[]args){
    System.setProperty("webdriver.chrome.driver","C:\\selenium\\crome\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://www.facebook.com");
    driver.findElement(By.id("email")).sendKeys("vpusewwandi@gmail.com");
    driver.findElement(By.id("pass")).sendKeys("uresha");
    driver.findElement(By.id("loginbutton")).click();
    System.out.println("logged in successfully");
    driver.get("https://www.google.lk/");
    driver.findElement(By.name("q")).sendKeys("Selenium");
    driver.findElement(By.id("btnK")).click();




}
}
