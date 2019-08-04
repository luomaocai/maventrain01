package service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//用户初始化Spring
@ExtendWith(SpringExtension.class)
//引入本地配置文件,多个文件路劲间用逗号隔开
@ContextConfiguration(locations = {"classpath:config/spring/applicationContext.xml"})
public class TestBookService {
    @Autowired
    private BookService bookService;

    @Test
    public void testSayBook(){
        System.out.println("hello");
        this.bookService.sayBook();
    }

    /**
     * 单元测试前自动执行该方法
     */
    @BeforeEach
    private void initBook(){
        this.bookService.initBook("高等数学","大学本科学习的数学内容",98.8F);
    }
}
