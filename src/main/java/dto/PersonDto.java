package dto;

import lombok.*;

//自动生成类所有属性的setter/getter,equals,canEqual,hashCode,toString方法,如为final属性,则不会为该属性生成setter方法
@Data
//自动生成无参构造方法
@NoArgsConstructor(access = AccessLevel.PUBLIC)
//自动生成全参构造方法,将所有成员属性作为参数
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class PersonDto {
    protected String name;
    protected int age;
}
