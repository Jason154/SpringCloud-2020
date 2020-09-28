package com.jason.springcloud.service;

import com.jason.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Jason
 * @create 2020-09-19 21:06
 */
public interface PaymentService {
  public int create(Payment payment);

  public Payment getPaymentById(@Param("id") Long id);
}
