package com.Sample.Sales.management.System.restcontroller;

import com.Sample.Sales.management.System.Constants.TestConstants;
import com.Sample.Sales.management.System.entity.Spare_Parts;
import com.Sample.Sales.management.System.service.impl.Spare_PartServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class Spare_PartsRestControllerTest {

    @InjectMocks
    private Spare_PartsRestController spare_partsRestController;

    @Mock
    private Spare_PartServiceImpl service;

    private Spare_Parts spare_parts()
    {
        Spare_Parts spare_parts = new Spare_Parts();
        spare_parts.setSpare_parts_name(TestConstants.Spare_parts_name);
        spare_parts.setId(TestConstants.id);
        return spare_parts;
    }
    @Test
    void saveSpare_Parts() {
        try {
            spare_partsRestController.saveSpare_Parts(spare_parts());
        }
        catch (Exception e)
        {

        }
    }

    @Test
    void getAllSpareParts() {
        try {
            spare_partsRestController.getAllSpareParts(TestConstants.PAGE_NO,TestConstants.PAGE_SIZE);
        }
        catch (Exception e)
        {

        }
    }

    @Test
    void delete() {
        try {
            spare_partsRestController.delete(spare_parts());
        } catch (Exception e)
        {

        }
    }

    @Test
    void deleteById() {
        try {
            spare_partsRestController.deleteById(TestConstants.id);
        }catch (Exception e)
        {

        }
    }

    @Test
    void getUserById() {
        try {

            spare_partsRestController.getUserById(TestConstants.id);
        }catch (Exception e)
        {

        }
    }

    @Test
    void editUser() {
        try {
            spare_partsRestController.editUser(spare_parts());
        }catch (Exception e)
        {

        }
    }
}