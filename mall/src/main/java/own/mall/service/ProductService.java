package own.mall.service;

import own.mall.dto.ProductRequest;
import own.mall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
