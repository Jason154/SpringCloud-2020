package com.jason.springcloud.controller;

import com.jason.springcloud.entities.CommonResult;
import com.jason.springcloud.entities.Payment;
import com.jason.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Jason
 * @create 2020-09-26 19:12
 */
@RestController
@Slf4j
public class OrderFeignController {
  @Resource
  private PaymentFeignService paymentFeignService;

  @GetMapping(value = "/consumer/payment/get/{id}")
  public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
    return paymentFeignService.getPaymentById(id);
  }

  @GetMapping(value = "/consumer/payment/feign/timeout")
  public String paymentFeignTimeout(){
    //openfeign-ribbon客户端一般默认等待1秒钟
    return paymentFeignService.paymentFeignTimeout();
  }
}
