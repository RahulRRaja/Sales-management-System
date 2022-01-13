package com.Sample.Sales.management.System.repository;

import com.Sample.Sales.management.System.entity.Spare_Parts;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Spare_PartsRepository extends PagingAndSortingRepository<Spare_Parts,Integer> {
  @Query("SELECT sp FROM spare_parts sp WHERE sp.Spare_parts_name LIKE %:Spare_parts_name%")
public List<Spare_Parts> getSparePartsByName(String Spare_parts_name);
}
