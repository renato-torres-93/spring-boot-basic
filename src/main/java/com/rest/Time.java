package com.rest;

public class Time {
  private final long id;
  private final String content;

  public Time(long id, String content)
  {
    this.id = id;
    this.content = new java.util.Date().toString();
  }

  public long getId()
  {
    return id;
  }

  public String getContent()
  {
    return content;
  }
}
