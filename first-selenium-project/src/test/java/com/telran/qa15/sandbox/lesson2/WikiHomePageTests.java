package com.telran.qa15.sandbox.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WikiHomePageTests extends TestBase {

  @Test
  public void testOpeningEnglishWiki(){
  findAndClickOnTheEnglishLink();
  String currentUrl = wd.getCurrentUrl();

  Assert.assertEquals(currentUrl, "https://en.wikipedia.org/wiki/Main_Page");
}

}
