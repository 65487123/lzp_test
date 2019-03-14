package cn.tx.service.impl;

import cn.tx.model.Order;
import cn.tx.service.OrderService;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    public List<Order> queryOrder() {
        Order order1 = new Order();
        order1.setOrderId(1);
        order1.setAddr("北京");
        order1.setPrice(100.0);

        Order order2 = new Order();
        order2.setOrderId(2);
        order2.setAddr("上海");
        order2.setPrice(200.0);

        List<Order> orderList = new ArrayList<Order>();
        orderList.add(order1);
        orderList.add(order2);

        return orderList;
    }
}
