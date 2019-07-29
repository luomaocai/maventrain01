package dto;

import lombok.Data;
import lombok.Setter;

@Data
public class PersonDto {
    @Setter
    private String name;
    private int age;
}
