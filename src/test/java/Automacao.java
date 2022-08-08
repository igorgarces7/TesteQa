import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automacao {

    @Test
    public void pesquisarGoogle(){
        System.setProperty("webdriver.chrome.driver", "src/drive/chromedriver");
        WebDriver navegar = new ChromeDriver();

        navegar.get("https://www.saucedemo.com");
        navegar.findElement(By.xpath("//*[@id=\"user-name\"]")).click();
        navegar.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        navegar.findElement(By.xpath("//*[@id=\"password\"]")).click();
        navegar.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        navegar.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        navegar.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")).click();
        navegar.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]")).click();
        navegar.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
        navegar.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
        navegar.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        navegar.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        navegar.findElement(By.xpath("//*[@id=\"first-name\"]")).click();
        navegar.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Igor");
        navegar.findElement(By.xpath("//*[@id=\"last-name\"]")).click();
        navegar.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Amorim");
        navegar.findElement(By.xpath("//*[@id=\"postal-code\"]")).click();
        navegar.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("13142-368");
        navegar.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        navegar.findElement(By.xpath("//*[@id=\"finish\"]")).click();



    }
}
