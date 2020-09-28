package com.jason.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Jason
 * @create 2020-09-23 20:44
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {
  public static void main(String[] args) {
    SpringApplication.run(PaymentMain8004.class, args);
  }
}
