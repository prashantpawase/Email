import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by edn on 27/5/17.
 */
public class MailDelete
{




    public static void main(String args[]) throws InterruptedException {

/*
        System.setProperty("webdriver.chrome.driver", "/home/edn/Git-Repo/External-Jars/chromedriver");
        WebDriver driver = new ChromeDriver();*/

WebDriver driver = new FirefoxDriver();

       driver.navigate().to("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
Thread.sleep(1000);

        WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("edunuts.testing@gmail.com");

        Thread.sleep(1000);

        WebElement Nxt1 = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
        Nxt1.click();

Thread.sleep(1000);

        WebElement pass= driver.findElement(By.xpath("//input[@type='password']"));
        pass.sendKeys("edunuts1");


        WebElement Nxt2 = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
        Nxt2.click();

        WebElement social = driver.findElement(By.xpath(".//*[@id=':2o']"));
        social.click();


        Thread.sleep(1000);


        List<WebElement> col = driver.findElements(By.xpath("//*[@class='yW']/span"));
        for(int c=0;c<col.size();c=c+1)
        {

     //       WebElement c1 = driver.findElement(By.xpath("//span[@dir='ltr']"));
            WebElement c1 = driver.findElement(By.xpath("//div[@class='T-Jo-auh']"));
            c1.click();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            Thread.sleep(1000);

            WebElement c2 = driver.findElement(By.xpath("//div[@aria-label='Delete']"));
            c2.click();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


            Thread.sleep(1000);

            driver.findElement(By.xpath(".//*[@id=':2t']/div[1]/span/div")).click();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            Thread.sleep(1000);
        }



        }
}
