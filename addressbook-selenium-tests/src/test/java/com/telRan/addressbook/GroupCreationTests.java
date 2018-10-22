package com.telRan.addressbook;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.openGroupsPage();

    int before = app.getGroupsCount();

    app.initGroupCreation();
    app.fillGroupForm(new Group()
            .setGroupFooter("hh")
            .setGroupName("Qa15")
            .setGroupHeader("hkjhkjhjk")
           );
    app.submitGroupCreation();
    app.returnToGroupsPage();

    int after = app.getGroupsCount();
    Assert.assertEquals(after, before+1);
  }

}
