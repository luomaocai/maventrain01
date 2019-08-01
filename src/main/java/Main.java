import dto.PersonDto;
import dto.StudentDto;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.Level;

/**
 * @author Maocai
 */
public class Main {
    private static Logger logger = LoggerFactory.getLogger(Logger.class);

    public static void main(String[] args) {
        logger.info("大家好,欢迎使用maventrain01,现在正在使用log4j打印日志");

        testSlf4j();
        testLombok();
    }

    /** 
    * @Description:
    * @Param:  
    * @return:  
    * @Author: Maocai.Luo
    * @Date: 2019/7/30 
    */ 
    public static void testSlf4j(){
        for(int i=0;i<10;i++){
            logger.info("info级别,第{}轮输出",i);
            logger.debug("debug级别,第{}轮输出",i);
            logger.warn("warn级别,第{}轮输出",i);
            logger.error("error级别,第{}轮输出",i);
        }
    }

    /**
     * 测试lombok插件
    * @description:
    * @param:
    * @return:
    * @author: Maocai.Luo
    * @date: 2019/7/30
    */
    private static void testLombok() {
        PersonDto maocai = new PersonDto();
        maocai.setName("冒菜");
        maocai.setAge(18);
        System.out.println(maocai);
        PersonDto meichen = new PersonDto("美晨", 18);
        System.out.println(meichen.toString());

        StudentDto stu = new StudentDto("可欣",6,20.1f,92.1f);
        System.out.println(stu.toString());
    }

}
