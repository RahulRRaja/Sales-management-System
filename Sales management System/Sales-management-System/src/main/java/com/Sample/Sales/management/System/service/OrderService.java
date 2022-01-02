package com.Sample.Sales.management.System.service;

import com.Sample.Sales.management.System.entity.Orders;
import com.Sample.Sales.management.System.entity.User;

import java.util.List;

public interface OrderService {

    Orders CreateOrders(Orders orders);

    Orders getOrders(Integer oid);

    Orders editOrders(Orders orders);

    void deleteOrders(Orders orders);

    void deleteOrdersById(Integer oid);

    List<Orders> getAllOrders();

}
