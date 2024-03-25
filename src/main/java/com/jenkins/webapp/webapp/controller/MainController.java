package com.jenkins.webapp.webapp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MainController {

  @GetMapping("service")
  public String getMethodName(@RequestParam String param) {
      return new String();
  }
  
}
