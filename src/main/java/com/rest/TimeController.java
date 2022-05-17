package com.rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/time")
  public Time greeting()
  {
    return new Time(counter.incrementAndGet());
  }
}
