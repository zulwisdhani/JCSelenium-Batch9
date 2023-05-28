package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "F:\\Pelatihan Juara Coding SQA\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("Open Browser");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        System.out.println("Enter URL Textbox");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.findElement(By.id("userName")).sendKeys("JuaraCoding");
        driver.findElement(By.id("userEmail")).sendKeys("info@juaracoding");
        driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
        driver.findElement(By.id("permanentAddress")).sendKeys("Jakarta");
        js.executeScript("window.scrollBy(0,500)"); //scroll vertikal 500px
        driver.findElement(By.id("submit")).click();
        System.out.println("Button submit clicked");

        try {
            Thread.sleep(3000); //delay 3 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
        System.out.println("Close Browser");
    }
}