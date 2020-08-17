package com.zking.service;

import com.zking.model.Book;
import com.zking.model.Supplier;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
@Transactional
public interface BookService {
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
