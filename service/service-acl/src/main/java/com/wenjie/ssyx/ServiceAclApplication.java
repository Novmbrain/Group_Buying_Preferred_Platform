package com.wenjie.ssyx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @className: ServiceAclApplication - Acl stands for Access Control List
 * @description: TODO
 * @author: Wenjie FU
 * @date: 17/01/2024
 **/
@SpringBootApplication
@ComponentScan({"com.wenjie.ssyx"})
public class ServiceAclApplication {
  public static void main(String[] args) {
    SpringApplication.run(ServiceAclApplication.class, args);
  }
}
