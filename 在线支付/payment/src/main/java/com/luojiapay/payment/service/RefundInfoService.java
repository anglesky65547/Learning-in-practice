package com.luojiapay.payment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luojiapay.payment.entity.RefundInfo;
import com.wechat.pay.java.service.partnerpayments.nativepay.model.Transaction;
import com.wechat.pay.java.service.refund.model.Refund;

public interface RefundInfoService extends IService<RefundInfo> {

    RefundInfo createRefundByOrderNo(String orderNo, String reason);
    void updateRefund(Refund refund);
}
