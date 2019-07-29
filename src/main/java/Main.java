import dto.PersonDto;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args){
        System.out.println("您好");
        System.out.println(StringUtils.isBlank(""));

        /*以下测试lombok*/
        PersonDto maocai = new PersonDto();
        maocai.setName("冒菜");
        maocai.setAge(18);
        System.out.println(maocai);

        PersonDto meichen = new PersonDto("美晨",18);
        System.out.println(meichen.toString());
    }
}
