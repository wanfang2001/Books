package com.zking.service;

import com.zking.model.College;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface CollegeService {
    List<College> findAllCollege();
}
