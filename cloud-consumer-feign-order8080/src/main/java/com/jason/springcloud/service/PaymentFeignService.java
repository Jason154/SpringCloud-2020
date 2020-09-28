package com.jason.springcloud.service;

import com.jason.springcloud.entities.CommonResult;
import com.jason.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Jason
 * @create 2020-09-26 19:05
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

  @GetMapping(value = "/payment/get/{id}")
  public CommonResult <Payment> getPaymentById(@PathVariable("id") Long id);

  @GetMapping(value = "/payment/feign/timeout")
  public String paymentFeignTimeout();
}
