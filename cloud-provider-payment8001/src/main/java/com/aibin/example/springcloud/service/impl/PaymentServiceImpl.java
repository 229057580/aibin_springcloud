package com.aibin.example.springcloud.service.impl;

import com.aibin.example.springcloud.bean.PaymentBean;
import com.aibin.example.springcloud.mapper.PaymentMapper;
import com.aibin.example.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;
    @Override
    public int create(PaymentBean payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public PaymentBean getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
