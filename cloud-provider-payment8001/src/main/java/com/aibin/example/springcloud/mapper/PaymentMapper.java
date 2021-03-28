package com.aibin.example.springcloud.mapper;

import com.aibin.example.springcloud.bean.PaymentBean;

public interface PaymentMapper {

    int create(PaymentBean payment);

    PaymentBean getPaymentById(Long id);
}
