package com.zking.service.iml;

import com.zking.mapper.CollegeMapper;
import com.zking.model.College;
import com.zking.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeServiceImpl implements CollegeService {
    @Autowired
    CollegeMapper collegeMapper;
    @Override
    public List<College> findAllCollege() {
        return collegeMapper.findAllCollege();
    }
}
