package model;

import common.TestSpring;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: maventrain01
 * @description: 关于门的单元测试
 * @author: Maocai.Luo
 * @create: 2019-08-06 22:47
 **/
@Slf4j
public class TestDoor extends TestSpring {
    @Autowired
    private Door door;

    /**
     * 测试door.toString()方法
     */
    @Test
    public void testSayDoor(){
        log.info("门的信息,{}",this.door.toString());
    }

}
