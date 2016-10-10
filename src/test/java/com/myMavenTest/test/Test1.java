package com.myMavenTest.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Test1 {
    @Test
    public void MyTest1(){
        System.out.println("My Test 1");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com");
    }


}
