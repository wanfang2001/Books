package com.zking.service.iml;

import com.zking.mapper.SuppliersMapper;
import com.zking.model.Supplier;
import com.zking.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    SuppliersMapper suppliersMapper;


    @Override
    public List<Supplier> findAllSupplierByPages(int start, int pageSize) {
        return suppliersMapper.findAllSupplierByPages(start,pageSize);
    }

    @Override
    public List<Supplier> findAllSupplier() {
        return suppliersMapper.findAllSupplier();
    }

    @Override
    public int addSupplier(Map map) {
        return suppliersMapper.addSupplier(map);
    }

    @Override
    public int deleteQsById(String id) {
        return suppliersMapper.deleteQsById(id);
    }

    @Override
    public int updateQsById(Map map) {
        return suppliersMapper.updateQsById(map);
    }

    @Override
    public List<String> findAllQsName() {
        return suppliersMapper.findAllQsName();
    }

    @Override
    public Supplier selectById(String id) {
        return suppliersMapper.selectById(id);
    }
}
