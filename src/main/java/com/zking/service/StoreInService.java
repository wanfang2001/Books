package com.zking.service;

import com.zking.model.StoreIn;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
@Transactional
public interface StoreInService {
    List<StoreIn> findAllStoreIn();
    List<StoreIn> findAllStoreInByPage(int start,int pageSize);
    int insertStoreIn(Map map);
    StoreIn findStoreInById(String id);
    int updateBookCount(int book_count,String id);
    int deleteStoreIn(String id);
    List<StoreIn> findStoreInPercent(String book_kind);
    List<StoreIn>findStoreInByBookId(String book_id);
    int updateBookCountByBookId(int book_count,String bookId);
}
