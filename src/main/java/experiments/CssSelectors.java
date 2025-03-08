package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectors {
    WebDriver driver= new ChromeDriver();

    @Test
    public void selectorsHomePage(){
      // driver.navigate().to("https://demoga.com/");//
        //driver.navigate().back(); -----ходить туда сюда
        driver.get("https://demoga.com/");
        driver.manage().window().maximize();
        pause(10);

        //driver.manage().window().maximize();   //----откивает окно полнлстью
        hideBanner();
        hideFooter();

         pause(3);
        WebElement imgTools = driver.findElement(By.cssSelector("img[src='/images/Toolsqa.jpg']"));
      //  WebElement imgTools = driver.findElement(By.cssSelector("img[src='/images/Toolsqa.jpg']"));
        System.out.println(imgTools.getTagName());
        System.out.println(imgTools.getAttribute("src"));

        WebElement footer  = driver.findElement(By.tagName("footer"));
        WebElement driverElement  = driver.findElement(By.tagName(".card-up"));
        driverElement.click();





       // driver.close();  ----сворачевает окно
         driver.quit();//-----сворачевает  браузер

    }
    public void pause(int time){
        try {
            Thread.sleep(555);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void hideBanner(){
        JavascriptExecutor js =(JavascriptExecutor)  driver;
        js.executeScript("document.querySelector('#fixedban').style.display='none'");
    }
    public void hideFooter(){
        JavascriptExecutor js =(JavascriptExecutor)  driver;
        js.executeScript("document.querySelector('footer').style.display='none'");

        }


}
