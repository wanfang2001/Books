package com.zking.service;

import com.zking.model.Profession;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface ProfessionService {
    List<Profession> findAllProfession();
}
