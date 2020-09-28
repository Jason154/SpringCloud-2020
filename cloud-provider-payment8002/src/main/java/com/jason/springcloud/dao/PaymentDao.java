package com.jason.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.jason.springcloud.entities.Payment;

/**
 * @author Jason
 * @create 2020-09-19 20:15
 */
@Mapper
public interface PaymentDao
{
  public int create(Payment payment);

  public Payment getPaymentById(@Param("id") Long id);
}

