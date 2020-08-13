package com.zking.service;

import com.zking.model.Grade;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface GradeService {
    List<Grade> findAllGrade();
}
