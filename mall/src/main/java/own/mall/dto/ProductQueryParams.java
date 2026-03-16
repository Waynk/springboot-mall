package own.mall.dto;

import lombok.Data;
import own.mall.constant.ProductCategory;

@Data
public class ProductQueryParams {
    private ProductCategory category;
    private String search;
}
