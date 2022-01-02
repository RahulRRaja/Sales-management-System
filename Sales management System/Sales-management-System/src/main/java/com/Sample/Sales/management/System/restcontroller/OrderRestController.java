package com.Sample.Sales.management.System.restcontroller;

import com.Sample.Sales.management.System.entity.Orders;
import com.Sample.Sales.management.System.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderRestController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/add", method = RequestMethod.POST, headers = "Accept=application/json")
    public Orders saveOrder(@RequestBody Orders o)
    {
        orderService.CreateOrders(o);
        return o;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<Orders> getAllOrders()
    {
        List<Orders> list = orderService.getAllOrders();
        return list;
    }
    @DeleteMapping("/delete")
    public void delete(Orders orders)
    {
        orderService.deleteOrders(orders);
    }
    @DeleteMapping("/delete/{oid}")
    public void deleteById(@PathVariable("oid") Integer oid)
    {
        orderService.deleteOrdersById(oid);
    }
    @RequestMapping(value = "/get/{oid}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Orders getOrdersById(@PathVariable("oid") Integer oid)
    {
        return  orderService.getOrders(oid);
    }
    @PutMapping("/editOrders")
    public Orders editOrders(@RequestBody Orders o)
    {
        orderService.editOrders(o);
        return o;
    }


}
