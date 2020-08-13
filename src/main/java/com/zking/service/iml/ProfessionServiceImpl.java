package com.zking.service.iml;

import com.zking.mapper.ProfessionMapper;
import com.zking.model.Profession;
import com.zking.service.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionServiceImpl implements ProfessionService {
    @Autowired
    ProfessionMapper professionMapper;
    @Override
    public List<Profession> findAllProfession() {
        return professionMapper.findAllProfession();
    }
}
