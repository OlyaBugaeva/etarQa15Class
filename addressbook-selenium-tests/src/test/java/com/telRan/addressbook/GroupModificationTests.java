package com.telRan.addressbook;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

  @BeforeMethod
  public void preconditions() {
    app.openGroupsPage();
    if (!app.isGroupPresent()) {
      app.createGroup();
    }
  }
  @Test
  public void testGroupModification(){
    app.openGroupsPage();
    int before = app.getGroupsCount();
    app.selectGroupByIndex(before-1);
    app.initGroupModification();
    app.fillGroupForm(new Group()
            .setGroupHeader("modifyed")
            .setGroupName("new")
            .setGroupFooter("Changed"));
    app.submitGroupModification();
    app.returnToGroupsPage();
    int after = app.getGroupsCount();
    Assert.assertEquals(after, before);
  }



}
