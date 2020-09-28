package com.jason.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Jason
 * @create 2020-09-26 19:03
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain8080 {
  public static void main(String[] args) {
    SpringApplication.run(OrderFeignMain8080.class, args);
  }
}
