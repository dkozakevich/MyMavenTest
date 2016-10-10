package com.myMavenTest.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {
    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com");

    }
}
