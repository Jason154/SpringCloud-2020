package com.jason.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Jason
 * @create 2020-09-26 9:39
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {
  public static void main(String[] args) {
    SpringApplication.run(PaymentMain8006.class, args);
  }
}
