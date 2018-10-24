package com.telRan.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class GroupHelper {
  WebDriver wd;

  public void type(By locator, String text) {
    click(locator);
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

  public void returnToGroupsPage() {
    click(By.cssSelector("i a[href='group.php']"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void click(By locator) {
    wd.findElement(locator).click();
  }

  public void fillGroupForm(Group group) {
    type(By.name("group_name"), group.getGroupName());
    type(By.name("group_header"), group.getGroupHeader());
    type(By.name("group_footer"), group.getGroupFooter());
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void openGroupsPage() {
    click(By.cssSelector("[href='group.php']"));
  }

  //----------------------Groups------------------------------------
  public void submitGroupModification() {
    click(By.name("update"));
  }

  public void initGroupModification() {
    click(By.cssSelector("[name=edit]:last-child"));
  }

  protected void selectGroup() {
    click(By.name("selected[]"));
  }

  public void deleteGroup() {
    click(By.xpath("//input[@name='delete'][2]"));
  }

  public boolean isElementPresent(By locator) {
    try {
      wd.findElement(locator);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  public  boolean isGroupPresent(){
    return isElementPresent(By.name("selected[]"));
  }

  public void createGroup() {
    initGroupCreation();
    fillGroupForm (new Group()
            .setGroupFooter("hh")
            .setGroupName("Qa15")
            .setGroupHeader("hkjhkjhjk")
    );
    submitGroupCreation();
    returnToGroupsPage();
  }

  public int getGroupsCount() {
    return wd.findElements(By.name("selected[]")).size();
  }

  public void selectGroupByIndex(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();
  }
}
