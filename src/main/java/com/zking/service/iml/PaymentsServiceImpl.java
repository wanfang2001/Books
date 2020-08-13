package com.zking.service.iml;

import com.zking.mapper.PaymentsMapper;
import com.zking.model.Payments;
import com.zking.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PaymentsServiceImpl implements PaymentsService {
    @Autowired
    PaymentsMapper paymentsMapper;

    @Override
    public int insertPayments(String stoo_id, double payment, Date pay_time) {
        return paymentsMapper.insertPayments(stoo_id, payment, pay_time);
    }

    @Override
    public List<Payments> historyPay(String user_id) {
        return paymentsMapper.historyPay(user_id);
    }

    @Override
    public List<Payments> allHistoryPay() {
        return paymentsMapper.allHistoryPay();
    }
}
