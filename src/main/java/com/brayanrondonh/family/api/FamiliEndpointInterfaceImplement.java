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

    @GetMapping(value = "/name/{name}")
    public List<Family> findFirstName(@PathVariable("name") String firstName)
    {
        return familyServInter.findByfirstName(firstName);
    }

    @GetMapping(value = "/dni/{dni}")
    public List<Family> findDni(@PathVariable("dni") String dni)
    {
        return familyServInter.findBydni(dni);
    }

    @GetMapping(value = "/email/{email}")
    public List<Family> findEmail(@PathVariable("email") String email)
    {
        return familyServInter.findByemail(email);
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
