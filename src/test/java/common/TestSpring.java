package common;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @program: maventrain01
 * @description: Spring单元测试父类, 主要用于引入配置文件, 子类可以简洁代码
 * @author: Maocai.Luo
 * @create: 2019-08-06 22:49
 **/
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:config/spring/applicationContext.xml"})
abstract public class TestSpring {}
