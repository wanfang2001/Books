package com.zking.mapper;

import com.zking.model.Grade;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GradeMapper {
    List<Grade> findAllGrade();
}
