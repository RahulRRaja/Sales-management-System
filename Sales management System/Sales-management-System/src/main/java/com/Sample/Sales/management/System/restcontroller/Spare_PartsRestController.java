package com.Sample.Sales.management.System.restcontroller;

import com.Sample.Sales.management.System.entity.Spare_Parts;
import com.Sample.Sales.management.System.entity.User;
import com.Sample.Sales.management.System.service.Spare_PartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spare_parts")
public class Spare_PartsRestController {

    @Autowired
    private Spare_PartsService spare_partsService;

    @RequestMapping(value = "/add", method = RequestMethod.POST, headers = "Accept=application/json")
    public Spare_Parts saveSpare_Parts(@RequestBody Spare_Parts s) throws InternalServerErrorException
    {
        spare_partsService.CreateSpareParts(s);
        return s;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<Spare_Parts> getAllSpareParts(@RequestParam(defaultValue = "0")Integer pageNo, @RequestParam(defaultValue = "20")Integer pageSize) throws InternalServerErrorException
    {
        List<Spare_Parts> list = spare_partsService.getAllSpareParts(pageNo,pageSize);
        return list;
    }
    @DeleteMapping("/delete")
    public void delete(Spare_Parts spare_parts) throws InternalServerErrorException
    {
        spare_partsService.deleteSpareParts(spare_parts);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Integer id) throws InternalServerErrorException
    {
        spare_partsService.deleteSparePartsById(id);
    }
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Spare_Parts getUserById(@PathVariable("id") Integer id) throws InternalServerErrorException
    {
        return  spare_partsService.getSpareParts(id);
    }
    @PutMapping("/edituser")
    public Spare_Parts editUser(@RequestBody Spare_Parts s) throws InternalServerErrorException
    {
        spare_partsService.editSpareParts(s);
        return s;
    }
     @RequestMapping(value = "/get/{Spare_parts_name}", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<Spare_Parts> getUserBySpareParts(@PathVariable String Spare_parts_name)
    {
        return  spare_partsService.getSparePartsByName(Spare_parts_name);
    }


}
