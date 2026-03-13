package own.mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import own.mall.dao.ProductDao;
import own.mall.model.Product;
import own.mall.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService {

   @Autowired
   private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
