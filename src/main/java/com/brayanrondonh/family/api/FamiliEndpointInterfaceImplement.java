package com.brayanrondonh.family.api;

import com.brayanrondonh.family.dto.Family;
import com.brayanrondonh.family.service.FamilyServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/family")
public class FamiliEndpointInterfaceImplement
{
    @Autowired
    FamilyServiceInterface familyServInter;

    @PostMapping
    public void insert(@RequestBody Family family)
    {
        familyServInter.insertFamily(family);
    }

    @GetMapping
    public List<Family> findAll()
    {
        return familyServInter.findAllFamily();
    }

    @PutMapping
    public void update(@RequestBody Family family)
    {
        familyServInter.updateFamily(family);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") long id)
    {
        familyServInter.deleteFamily(id);
    }
}
