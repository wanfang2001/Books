package com.zking.mapper;

import com.zking.model.StoreOut;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface StoreOutMapper {
    int addReceiveBook(Map map);
    List<StoreOut>findStoreOutByUserId(String userId);
    int updateTeacherBookOut(int book_out,String book_id,String user_id);
    StoreOut findStoreOutById(String id);
    int deleteStoreOutByUidandBid(String bid,String uid);
    int updateTeacherBookBack(int book_out,String book_id,String user_id);
    List<StoreOut> findStooByUidAndBid(String user_id,String book_id);
}
