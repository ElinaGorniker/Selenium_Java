import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchPage {
    public static class searchPage extends BaseTest{

            @Test(dataProvider = "dataProvider")
        public void openYandexInChromeTest1(String text)  throws InterruptedException {

            WebElement SearchField = driver.findElement(By.xpath("//input[@class='search3__input mini-suggest__input']"));
            SearchField.click();
            SearchField.sendKeys(text);
            WebElement SearchButton = driver.findElement(By.xpath("//input[@class='search3__input mini-suggest__input']"));
            SearchButton.sendKeys(Keys.RETURN);
            Thread.sleep(3000);
            WebElement resultRow = driver.findElement(By.xpath("//*[@id=\"search-result\"]/li[1]"));
            assertThat(resultRow.isDisplayed()).as(("Element has not displayed!")).isTrue();
            assertThat(resultRow.getAttribute("class")).as(("Wrong class name")).isEqualTo("serp-item serp-item_card");
            assertThat(resultRow.getText()).as(("Wrong Text")).contains("Пишем автотест с использованием Selenium Webdriver.");


        }


    }
}
