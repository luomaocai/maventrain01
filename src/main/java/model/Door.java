package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: maventrain01
 * @description: 门，一个POJO
 * @author: Maocai.Luo
 * @create: 2019-08-06 22:39
 **/
@Data
@NoArgsConstructor
@Slf4j
public class Door {
    /**
     * 门的名称
     */
    private String name;
    /**
     * 门的单价
     */
    private float price;

    /**
     * 实例化一扇门
     * @param name 门的名称
     * @param price 门的单价
     */
    public Door(String name , float price){
        log.info("Spring-bean正在自动实例化{},传入的参数name={},price={}",this.getClass().getName(),name,price);
        this.setName(name);
        this.setPrice(price);
        log.info("Door实例化完成");
    }
}
