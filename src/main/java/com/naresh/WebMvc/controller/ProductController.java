package com.naresh.WebMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

  @RequestMapping("/get")
  public String getProduct() {
    return "product";
  }
}
