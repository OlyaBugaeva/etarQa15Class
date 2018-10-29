package com.telRan.addressbook.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  WebDriver wd;
  private  SessionHelper sessionHelper;
  private  GroupHelper groupHelper;
  private NavigationHelper navigationHelper;

  public void start() {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    navigationHelper = new NavigationHelper(wd);
    navigationHelper.openSite("http://localhost/addressbook");
    sessionHelper = new SessionHelper(wd);

    sessionHelper.login("admin", "secret");

    groupHelper = new GroupHelper(wd);

  }


  public void stop() {
    wd.quit();
  }


  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public SessionHelper getSessionHelper() {
    return sessionHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
