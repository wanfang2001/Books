package com.zking.service;

import com.zking.model.Supplier;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
@Transactional
public interface SupplierService {
    List<Supplier> findAllSupplierByPages(int start,int pageSize);
    List<Supplier> findAllSupplier();
    int addSupplier(Map map);
    int deleteQsById(String id);
    int updateQsById(Map map);
    List<String>findAllQsName();

    Supplier selectById(String id);
}
