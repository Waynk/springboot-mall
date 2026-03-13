package own.mall.dao;

import own.mall.constant.ProductCategory;
import own.mall.dto.ProductRequest;
import own.mall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category);

    Product getProductById(Integer productid);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
