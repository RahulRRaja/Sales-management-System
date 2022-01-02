package com.Sample.Sales.management.System.service.impl;

import com.Sample.Sales.management.System.entity.Orders;
import com.Sample.Sales.management.System.repository.OrderRepository;
import com.Sample.Sales.management.System.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Override
    public Orders CreateOrders(Orders orders) {
        return orderRepository.save(orders);
    }

    @Override
    public Orders getOrders(Integer oid) {
        return orderRepository.getById(oid);
    }

    @Override
    public Orders editOrders(Orders orders) {
        return orderRepository.save(orders);
    }

    @Override
    public void deleteOrders(Orders orders) {
        orderRepository.delete(orders);
    }

    @Override
    public void deleteOrdersById(Integer oid) {
        orderRepository.deleteById(oid);
    }

    @Override
    public List<Orders> getAllOrders() {
        List<Orders> list = orderRepository.findAll();
        return list;
    }
}
