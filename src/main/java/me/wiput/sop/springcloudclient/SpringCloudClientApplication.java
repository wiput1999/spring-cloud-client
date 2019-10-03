package me.wiput.sop.springcloudclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudClientApplication.class, args);
  }

  @Autowired
  ServiceConfig serviceConfig;

  @GetMapping("/hello")
  String getName() {
    return serviceConfig.getMessage();
  }

}
