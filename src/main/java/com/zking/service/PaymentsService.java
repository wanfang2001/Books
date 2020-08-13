package com.zking.service;

import com.zking.model.Payments;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
@Transactional
public interface PaymentsService {
    int insertPayments(String stoo_id, double payment, Date pay_time);
    List<Payments> historyPay(String user_id);
    List<Payments>allHistoryPay();
}
