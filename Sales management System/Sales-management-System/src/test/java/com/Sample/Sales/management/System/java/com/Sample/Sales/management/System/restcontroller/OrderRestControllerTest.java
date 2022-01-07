package com.Sample.Sales.management.System.restcontroller;

import com.Sample.Sales.management.System.Constants.TestConstants;
import com.Sample.Sales.management.System.entity.Orders;
import com.Sample.Sales.management.System.service.OrderService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class OrderRestControllerTest {

    @InjectMocks
    private OrderRestController orderRestController;
    @Mock
    private OrderService orderService;




    private Orders orders()
    {
        Orders orders = new Orders();
        orders.setUid(TestConstants.uid);
        orders.setAmount(TestConstants.amount);
        orders.setUid(TestConstants.uid);
        return orders;
    }

    @Test
    void saveOrder() {
        try {
            orderRestController.saveOrder(orders());
        }catch (Exception e)
        {

        }
    }

    @Test
    void getAllOrders() {
        try {
            orderRestController.getAllOrders();
        }catch (Exception e)
        {

        }
    }

    @Test
    void delete() {
        try {
            orderRestController.delete(orders());
        }catch (Exception e)
        {

        }
    }

    @Test
    void deleteById() {
        try {
            orderRestController.deleteById(TestConstants.oid);
        }catch (Exception e)
        {

        }
    }

    @Test
    void getOrdersById() {
        try {
            orderRestController.getOrdersById(TestConstants.oid);
        }catch (Exception e)
        {

        }
    }

    @Test
    void editOrders() {
        try {
            orderRestController.editOrders(orders());
        }catch (Exception e)
        {

        }
    }
}