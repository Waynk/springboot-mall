package own.mall.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import own.mall.constant.ProductCategory;

import java.time.LocalDateTime;

@Data
public class Product {

    private Integer product_id;
    private String product_name;
    private ProductCategory category;
    private String imageUrl;
    private Integer price;
    private Integer stock;
    private String description;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastModifiedDate;

}
