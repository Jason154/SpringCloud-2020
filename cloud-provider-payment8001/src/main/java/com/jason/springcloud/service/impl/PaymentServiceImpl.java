package com.jason.springcloud.service.impl;

import com.jason.springcloud.dao.PaymentDao;
import com.jason.springcloud.entities.Payment;
import com.jason.springcloud.service.PaymentService;
import com.sun.deploy.config.PluginClientConfig;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @author Jason
 * @create 2020-09-19 21:08
 */
@Service
public class PaymentServiceImpl implements PaymentService {
  @Resource
  private PaymentDao paymentDao;

  public int create(Payment payment) {
    return paymentDao.create(payment);
  }

  public Payment getPaymentById(Long id) {
    return paymentDao.getPaymentById(id);
  }
}
