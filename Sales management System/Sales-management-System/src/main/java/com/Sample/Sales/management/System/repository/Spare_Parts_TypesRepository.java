package com.Sample.Sales.management.System.repository;

import com.Sample.Sales.management.System.entity.Spare_Parts_types;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Spare_Parts_TypesRepository extends JpaRepository<Spare_Parts_types,Integer> {
  @Query("SELECT st from spare_parts_types st where st.Spare_Parts_types_name=?1")
    public List<Spare_Parts_types> getSparePartsByTypeName(String Spare_parts_name);
}
