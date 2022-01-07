package com.Sample.Sales.management.System.restcontroller;

import com.Sample.Sales.management.System.Constants.TestConstants;
import com.Sample.Sales.management.System.entity.Spare_Parts_types;
import com.Sample.Sales.management.System.service.impl.Spare_PartServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class Spare_PartsTypeRestControllerTest {

    @InjectMocks
    private Spare_PartsTypeRestController spare_partsTypeRestController;

    @Mock
    private Spare_PartServiceImpl service;

    private Spare_Parts_types spare_parts_types()
    {
        Spare_Parts_types types = new Spare_Parts_types();
        types.setSpare_Parts_types_name(TestConstants.Spare_Parts_types_name);
        types.setSt_id(TestConstants.st_id);
        return types;
    }


    @Test
    void getAllSparePartsTypes() {
        try {
            spare_partsTypeRestController.getAllSparePartsTypes();

        }catch (Exception e)
        {

        }
    }

    @Test
    void delete() {
        try {

            spare_partsTypeRestController.delete(spare_parts_types());
        }catch (Exception e)
        {

        }
    }

    @Test
    void deleteById() {
        try {
            spare_partsTypeRestController.deleteById(TestConstants.st_id);
        }catch (Exception e)
        {

        }
    }

    @Test
    void getSparePartsTypeById() {
        try {

            spare_partsTypeRestController.getSparePartsTypeById(TestConstants.st_id);
        }catch (Exception e)
        {

        }
    }

    @Test
    void editSpareParts() {
        try {

            spare_partsTypeRestController.editSpareParts(spare_parts_types());
        }catch (Exception e)
        {

        }
    }

    @Test
    void saveSpare_Parts() {
        try {

            spare_partsTypeRestController.saveSpare_Parts(spare_parts_types());
        }catch (Exception e)
        {

        }
    }
}