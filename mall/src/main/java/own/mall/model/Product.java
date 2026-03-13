package own.mall.model;

import lombok.Data;

import java.util.Date;

@Data
public class Product {

    private Integer product_id;
    private String product_name;
    private String category;
    private String imageUrl;
    private Integer price;
    private Integer stock;
    private String description;
    private Date createdDate;
    private Date lastModifiedDate;

}
