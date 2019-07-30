import dto.PersonDto;
import dto.StudentDto;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.Level;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("大家好,欢迎使用maventrain01,现在正在使用log4j打印日志");

        testLof4j();
        testLombok();
    }

    /** 
    * @Description:
    * @Param:  
    * @return:  
    * @Author: Maocai.Luo
    * @Date: 2019/7/30 
    */ 
    public static void testLof4j(){
        logger.info("info级别");
        logger.debug("debug级别");
        logger.warn("warn级别");
        logger.error("error级别");
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
