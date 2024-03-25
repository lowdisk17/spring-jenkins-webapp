package com.jenkins.webapp.webapp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MainController {

  @GetMapping("service")
  public String getMethodName() {
      return "Hello World";
  }
  
}
