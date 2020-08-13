package com.zking.service;

import com.zking.model.Cclass;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface CclassService {
    List<Cclass> findAllCclass();
}
