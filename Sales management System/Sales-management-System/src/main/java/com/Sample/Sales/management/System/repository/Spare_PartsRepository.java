package com.Sample.Sales.management.System.repository;

import com.Sample.Sales.management.System.entity.Spare_Parts;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Spare_PartsRepository extends PagingAndSortingRepository<Spare_Parts,Integer> {
  @Query("SELECT sp from spare_parts sp where sp.Spare_parts_name=?1")
public List<Spare_Parts> getSparePartsByName(String Spare_parts_name);
}
