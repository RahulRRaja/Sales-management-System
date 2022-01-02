package com.Sample.Sales.management.System.service.impl;

import com.Sample.Sales.management.System.entity.Spare_Parts;
import com.Sample.Sales.management.System.repository.Spare_PartsRepository;
import com.Sample.Sales.management.System.service.Spare_PartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Spare_PartServiceImpl implements Spare_PartsService {

    @Autowired
    private Spare_PartsRepository  spare_partsRepository;
    @Override
    public Spare_Parts CreateSpareParts(Spare_Parts spare_parts) {
        return spare_partsRepository.save(spare_parts);
    }

    @Override
    public Spare_Parts getSpareParts(Integer id) {
        return spare_partsRepository.findById(id).get();
    }

    @Override
    public Spare_Parts editSpareParts(Spare_Parts spare_parts) {
        return spare_partsRepository.save(spare_parts);
    }

    @Override
    public void deleteSpareParts(Spare_Parts spare_parts) {

        spare_partsRepository.delete(spare_parts);
    }

    @Override
    public void deleteSparePartsById(Integer id) {

        spare_partsRepository.deleteById(id);
    }

    @Override
    public List<Spare_Parts> getAllSpareParts(Integer pageNo, Integer pageSize) {
        Pageable paging = PageRequest.of(pageNo,pageSize);
        Page<Spare_Parts> userPage = spare_partsRepository.findAll(paging);
        if(userPage.hasContent())
        {
            return userPage.getContent();
        }
        else{
            return new ArrayList<>();
        }
    }
}
