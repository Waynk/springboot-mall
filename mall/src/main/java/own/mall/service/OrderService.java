package own.mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import own.mall.dao.OrderDao;
import own.mall.dto.CreateOrderRequest;
import own.mall.dto.OrderQueryParams;
import own.mall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
