package com.zking.mapper;

import com.zking.model.Payments;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface PaymentsMapper {
    int insertPayments(String stoo_id, double payment, Date pay_time);
    List<Payments>historyPay(String user_id);
    List<Payments>allHistoryPay();
}
