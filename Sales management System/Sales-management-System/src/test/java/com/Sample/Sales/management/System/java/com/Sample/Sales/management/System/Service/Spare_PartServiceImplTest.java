package com.Sample.Sales.management.System.Service;

import com.Sample.Sales.management.System.Constants.TestConstants;
import com.Sample.Sales.management.System.entity.Spare_Parts;
import com.Sample.Sales.management.System.repository.Spare_PartsRepository;
import com.Sample.Sales.management.System.service.impl.Spare_PartServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class Spare_PartServiceImplTest {

    @InjectMocks
    private Spare_PartServiceImpl spare_partService;
    @Mock
    private Spare_PartsRepository spare_partsRepository;

    private Spare_Parts spare_parts()
    {
        Spare_Parts spare_parts = new Spare_Parts();
        spare_parts.setSpare_parts_name(TestConstants.Spare_parts_name);
        spare_parts.setId(TestConstants.id);
        return spare_parts;
    }
    @Test
    void create() {
        try {
            spare_partService.Create(spare_parts());
        }catch (Exception e)
        {

        }
    }

    @Test
    void getSpareParts() {
        try {
            spare_partService.getSpareParts(TestConstants.id);
        }catch (Exception e)
        {

        }
    }

    @Test
    void editSpareParts() {
        try {
            spare_partService.editSpareParts(spare_parts());
        }catch (Exception e)
        {

        }
    }

    @Test
    void deleteSpareParts() {
        try {
            spare_partService.deleteSpareParts(spare_parts());
        }catch (Exception e)
        {

        }
    }

    @Test
    void deleteSparePartsById() {
        try {
            spare_partService.deleteSparePartsById(TestConstants.id);
        }catch (Exception e)
        {

        }
    }

    @Test
    void getAllSpareParts() {
        try {
            spare_partService.getAllSpareParts(TestConstants.PAGE_NO,TestConstants.PAGE_SIZE);
        }catch (Exception e)
        {

        }
    }
}
