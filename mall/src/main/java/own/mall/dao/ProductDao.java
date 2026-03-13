package own.mall.dao;

import own.mall.dto.ProductRequest;
import own.mall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productid);

    Integer createProduct(ProductRequest productRequest);
}
