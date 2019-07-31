package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: maventrain01
 * @description: 学生信息转换对象
 * @author: Maocai.Luo
 * @create: 2019-07-30 10:12
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class StudentDto extends PersonDto {
    /**体重*/
    protected float weight;
    /**身高*/
    protected float height;
    
    /** 
    * @description: 实例化一个学生对象
    * @param age
    * @return:  
    * @author: Maocai.Luo
    * @date: 2019/7/30
    */ 
    public StudentDto(String name , int age , float weight , float height){
        super(name,age);
        this.setWeight(weight);
        this.setHeight(height);
    }
}