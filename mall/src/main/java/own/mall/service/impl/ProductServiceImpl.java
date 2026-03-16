package own.mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import own.mall.constant.ProductCategory;
import own.mall.dao.ProductDao;
import own.mall.dto.ProductQueryParams;
import own.mall.dto.ProductRequest;
import own.mall.model.Product;
import own.mall.service.ProductService;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

   @Autowired
   private ProductDao productDao;

    @Override
    public List<Product> getProducts(ProductQueryParams productQueryParams) {
        List<Product> productList = productDao.getProducts(productQueryParams);
        return productList;
    }

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId, productRequest);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }
}
