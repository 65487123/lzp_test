package cn.tx.test;

import cn.tx.model.Order;
import cn.tx.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/user-consumer.xml")
public class UserTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void queryOrder(){
        List<Order> orderList = orderService.queryOrder();
        System.out.println(orderList);
    }


}
