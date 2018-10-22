package com.telRan.addressbook;

public class Group {
  private String groupName;
  private String groupHeader;
  private String groupFooter;


  public Group setGroupName(String groupName) {
    this.groupName = groupName;
    return  this;
  }

  public Group setGroupHeader(String groupHeader) {
    this.groupHeader = groupHeader;
    return this;
  }

  public Group setGroupFooter(String groupFooter) {
    this.groupFooter = groupFooter;
    return  this;
  }

  public String getGroupName() {
    return groupName;
  }

  public String getGroupHeader() {
    return groupHeader;
  }

  public String getGroupFooter() {
    return groupFooter;
  }
}
