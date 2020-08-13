package com.zking.service.iml;

import com.zking.mapper.CclassMapper;
import com.zking.model.Cclass;
import com.zking.service.CclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CclassServiceImpl implements CclassService {
    @Autowired
    CclassMapper cclassMapper;

    @Override
    public List<Cclass> findAllCclass() {
        return cclassMapper.findAllCclass();
    }
}
