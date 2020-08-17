package com.zking.mapper;

import com.zking.model.Book;
import com.zking.model.Supplier;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BookMapper {
    List<Book> findAllBookByPages(int start, int pageSize);
    List<Book> findAllBook();
    int addBook(Map map);
    Book findBookById(String id);
    int updateBookById(Map map);
    int deleteBookById(String id);
    List<String>findAllBookKind();
    List<Supplier> findAllBookByBookName(String book_name);
    List<String>findBookNameByQsName(String book_name);



}
