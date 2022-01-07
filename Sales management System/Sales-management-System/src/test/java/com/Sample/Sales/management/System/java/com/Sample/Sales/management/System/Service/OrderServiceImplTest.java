package com.Sample.Sales.management.System.Service;
import com.Sample.Sales.management.System.Constants.TestConstants;
import com.Sample.Sales.management.System.entity.Orders;
import com.Sample.Sales.management.System.repository.OrderRepository;
import com.Sample.Sales.management.System.service.impl.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {
    @InjectMocks
    private OrderServiceImpl orderService;

    @Mock
    private OrderRepository orderRepository;

    private Orders orders()
    {
        Orders orders = new Orders();
        orders.setUid(TestConstants.uid);
        orders.setAmount(TestConstants.amount);
        orders.setUid(TestConstants.uid);
        return orders;
    }

    @Test
    void createOrders() {
        try {
            orderService.CreateOrders(orders());
        }catch (Exception e)
        {

        }
    }

    @Test
    void getOrders() {
        try {
            orderService.getOrders(TestConstants.oid);
        }catch (Exception e)
        {

        }
    }

    @Test
    void editOrders() {
        try {
            orderService.editOrders(orders());
        }catch (Exception e)
        {

        }
    }

    @Test
    void deleteOrders() {
        try {
            orderService.deleteOrders(orders());
        }catch (Exception e)
        {

        }
    }

    @Test
    void deleteOrdersById() {
        try {
            orderService.deleteOrdersById(TestConstants.oid);
        }catch (Exception e){

        }
    }

    @Test
    void getAllOrders() {
        try {
            orderService.getAllOrders();
        }catch (Exception e)
        {

        }
    }
}
