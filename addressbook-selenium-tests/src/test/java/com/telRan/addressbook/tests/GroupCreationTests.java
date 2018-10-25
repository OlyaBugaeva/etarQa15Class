package com.telRan.addressbook.tests;

import com.telRan.addressbook.model.Group;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getGroupHelper().openGroupsPage();

    int before = app.getGroupHelper().getGroupsCount();

    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new Group()
            .setGroupFooter("hh")
            .setGroupName("Qa15")
            .setGroupHeader("hkjhkjhjk")
           );
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupsPage();

    int after = app.getGroupHelper().getGroupsCount();
    Assert.assertEquals(after, before+1);
  }

}
