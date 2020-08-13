package com.zking.service.iml;

import com.zking.mapper.GradeMapper;
import com.zking.model.Grade;
import com.zking.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    GradeMapper gradeMapper;
    @Override
    public List<Grade> findAllGrade() {
        return gradeMapper.findAllGrade();
    }
}
