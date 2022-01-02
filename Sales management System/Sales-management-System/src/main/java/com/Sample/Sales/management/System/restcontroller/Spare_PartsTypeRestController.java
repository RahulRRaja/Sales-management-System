package com.Sample.Sales.management.System.restcontroller;

import com.Sample.Sales.management.System.entity.Spare_Parts;
import com.Sample.Sales.management.System.entity.Spare_Parts_types;
import com.Sample.Sales.management.System.service.Spare_Parts_TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sparepartstype")
public class Spare_PartsTypeRestController {

    @Autowired
    private Spare_Parts_TypesService spare_parts_typesService;

    @PostMapping("/add")
    public Spare_Parts_types saveSpare_PartsTypes(@RequestBody Spare_Parts_types s)
    {
        spare_parts_typesService.CreateSparePartsTypes(s);
        return s;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<Spare_Parts_types> getAllSparePartsTypes()
    {
        List<Spare_Parts_types> list = spare_parts_typesService.getAllSparePartsTypes();
        return list;
    }
    @DeleteMapping("/delete")
    public void delete(Spare_Parts_types spare_parts_types)
    {
        spare_parts_typesService.deleteSparePartsTypes(spare_parts_types);
    }
    @DeleteMapping("/delete/{st_id}")
    public void deleteById(@PathVariable("st_id") Integer st_id)
    {
        spare_parts_typesService.deleteSparePartsTypesById(st_id);
    }
    @RequestMapping(value = "/get/{st_id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Spare_Parts_types getSparePartsTypeById(@PathVariable("st_id") Integer st_id)
    {
        return  spare_parts_typesService.getSparePartsTypes(st_id);
    }
    @PutMapping("/edit")
    public Spare_Parts_types editSpareParts(@RequestBody Spare_Parts_types s)
    {
        spare_parts_typesService.editSparePartsTypes(s);
        return s;
    }


}
