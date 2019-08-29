package com.brayanrondonh.family.service;

import com.brayanrondonh.family.dao.FamilyRepositoryBDM;
import com.brayanrondonh.family.dto.FamilyM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FamilyMServiceInterfaceImplement implements FamilyMServiceInterface
{
    @Autowired
    FamilyRepositoryBDM dao2;

    public FamilyM insertByFamilyM(FamilyM familyM)
    {
        return dao2.save(familyM);
    }

    public List<FamilyM> findAllFamilyM()
    {
        return dao2.findAll();
    }

    public FamilyM updateByFamilyM(FamilyM familyM)
    {
        return dao2.save(familyM);
    }

    public void deleteByFamilyM(String id)
    {
        dao2.deleteById(id);
    }
}
