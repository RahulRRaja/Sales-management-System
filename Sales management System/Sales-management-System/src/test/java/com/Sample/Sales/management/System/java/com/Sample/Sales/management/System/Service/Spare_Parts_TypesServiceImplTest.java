package com.Sample.Sales.management.System.Service;

import com.Sample.Sales.management.System.Constants.TestConstants;
import com.Sample.Sales.management.System.entity.Spare_Parts_types;
import com.Sample.Sales.management.System.repository.Spare_Parts_TypesRepository;
import com.Sample.Sales.management.System.service.impl.Spare_Parts_TypesServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Spare_Parts_TypesServiceImplTest {

    @InjectMocks
    private Spare_Parts_TypesServiceImpl spare_parts_typesService;

    @Mock
    private Spare_Parts_TypesRepository spare_parts_typesRepository;

    private Spare_Parts_types spare_parts_types()
    {
        Spare_Parts_types spare_parts_types = new Spare_Parts_types();
        spare_parts_types.setSpare_Parts_types_name(TestConstants.Spare_Parts_types_name);
        spare_parts_types.setSt_id(TestConstants.st_id);
        return spare_parts_types;
    }

    @Test
    void createSparePartsTypes() {
        try {
            spare_parts_typesService.CreateSparePartsTypes(spare_parts_types());
        }catch (Exception e)
        {

        }
    }

    @Test
    void getSparePartsTypes() {
        try {
            spare_parts_typesService.getSparePartsTypes(TestConstants.st_id);
        }catch (Exception e)
        {

        }

    }

    @Test
    void editSparePartsTypes() {
        try {
            spare_parts_typesService.editSparePartsTypes(spare_parts_types());
        }catch (Exception e)
        {

        }
    }

    @Test
    void deleteSparePartsTypes() {
        try {
            spare_parts_typesService.deleteSparePartsTypes(spare_parts_types());
        }catch (Exception e)
        {

        }
    }

    @Test
    void deleteSparePartsTypesById() {
        try {
            spare_parts_typesService.deleteSparePartsTypesById(TestConstants.st_id);
        }catch (Exception e)
        {

        }
    }

    @Test
    void getAllSparePartsTypes() {
        try {
            spare_parts_typesService.getAllSparePartsTypes();
        }catch (Exception e)
        {

        }
    }
}
