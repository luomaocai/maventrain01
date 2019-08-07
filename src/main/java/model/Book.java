package model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Book {
    private String bookName;
    private String description;
    private float price;
}
