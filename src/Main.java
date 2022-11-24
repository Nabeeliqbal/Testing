import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Message;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Stream;

public class Main {
//    public static final String ACCOUNT_SID = "AC924b662e62bb7fa2ec5ea0d6a198d2c3";
//    public static final String AUTH_TOKEN = "b20da27b3aded58888cddc73b8facbde";
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://e-mareez.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm p-1.5 ml-auto inline-flex items-center dark:hover:bg-gray-600 dark:hover:text-white']//*[name()='svg']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='relative']//button[@id='dropdownNavbarLink']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[normalize-space()='For Patient']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//body//div//div[1]//div[1]//div[2]//div[1]//div[1]//form[1]//div[1]//div[1]//input[1]")).sendKeys("Rehan Atif");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='flex flex-col m-auto']//input[@placeholder='03XXXXXXXXX']")).sendKeys("03315947601");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='flex flex-col m-auto']//button[@type='submit'][normalize-space()='Submit']")).click();
        Thread.sleep(15000);
        driver.findElement(By.xpath("//button[normalize-space()='submit']")).submit();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Find Doctor']")).click();
        Thread.sleep(3000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,2000)", "");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[3]//div[3]//a[1]//div[1]//button[1]")).click();
//        Thread.sleep(3000);
//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//div[6]//div[1]//div[4]//div[1]//div[3]//div[2]//button[1]")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//div[@class='flex flex-col w-full gap-2']//div[contains(@class,'css-ackcql')]")).click();
//        Thread.sleep(3000);
//        Actions keyDown = new Actions(driver);
//        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//button[normalize-space()='Confirm Booking']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//span[@class='underline underline-offset-4 cursor-pointer text-blue-600']")).click();

        //-------------------------------------------Filter By-------------------------------------------------------//
        driver.findElement(By.xpath("//div[@class='flex flex-col gap-2 ']//div[@class=' css-1s2u09g-control']")).click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class=' css-1wy0on6']//div[2]//*[name()='svg']")).click();
        Actions keyDown1 = new Actions(driver);
        keyDown1.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
        Thread.sleep(3000);
//        WebElement slider = driver.findElement(By.xpath("//div[@class='flex flex-col gap-3']//span[@class='MuiSlider-track css-5wk36y']"));
//        Thread.sleep(3000);
//        Actions action = new Actions(driver);
//        action.dragAndDropBy(slider, 20, 0).perform();

//        WebElement slider2 = driver.findElement(By.xpath("//div[@class='flex flex-col gap-3']//span[@class='MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeSmall css-clirml']"));
//        Thread.sleep(3000);
//        Actions action2 = new Actions(driver);
//        action2.dragAndDropBy(slider2, -50, 0).perform();
//
//        WebElement slider3 = driver.findElement(By.xpath("//div[@class='py-2 text-[14px] font-semibold flex flex-col text-black gap-3']//span[@class='MuiSlider-thumb MuiSlider-thumbColorPrimary MuiSlider-thumbSizeSmall css-1gv0u6o']"));
//        Thread.sleep(3000);
//        Actions action3 = new Actions(driver);
//        action3.dragAndDropBy(slider3, 20, 0).perform();
//        Thread.sleep(3000);

        WebElement radiobutton = driver.findElement(By.xpath("//span[@class='MuiButtonBase-root MuiRadio-root MuiRadio-colorPrimary PrivateSwitchBase-root MuiRadio-root MuiRadio-colorPrimary css-7bl9ii']//input[@name='Consultation']"));
        radiobutton.click();

        WebElement radiobutton2 = driver.findElement(By.xpath("//span[@class='MuiButtonBase-root MuiRadio-root MuiRadio-colorPrimary PrivateSwitchBase-root MuiRadio-root MuiRadio-colorPrimary css-7bl9ii']//input[@name='Availability']"));
        radiobutton2.click();





    }
//    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//        String smsBody = getMessage();
//        System.out.println(smsBody);
//        String OTPNumber = smsBody.replaceAll("[^-?0-9]+", " ");
//        System.out.println(OTPNumber);
//        driver.findElement(By.id("auth-pv-enter-code")).sendKeys(OTPNumber);

//    public static String getMessage() {
//        return getMessages().filter(m -> m.getDirection().compareTo(Message.Direction.INBOUND) == 0)
//                .filter(m -> m.getTo().equals("03315947601")).map(Message::getBody).findFirst()
//                .orElseThrow(IllegalStateException::new);
//    }
//    private static Stream<Message> getMessages() {
//        ResourceSet<Message> messages = Message.reader(ACCOUNT_SID).read();
//        return StreamSupport.stream(messages.spliterator(), false);

}