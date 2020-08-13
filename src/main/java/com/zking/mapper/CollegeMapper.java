package com.zking.mapper;

import com.zking.model.College;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CollegeMapper {
    List<College> findAllCollege();
}
