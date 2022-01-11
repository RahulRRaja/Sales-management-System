package com.Sample.Sales.management.System.service;

import com.Sample.Sales.management.System.entity.Spare_Parts;
import com.Sample.Sales.management.System.entity.Spare_Parts_types;

import java.util.List;

public interface Spare_Parts_TypesService {

    Spare_Parts_types CreateSparePartsTypes(Spare_Parts_types spare_parts_types);

    Spare_Parts_types getSparePartsTypes(Integer st_id);

    Spare_Parts_types editSparePartsTypes(Spare_Parts_types spare_parts_types);

    void deleteSparePartsTypes(Spare_Parts_types spare_parts_types);

    void deleteSparePartsTypesById(Integer st_id);

    List<Spare_Parts_types> getAllSparePartsTypes();
    
    List<Spare_Parts_types> getSparePartsByTypeName(String Spare_Parts_types_name);


}
