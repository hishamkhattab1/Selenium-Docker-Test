package com.dx.GoogleTitleTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class GoogleTitleTest 
{
    @Test
    public static void main(String[] args) throws MalformedURLException{
   

    //public void testRun() throws MalformedURLException
    //{
    URL hubUrl = new URL("http://192.168.9.128:4444/wd/hub");
    // Set up Chrome options (you can customize this further if needed)
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless"); // Run in headless mode (without opening a browser window)

    // Create a new ChromeDriver instance
    WebDriver driver = new ChromeDriver(options);
    driver = new RemoteWebDriver(hubUrl, options);
    // Navigate to Google
    driver.get("http://www.google.com");

    // Get the actual value of the title
    String actualTitle = driver.getTitle();
    System.out.println(actualTitle);
    String expectedTitle = "Google"; // You can customize this based on your expectations

    // Compare the actual title with the expected one
    if (actualTitle.equals(expectedTitle)) {
        System.out.println("Test Passed! Title is: " + actualTitle);
    } else {
        System.out.println("Test Failed. Expected title: " + expectedTitle + ", Actual title: " + actualTitle);
    }
    driver.quit();
    }
//}
}