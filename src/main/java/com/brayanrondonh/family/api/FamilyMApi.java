package com.brayanrondonh.family.api;

import com.brayanrondonh.family.dto.FamilyM;
import com.brayanrondonh.family.service.FamilyMServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/FamilyM")
public class FamilyMApi
{
    @Autowired
    FamilyMServiceInterface api;

    @PostMapping
    public FamilyM insertFamily(@RequestBody FamilyM familyM)
    {
        return api.insertByFamilyM(familyM);
    }

    @GetMapping
    public List<FamilyM> findAll()
    {
        return api.findAllFamilyM();
    }

    @PutMapping
    public FamilyM updateFamilyM(@RequestBody FamilyM familyM)
    {
        return api.updateByFamilyM(familyM);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteFamiliM(@PathVariable("id") String id)
    {
        api.deleteByFamilyM(id);
    }
}
