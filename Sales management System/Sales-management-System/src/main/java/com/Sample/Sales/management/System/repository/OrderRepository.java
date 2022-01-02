package com.Sample.Sales.management.System.repository;

import com.Sample.Sales.management.System.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Orders,Integer> {
}
