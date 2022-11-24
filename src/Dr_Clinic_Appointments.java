import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dr_Clinic_Appointments {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://e-mareez.com/doctor/login");

        driver.manage().window().maximize();

        //-----------------------Mobile No--------------------//
        driver.findElement(By.xpath("//div[@class='flex flex-col m-auto']//input[@placeholder='03XXXXXXXXX']")).sendKeys("03469600178");
        driver.findElement(By.xpath("//div[@class='flex flex-col m-auto']//button[@type='submit'][normalize-space()='Submit']")).click();
        //-----------------------OTP--------------------//
        Thread.sleep(15000);
        driver.findElement(By.xpath("//button[normalize-space()='submit']")).click();
        Thread.sleep(3000);
        //-----------------------Appointments--------------------//
        driver.findElement(By.xpath("//span[normalize-space()='Appointments']")).click();
        Thread.sleep(3000);
        //-----------------------Appointments (Calendar)--------------------//
//        driver.findElement(By.xpath("//button[@aria-label='Choose date, selected date is Nov 24, 2022']//*[name()='svg']")).click();
//        Thread.sleep(3000);
//        Actions calendar = new Actions(driver);
//        calendar.sendKeys(Keys.chord(Keys.RIGHT, Keys.RIGHT, Keys.ENTER)).perform();
//        Thread.sleep(3000);
//        //-----------------------Appointments (Calendar---->Back)--------------------//
//        driver.findElement(By.xpath("//button[@aria-label='Choose date, selected date is Nov 26, 2022']//*[name()='svg']")).click();
//        Thread.sleep(3000);
//        Actions calendar_back = new Actions(driver);
//        calendar_back.sendKeys(Keys.chord(Keys.LEFT, Keys.LEFT, Keys.ENTER)).perform();
//        Thread.sleep(3000);
//        //-----------------------Appointments (Multi CheckBoxes)--------------------//
//        driver.findElement(By.xpath("//div[normalize-space()='Pending']")).click();
//        Thread.sleep(3000);
//        Actions set_day = new Actions(driver);
//        set_day.sendKeys(Keys.chord(Keys.ENTER),Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
//        Thread.sleep(3000);
//        set_day.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
//        Thread.sleep(3000);
//        set_day.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
//        Thread.sleep(3000);
//        set_day.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
//
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//div[@id='menu-']//div[@class='MuiBackdrop-root MuiBackdrop-invisible css-esi9ax']")).click();
//        Thread.sleep(3000);

        //-----------------------Create Appointment--------------------//
        driver.findElement(By.xpath("//button[normalize-space()='Create Appointment']")).click();
        Thread.sleep(3000);
        WebElement patient_name= driver.findElement(By.cssSelector("body > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)"));
        patient_name.sendKeys("Rehan Atif");
        Thread.sleep(3000);
        WebElement phone_name= driver.findElement(By.cssSelector("body > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)"));
        phone_name.sendKeys("03315947601");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@aria-label='Choose date']//*[name()='svg']")).click();
        Thread.sleep(3000);
        Actions choose_date = new Actions(driver);
        choose_date.sendKeys(Keys.chord(Keys.RIGHT, Keys.ENTER)).perform();Thread.sleep(3000);

        driver.findElement(By.xpath("//body[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]")).click();
        Thread.sleep(3000);
        Actions choose_timeslot = new Actions(driver);
        choose_timeslot.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).submit();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//body[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]")).click();
        Thread.sleep(3000);
        Actions choose_slot = new Actions(driver);
        choose_slot.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();

        //-----------------------Go to Calendar--------------------//
        driver.findElement(By.xpath("//button[@aria-label='Choose date, selected date is Nov 24, 2022']//*[name()='svg']")).click();
        Thread.sleep(3000);
        Actions calendar1 = new Actions(driver);
        calendar1.sendKeys(Keys.chord(Keys.RIGHT,  Keys.ENTER)).perform();
        Thread.sleep(3000);

        //-----------------------Go to Calendar--------------------//

        driver.get("https://e-mareez.com/patient/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//body//div//div[1]//div[1]//div[2]//div[1]//div[1]//form[1]//div[1]//div[1]//input[1]")).sendKeys("Rehan Atif");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='flex flex-col m-auto']//input[@placeholder='03XXXXXXXXX']")).sendKeys("03315947601");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='flex flex-col m-auto']//button[@type='submit'][normalize-space()='Submit']")).click();
        Thread.sleep(15000);
        driver.findElement(By.xpath("//button[normalize-space()='submit']")).submit();
        Thread.sleep(3000);
    }
}
