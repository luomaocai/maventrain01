package service;

import lombok.extern.slf4j.Slf4j;
import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BookService {

    @Autowired
    private Book book;

    /**
     * 打印book的信息
     */
    public void sayBook(){
        log.info("book的信息:{}",this.book.toString());
    }

    /**
     * 使用参数初始化book
     * @param bookName 书名
     * @param description  书籍简介
     * @param price 书本单价
     */
    public void initBook(String bookName , String description , float price){
        this.book.setBookName(bookName);
        this.book.setDescription(description);
        this.book.setPrice(price);
    }
}
