package com.jason.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Jason
 * @create 2020-09-27 23:51
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
  @Override
  public String paymentInfo_OK(Integer id) {
    return "***PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
  }

  @Override
  public String paymentInfo_TimeOut(Integer id) {
    return "***PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
  }

}
