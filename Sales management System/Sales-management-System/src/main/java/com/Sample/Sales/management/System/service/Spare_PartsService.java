package com.Sample.Sales.management.System.service;

import com.Sample.Sales.management.System.entity.Orders;
import com.Sample.Sales.management.System.entity.Spare_Parts;

import java.util.List;

public interface Spare_PartsService {

    Spare_Parts CreateSpareParts(Spare_Parts spare_parts);

    Spare_Parts getSpareParts(Integer id);

    Spare_Parts editSpareParts(Spare_Parts spare_parts);

    void deleteSpareParts(Spare_Parts spare_parts);

    void deleteSparePartsById(Integer id);

    List<Spare_Parts> getAllSpareParts(Integer pageNo, Integer pageSize);
    
    List<Spare_Parts> getSparePartsByName(String Spare_parts_name);

}
