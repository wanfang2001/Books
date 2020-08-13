package com.zking.mapper;

import com.zking.model.Cclass;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CclassMapper {
    List<Cclass> findAllCclass();
}
