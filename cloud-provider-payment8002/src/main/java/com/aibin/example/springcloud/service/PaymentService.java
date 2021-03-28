package com.aibin.example.springcloud.service;

import com.aibin.example.springcloud.bean.PaymentBean;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(PaymentBean payment); //写

    public PaymentBean getPaymentById(@Param("id") Long id);  //读取
}
