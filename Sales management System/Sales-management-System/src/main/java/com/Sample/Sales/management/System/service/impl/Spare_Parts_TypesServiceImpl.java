package com.Sample.Sales.management.System.service.impl;

import com.Sample.Sales.management.System.entity.Spare_Parts_types;
import com.Sample.Sales.management.System.repository.Spare_Parts_TypesRepository;
import com.Sample.Sales.management.System.service.Spare_Parts_TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Spare_Parts_TypesServiceImpl implements Spare_Parts_TypesService {
    @Autowired
    private Spare_Parts_TypesRepository spare_parts_typesRepository;
    @Override
    public Spare_Parts_types CreateSparePartsTypes(Spare_Parts_types spare_parts_types) {
        return spare_parts_typesRepository.save(spare_parts_types);
    }

    @Override
    public Spare_Parts_types getSparePartsTypes(Integer st_id) {
        return spare_parts_typesRepository.getById(st_id);
    }

    @Override
    public Spare_Parts_types editSparePartsTypes(Spare_Parts_types spare_parts_types) {
        return spare_parts_typesRepository.save(spare_parts_types);
    }

    @Override
    public void deleteSparePartsTypes(Spare_Parts_types spare_parts_types) {
        spare_parts_typesRepository.delete(spare_parts_types);
    }

    @Override
    public void deleteSparePartsTypesById(Integer st_id) {
        spare_parts_typesRepository.deleteById(st_id);
    }

    @Override
    public List<Spare_Parts_types> getAllSparePartsTypes() {
        return spare_parts_typesRepository.findAll();
    }
      @Override
    public List<Spare_Parts_types> getSparePartsByTypeName(String Spare_Parts_types_name) {
        return spare_parts_typesRepository.getSparePartsByTypeName(Spare_Parts_types_name);
    }
}
