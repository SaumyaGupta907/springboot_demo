package org.example.springboot1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Annotate it with the controller decorator
@Controller
public class HomeController {
  // When send a request to the root of the website, we want this method to be called
  // To do so we add a special annotation
  // Since we want it to be connected to the root, we pass a parameter "/" indicating root
  @RequestMapping("/")
  public String index(){
    return "index.html";
  }
}
