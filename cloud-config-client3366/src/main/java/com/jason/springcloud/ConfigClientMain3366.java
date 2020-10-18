package com.jason.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Jason
 * @create 2020-10-18 16:42
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3366 {
  public static void main(String[] args) {
    SpringApplication.run(ConfigClientMain3366.class,args);
  }
}
