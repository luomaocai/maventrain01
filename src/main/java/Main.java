import dto.PersonDto;
import dto.StudentDto;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("您好");
        System.out.println(StringUtils.isBlank(""));

        testLombok();
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
