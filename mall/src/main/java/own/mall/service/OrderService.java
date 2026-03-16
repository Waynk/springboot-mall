package own.mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import own.mall.dao.OrderDao;
import own.mall.dto.CreateOrderRequest;
import own.mall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
